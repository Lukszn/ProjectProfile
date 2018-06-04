package pl.lukszn.ProjectProfile.controllers;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.lukszn.ProjectProfile.models.UserPageModel;
import pl.lukszn.ProjectProfile.repositories.UserPageRepository;
import pl.lukszn.ProjectProfile.repositories.UserRepository;


@Controller
@RequestMapping("/admin/userPage")
public class UserPageController {
	
	@Autowired
	UserPageRepository userPageRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUserPageForm(Model model, HttpSession ses) {
		UserPageModel newUserPageModel = new UserPageModel();
		model.addAttribute("userPageModel", newUserPageModel);
		return "addUserPageForm";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUserPageModel(@ModelAttribute UserPageModel userPageModel, Model model) {
		userPageRepository.save(userPageModel);
		return "addUserPageForm";
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String editUserPageForm(Model model, @PathVariable long id) {
		UserPageModel userPageModel = userPageRepository.findOne(id);
		model.addAttribute("userPageModel", userPageModel);
		return "editUserPageModelForm";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String editUserPageModel(@ModelAttribute UserPageModel userPageModel, @PathVariable long id) {
		UserPageModel pageToUpdate = userPageRepository.findOne(id);
		pageToUpdate.setTitle(userPageModel.getTitle());
		pageToUpdate.setFirstName(userPageModel.getFirstName());
		pageToUpdate.setLastName(userPageModel.getLastName());
		pageToUpdate.setBirthdate(userPageModel.getBirthdate());
		pageToUpdate.setPhoneNumber(userPageModel.getPhoneNumber());
		pageToUpdate.setEducation(userPageModel.getEducation());
		pageToUpdate.setExperience(userPageModel.getExperience());
		pageToUpdate.setAbilities(userPageModel.getAbilities());
		pageToUpdate.setInterests(userPageModel.getInterests());
		pageToUpdate.setProjects(userPageModel.getProjects());
		pageToUpdate.setAboutUser(userPageModel.getAboutUser());
		userPageRepository.save(pageToUpdate);
		return "redirect:/admin/userPage";
	}
	
	@RequestMapping("/delete")
	public String deleteUserPageModel(Model model) {
		return "deleteUserPageModel";
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable long id) {
		UserPageModel userPageModel = userPageRepository.findOne(id);
		userPageRepository.delete(userPageModel);
		return "redirect:/admin/word/delete";
	}
	
	@RequestMapping("/read/{id}")
	public String read(@PathVariable long id) {
		return userPageRepository.findOne(id).toString();
	}
	
}
