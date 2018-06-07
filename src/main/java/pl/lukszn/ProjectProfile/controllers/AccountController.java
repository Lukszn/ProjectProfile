package pl.lukszn.ProjectProfile.controllers;

import java.util.List;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.lukszn.ProjectProfile.models.User;

import pl.lukszn.ProjectProfile.models.Account;
import pl.lukszn.ProjectProfile.repositories.AccountRepository;
import pl.lukszn.ProjectProfile.repositories.UserRepository;

@Controller
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	@RequestMapping(method = RequestMethod.GET, value ="addAccount")
	public String addAccount(Model model) {
		Account account = new Account();
		model.addAttribute("account", account);
		
		return "addAccount";
	}

	@RequestMapping(method = RequestMethod.POST, value ="addAccount")
	public String addAccount(@ModelAttribute Account account, HttpSession session) {
		User user = userRepository.findOne((Long) session.getAttribute("user_id"));
		account.setIfBasicAccount(false);
		account.setUser(user);
		accountRepository.save(account);
		return "redirect:/accounts";
	}
	
	@RequestMapping("/accounts")
	public String accountList(Model model, HttpSession ses) {
		long user_Id = (Long) ses.getAttribute("user_id");
		List<Account> accounts = accountRepository.findUserAccount(user_Id);
		model.addAttribute("accounts", accounts);
		return "accounts";
	}
}
