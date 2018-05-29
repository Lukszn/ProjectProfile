package pl.lukszn.ProjectProfile.controllers;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import pl.lukszn.ProjectProfile.models.User;
import pl.lukszn.ProjectProfile.repositories.UserRepository;


@Controller
public class HomeController {
	
	@Autowired
	UserRepository userRepository;
	
	
	
	@RequestMapping("/")
	public String loginRegister(HttpSession session, Model model) {
		if(session.getAttribute("user_id")!=null) {
			return "index";
		}else {
			User user = new User();
			model.addAttribute("user",user);
			return "login";
		}
	}
	
	@RequestMapping("/login")
	public String login(Model model, @RequestParam String login, @RequestParam String password, HttpSession session) {
		String wrong = "";
		try {
			User user = userRepository.findByLogin(login);
			if (BCrypt.checkpw(password, user.getPassword())) {
				session.setAttribute("user_id", user.getId());
				session.setAttribute("user_permission", user.getPermission());
				return "redirect:./";
			} else {
				wrong = "WRONG PASSWORD!!";
			} 
		} catch (NullPointerException e) {
			wrong = "WRONG LOGIN!!";
		}
			User user = new User();
			model.addAttribute("user", user);
			model.addAttribute("wrong", wrong);
			return "login";

	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerGET() {
		return "redirect:/";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUser(@Valid User user, BindingResult result, Model model, HttpSession session) {

		if(result.hasErrors()) {
			return "login";
		}
		
		String password = user.getPassword();
		String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		user.setPassword(hashedPassword);
		user.setPermission("user");
		userRepository.save(user);
		session.setAttribute("user_id", user.getId());
		session.setAttribute("user_permission", user.getPermission());
		String message = "Witaj " + user.getLogin() + "! Rozpocznij tworzenie profilu jakiego jeszcze nikt nie widział ";
		model.addAttribute("message", message);
			return "index";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user_id");
		session.removeAttribute("user_permission");
		return "redirect:./";
	}
	
	@RequestMapping("/admin")
	public String adminPanel() {
		return "adminPanel";
	}
	
	@RequestMapping("/not_permission")
	public String notPermission() {
		return "/errors/notAccess";
	}
}
