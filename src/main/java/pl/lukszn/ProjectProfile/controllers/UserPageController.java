package pl.lukszn.ProjectProfile.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.entities.WordGroup;
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

	
}
