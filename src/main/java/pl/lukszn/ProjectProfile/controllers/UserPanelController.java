package pl.lukszn.ProjectProfile.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.lukszn.ProjectProfile.models.UserPageModel;
import pl.lukszn.ProjectProfile.repositories.UserPageRepository;
import pl.lukszn.ProjectProfile.repositories.UserRepository;


public class UserPanelController {
	
	@Autowired
	UserRepository userRepository;

	@Autowired
	UserPageRepository userPageRepository;

	
	@RequestMapping(value = "/add_userPageModel", method = RequestMethod.GET)
	public String addUserPageModelGET(Model model, HttpSession session, @PathVariable long id) {
		UserPageModel userPageModel = new UserPageModel();
		model.addAttribute("userPageModel", userPageModel);
		return "userAddPageModel";
	}
	
	@RequestMapping(value = "/add_userPageModel", method = RequestMethod.POST)
	public String addUserPageModelPOST(@PathVariable long id, @ModelAttribute UserPageModel userPageModel, Model model) {
		
		userPageRepository.save(userPageModel);
		return "userAddPageModel";
	}
	
}
