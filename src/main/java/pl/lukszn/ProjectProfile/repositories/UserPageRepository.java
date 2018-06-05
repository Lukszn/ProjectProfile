package pl.lukszn.ProjectProfile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.lukszn.ProjectProfile.models.UserPage;



public interface UserPageRepository extends JpaRepository <UserPage, Long> {

}
