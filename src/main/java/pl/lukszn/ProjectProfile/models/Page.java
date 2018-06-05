package pl.lukszn.ProjectProfile.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


public class Page {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "title", length = 50, unique = true, nullable = false)
	@NotEmpty
	private String title;
	
	@Column(name = "firstName", length = 25, nullable = false)
	@NotBlank
	private String firstName;
	
	@Column(name = "lastName", length = 30, nullable = false)
	@Pattern(regexp = "[a-zA-z\\-]+")
	@NotBlank
	private String lastName;
	
	@NotBlank
	@Type(type="date")
	private Date birthdate;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "education")
	private String education;
	
	@Column(name = "experience")
	private String experience;
	
	@Column(name = "abilities")
	private String abilities;
	
	@Column(name = "interests")
	private String interests;
	
	@Column(name = "projects")
	private String projects;
	
	@Column(name = "aboutUser")
	private String aboutUser;
	
	@ManyToOne
	private UserPage userPage;
	
	public Page(String title, String firstName, String lastName, Date birthdate, String phoneNumber,
			String education, String experience, String abilities, String interests, String projects,
			String aboutUser, UserPage userPage) {
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
		this.education = education;
		this.experience = experience;
		this.abilities = abilities;
		this.interests = interests;
		this.projects = projects;
		this.aboutUser = aboutUser;
		this.userPage = userPage;
	}
	
	public Page() {
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
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

	public String getAboutUser() {
		return aboutUser;
	}

	public void setAboutUser(String aboutUser) {
		this.aboutUser = aboutUser;
	}

	public UserPage getUserPage() {
		return userPage;
	}

	public void setUserPage(UserPage userPage) {
		this.userPage = userPage;
	}
	
	

}