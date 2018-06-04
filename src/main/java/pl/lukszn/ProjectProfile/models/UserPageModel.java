package pl.lukszn.ProjectProfile.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "userPage")
public class UserPageModel {
	
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
	@Pattern(regexp = "^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)"
			+ "(?:29|30)\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3(?:(?:(?:1[6-9]|[2-9]\\d)"
			+ "?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)"
			+ "(?:0?[1-9]|1\\d|2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")
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
		
	

}
