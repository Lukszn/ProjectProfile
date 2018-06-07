package pl.lukszn.ProjectProfile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.lukszn.ProjectProfile.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
