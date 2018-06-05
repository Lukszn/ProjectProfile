package pl.lukszn.ProjectProfile.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.lukszn.ProjectProfile.models.Page;
import pl.lukszn.ProjectProfile.models.User;
import pl.lukszn.ProjectProfile.models.UserPage;
import pl.lukszn.ProjectProfile.repositories.PageRepository;
import pl.lukszn.ProjectProfile.repositories.UserPageRepository;
import pl.lukszn.ProjectProfile.repositories.UserRepository;

@Controller
@RequestMapping("/admin/page")
public class PageController {
	
	@Autowired
	PageRepository pageRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserPageRepository userPageRepository;
	

	@ModelAttribute(name = "usersPages")
	public List<UserPage> getUsersPages(){
		return userPageRepository.findAll();
	}
	
	@ModelAttribute(name = "users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@ModelAttribute(name = "pages")
	public List<Page> getPages(){
		return pageRepository.findAll();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addPageForm(Model model) {
		Page page = new Page();
		model.addAttribute("page", page);
		return "addPageForm";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addWord(@ModelAttribute Page page, Model model) {
		pageRepository.save(page);
		page.getUserPage().setLastUpdate(new Date());
		userPageRepository.save(page.getUserPage());
		model.addAttribute("addedPage", page);
		page = new Page();
		model.addAttribute("page", page);
		return "addPageForm";
	} 
//	@RequestMapping("/editlist")
//	public String editPageList(Model model) {
//		return "usersPageList";
//	}
//	
//	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
//	public String editPageForm(Model model, @PathVariable long id) {
//		Page page = pageRepository.findOne(id);
//		model.addAttribute("page",page);
//		return "editPageForm";
//	}
	
	@RequestMapping("/read/{id}")
	public String read(@PathVariable long id) {
		return pageRepository.findOne(id).toString();
	}
}
