package pl.lukszn.ProjectProfile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.lukszn.ProjectProfile.models.User;

public interface UserRepository extends JpaRepository <User, Long> {

	User findByLogin(String login);
	
}
