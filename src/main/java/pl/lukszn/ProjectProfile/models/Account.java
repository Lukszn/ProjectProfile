package pl.lukszn.ProjectProfile.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	private int phoneNumber;
	
	private String education;
	
	private String experience;
	
	private String abilities;
	
	private String interests;
	
	private String projects;
	
	private String aboutMe;
	
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAbilities() {
		return abilities;
	}

	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
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
