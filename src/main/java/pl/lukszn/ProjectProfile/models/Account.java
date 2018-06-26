package pl.lukszn.ProjectProfile.models;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "accounts")
public class Account {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private boolean ifBasicAccount;
	
	private String accTitle;
	
	private String accFirstName;
	
	private String accLastName;
	
	private String accBirthdate;
	
	private String accPhoneNumber;
	
	private String accEducation;
	
	private String accExperience;
	
	private String accAbilities;
	
	private String accInterests;
	
	private String accProjects;
	
	private String accDescription;
	
	@Lob
	private byte[] accPicture;
	
	private String base64;
	
	
	
	@ManyToOne
	private User user;

	
	public Account() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccTitle() {
		return accTitle;
	}

	public void setAccTitle(String accTitle) {
		this.accTitle = accTitle;
	}


	public String getAccFirstName() {
		return accFirstName;
	}

	public void setAccFirstName(String accFirstName) {
		this.accFirstName = accFirstName;
	}

	public String getAccLastName() {
		return accLastName;
	}

	public void setAccLastName(String accLastName) {
		this.accLastName = accLastName;
	}

	public String getAccBirthdate() {
		return accBirthdate;
	}

	public void setAccBirthdate(String accBirthdate) {
		this.accBirthdate = accBirthdate;
	}

	public String getAccPhoneNumber() {
		return accPhoneNumber;
	}

	public void setAccPhoneNumber(String accPhoneNumber) {
		this.accPhoneNumber = accPhoneNumber;
	}

	public String getAccEducation() {
		return accEducation;
	}

	public void setAccEducation(String accEducation) {
		this.accEducation = accEducation;
	}

	public String getAccExperience() {
		return accExperience;
	}

	public void setAccExperience(String accExperience) {
		this.accExperience = accExperience;
	}

	public String getAccAbilities() {
		return accAbilities;
	}

	public void setAccAbilities(String accAbilities) {
		this.accAbilities = accAbilities;
	}

	public String getAccInterests() {
		return accInterests;
	}

	public void setAccInterests(String accInterests) {
		this.accInterests = accInterests;
	}

	public String getAccProjects() {
		return accProjects;
	}

	public void setAccProjects(String accProjects) {
		this.accProjects = accProjects;
	}


	public String getAccDescription() {
		return accDescription;
	}

	public void setAccDescription(String accDescription) {
		this.accDescription = accDescription;
	}
	

	public byte[] getAccPicture() {
		return accPicture;
	}

	public void setAccPicture(byte[] accPicture) {
		this.accPicture = accPicture;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isIfBasicAccount() {
		return ifBasicAccount;
	}

	public void setIfBasicAccount(boolean ifBasicAccount) {
		this.ifBasicAccount = ifBasicAccount;
	}
	
	
	
}
