package pl.lukszn.ProjectProfile.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.lukszn.ProjectProfile.models.UserModel;
import pl.lukszn.ProjectProfile.repositories.UserRepository;

public class UserConverter implements Converter<String, UserModel>{

	@Autowired
	UserRepository userRepository;
	
	public UserModel convert(String source) {
		UserModel user = userRepository.findOne(Long.parseLong(source));
		return user;
	}
	
}
