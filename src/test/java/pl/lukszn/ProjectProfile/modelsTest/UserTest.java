package pl.lukszn.ProjectProfile.modelsTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import pl.lukszn.ProjectProfile.models.User;

public class UserTest {
	
	private static final String login = "login"; 
	private static final String password = "password";
	private static final String email = "email@email.email";
	
	@Test
	public void create() {
		final User user = User.of(login, password, email);
		assertThat(user.getLogin()).isEqualTo(login);
		assertThat(user.getPassword()).isEqualTo(password);
		assertThat(user.getEmail()).isEqualTo(email);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createEmptyLogin() {
		User.of("", password, email);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createNullLogin() {
		User.of(null, password, email);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createEmptyPassword() {
		User.of(login, "", email);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createNullPassword() {
		User.of(login,null, email);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createEmptyEmail() {
		User.of(login, password, "");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createNullEmail() {
		User.of(login, password, null);
	}
	
}  
