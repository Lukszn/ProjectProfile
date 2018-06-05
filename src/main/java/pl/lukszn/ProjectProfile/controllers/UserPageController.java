package pl.lukszn.ProjectProfile.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.lukszn.ProjectProfile.models.User;
import pl.lukszn.ProjectProfile.models.UserPage;
import pl.lukszn.ProjectProfile.repositories.UserPageRepository;
import pl.lukszn.ProjectProfile.repositories.UserRepository;

@Controller
@RequestMapping("/admin/userPage")
public class UserPageController {
	
	@Autowired
	UserPageRepository userPageRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@ModelAttribute(name = "groups")
	public List<UserPage> getUserPages(){
		return userPageRepository.findAll();
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUserPageForm(Model model) {
		UserPage userPage = new UserPage();
		model.addAttribute("userPage", userPage);
		return "addUserPageForm";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPage(@ModelAttribute UserPage userPage, Model model, HttpSession session) {
		User user = userRepository.findOne((Long) session.getAttribute("user_id"));
		Date date = new Date();
		userPage.setCreated(date);
		userPage.setLastUpdate(date);
		userPage.setUser(user);
		userPageRepository.save(userPage);
		model.addAttribute("addedWordGroup", userPage);
		userPage = new UserPage();
		model.addAttribute("userPage", userPage);
		return "addUserPageForm";
	}
	
	@RequestMapping("/top10Pages")
	public String top10Pages(Model model,HttpSession session) {
		List<UserPage> userPages = userPageRepository.findAll();
		model.addAttribute("userPages", userPages);
		return "top10Pages";
	}
}
