package pl.lukszn.ProjectProfile.converters;

import org.springframework.beans.factory.annotation.Autowired;

import pl.lukszn.ProjectProfile.models.Member;
import pl.lukszn.ProjectProfile.repositories.MemberRepository;

public class MemberConverter {

	@Autowired
	MemberRepository memberRepository;
	
	public Member convert(String source) {
		Member member = memberRepository.findOne(Long.parseLong(source));
		return member;
	}
	
}
