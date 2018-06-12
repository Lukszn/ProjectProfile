package pl.lukszn.ProjectProfile.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.lukszn.ProjectProfile.models.Account;
import pl.lukszn.ProjectProfile.models.Member;
import pl.lukszn.ProjectProfile.repositories.AccountRepository;
import pl.lukszn.ProjectProfile.repositories.MemberRepository;
import pl.lukszn.ProjectProfile.repositories.UserRepository;

@Controller
@RequestMapping("/members")
public class MemberController {

	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	@RequestMapping(method = RequestMethod.GET, value ="addMember")
	public String addMember(Model model) {
		Member member = new Member();
		model.addAttribute("member", member);
		
		return "addMember";
	}

	@RequestMapping(method = RequestMethod.POST, value ="addMember")
	public String addMember(@ModelAttribute Member member, HttpSession session) {
		memberRepository.save(member);
		return "redirect:/members";
	}
	
	@RequestMapping("/members")
	public String membersList(Model model, HttpSession ses) {
		List<Member> members = memberRepository.findAll();
		model.addAttribute("members", members);
		return "members";
	}
	
}
