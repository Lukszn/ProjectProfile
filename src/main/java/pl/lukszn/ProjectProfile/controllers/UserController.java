package pl.lukszn.ProjectProfile.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.lukszn.ProjectProfile.models.User;
import pl.lukszn.ProjectProfile.repositories.AccountRepository;

import pl.lukszn.ProjectProfile.repositories.UserRepository;


@Controller
@RequestMapping("/admin/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AccountRepository accountRepository;

		
	@ModelAttribute(name = "users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUserForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "addUserForm";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user, Model model, HttpSession session) {
		String password = user.getPassword();
		String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		user.setPassword(hashedPassword);
		userRepository.save(user);
		if(session.getAttribute("user_id")!=null) {
			model.addAttribute("addedUser", user);
			user = new User();
			model.addAttribute("user", user);
			return "addUserForm";
		}else {
			session.setAttribute("user_id", user.getId());
			session.setAttribute("user_permission", "user");
			String message = "Witaj " + user.getLogin() + "! Twoja rejestracja przebiegła pomyślnie.";
			model.addAttribute("message", message);
			return "index";
		}	
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String editUserForm(Model model, @PathVariable long id) {
		User user = userRepository.findOne(id);
		model.addAttribute("user",user);
		
		return "editUserForm";
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String editUser(@ModelAttribute User user, @PathVariable long id, @RequestParam String permission) {
		User userToUpdate = userRepository.findOne(id);
		userToUpdate.setLogin(user.getLogin());
		userToUpdate.setPermission(permission);
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setEmail(user.getEmail());
		userRepository.save(userToUpdate);
		return "redirect:/admin/user/editlist";
	}
	

	@RequestMapping("/read/{id}")
	public String read(@PathVariable long id) {
		return userRepository.findOne(id).toString();
	}

	@RequestMapping("/delete")
	public String deleteUser(Model model) {
		return "deleteUser";
	}

	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable long id) {
		User user = userRepository.findOne(id);
		userRepository.delete(user);
		return "redirect:/admin/user/delete";
	}
}
