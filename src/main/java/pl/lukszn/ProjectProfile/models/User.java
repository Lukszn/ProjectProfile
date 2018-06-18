package pl.lukszn.ProjectProfile.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;



@Entity
@Table(name = "users")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	@OneToMany()
	private List<Account> accounts;
	
	
		

	public User(final String login, final String password, final String email) {
		Preconditions.checkArgument(!Strings.isNullOrEmpty(login));
		Preconditions.checkArgument(!Strings.isNullOrEmpty(password));
		Preconditions.checkArgument(!Strings.isNullOrEmpty(email));
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public User() {
	}

	public String getLogin() {
		return Strings.nullToEmpty(login);
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return Strings.nullToEmpty(password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return Strings.nullToEmpty(email);
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

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}


	@Override
	public String toString() {
		return com.google.common.base.Objects.toStringHelper(this)
				.add("login", login)
				.add("email", email)
				.add("password", password)
				.toString();
	}

	public static User of(String login, String password, String email) {
		// TODO Auto-generated method stub
		return new User(login, password, email);
	}
	
	@Override
	public boolean equals(final Object rightSide) {
		if(!(rightSide instanceof User)) return false;
		final User that = (User) rightSide;
		return(this==that) || (
				getLogin().equals(that.getLogin()) &&
				getEmail().equals(that.getEmail()) &&
				getPassword().equals(that.getPassword())
						);
	}
	
	@Override
	public int hashCode() {
		return getLogin().hashCode() + getEmail().hashCode() + getPassword().hashCode();
	}
	
	
	
	
}
