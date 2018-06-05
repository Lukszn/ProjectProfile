package pl.lukszn.ProjectProfile.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.lukszn.ProjectProfile.models.User;
import pl.lukszn.ProjectProfile.repositories.UserRepository;

public class UserConverter implements Converter<String, User>{

	@Autowired
	UserRepository userRepository;
	
	public User convert(String source) {
		User user = userRepository.findOne(Long.parseLong(source));
		return user;
	}
	
}
