package pl.lukszn.ProjectProfile.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.lukszn.ProjectProfile.models.Page;


public interface PageRepository extends JpaRepository <Page, Long> {
	
	@Query("Select p from Page p where p.userPage.id =:userPageId")
	List<Page> findByUserPageId(@Param("userPageId") long id);

}
