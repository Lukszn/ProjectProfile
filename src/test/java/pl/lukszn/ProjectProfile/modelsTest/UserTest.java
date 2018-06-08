package pl.lukszn.ProjectProfile.modelsTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import pl.lukszn.ProjectProfile.models.User;

public class UserTest {
	
	private static final String LOGIN = "login"; 
	private static final String PASSWORD = "password";
	private static final String EMAIL = "email@email.email";
	
	@Test
	public void create() {
		final User user = User.of(LOGIN, PASSWORD, EMAIL);
		assertThat(user.getLogin()).isEqualTo(LOGIN);
		assertThat(user.getPassword()).isEqualTo(PASSWORD);
		assertThat(user.getEmail()).isEqualTo(EMAIL);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createEmptyLogin() {
		User.of("", PASSWORD, EMAIL);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createNullLogin() {
		User.of(null, PASSWORD, EMAIL);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createEmptyPassword() {
		User.of(LOGIN, "", EMAIL);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createNullPassword() {
		User.of(LOGIN, null, EMAIL);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createEmptyEmail() {
		User.of(LOGIN, PASSWORD , "");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createNullEmail() {
		User.of(LOGIN, PASSWORD, null);
	}
	
}  
