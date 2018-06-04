package pl.lukszn.ProjectProfile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.lukszn.ProjectProfile.models.UserPageModel;

public interface UserPageRepository extends JpaRepository<UserPageModel, Long>{
	
	UserPageModel findById(Long id);

}
