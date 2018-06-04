package pl.lukszn.ProjectProfile.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "users")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(unique = true)
	@NotBlank
	@Size(min=4,max=20)
	private String login;
	@NotBlank
	private String password;
	@Column(unique = true)
	@Email
	@NotBlank
	private String email;
	private String permission;

	public UserModel(String login, String password, String email) {
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public UserModel() {
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permissions) {
		this.permission = permissions;
	}

}
