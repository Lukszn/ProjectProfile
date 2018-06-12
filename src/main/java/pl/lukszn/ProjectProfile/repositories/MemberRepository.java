package pl.lukszn.ProjectProfile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.lukszn.ProjectProfile.models.Member;

public interface MemberRepository extends JpaRepository <Member, Long>{
	

}
