package pl.lukszn.ProjectProfile.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import pl.lukszn.ProjectProfile.models.Account;
import pl.lukszn.ProjectProfile.models.User;


public interface AccountRepository extends JpaRepository<Account, Long> {
	
	@Query(value = "select * from accounts where user_id =:userId", nativeQuery = true)
	List<Account> findUserAccounts(@Param("userId") long userId);
}
