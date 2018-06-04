package pl.lukszn.ProjectProfile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.lukszn.ProjectProfile.models.UserModel;

public interface UserRepository extends JpaRepository <UserModel, Long> {

	UserModel findByLogin(String login);
	
}
