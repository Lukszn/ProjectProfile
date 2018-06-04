package pl.lukszn.ProjectProfile.controllers;

import java.util.List;

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


import pl.lukszn.ProjectProfile.models.UserModel;

import pl.lukszn.ProjectProfile.repositories.UserRepository;


@Controller
@RequestMapping("/admin/user")
public class UserController {

	
	@Autowired
	UserRepository userRepository;
	
	
	@ModelAttribute(name = "users")
	public List<UserModel> getUsers(){
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUserForm(Model model) {
		UserModel user = new UserModel();
		model.addAttribute("user", user);
		return "addUserForm";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute UserModel user, Model model, HttpSession session) {
		String password = user.getPassword();
		String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		user.setPassword(hashedPassword);
		userRepository.save(user);
		
		if(session.getAttribute("user_id")!=null) {
			model.addAttribute("addedUser", user);
			user = new UserModel();
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
		UserModel user = userRepository.findOne(id);
		model.addAttribute("user",user);
		return "editUserForm";
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String editUser(@ModelAttribute UserModel user, @PathVariable long id, @RequestParam String permission) {
		UserModel userToUpdate = userRepository.findOne(id);
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
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable long id) {
		UserModel user = userRepository.findOne(id);
		userRepository.delete(user);
		return "redirect:/admin/user/delete";
	}

}
