package pl.lukszn.ProjectProfile.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.lukszn.ProjectProfile.models.UserPage;
import pl.lukszn.ProjectProfile.repositories.UserPageRepository;

public class UserPageConventer implements Converter<String, UserPage>{

	@Autowired
	UserPageRepository userPageRepository;
	
	public UserPage convert(String source) {
		UserPage userPage = userPageRepository.findOne(Long.parseLong(source));
		return userPage;
	}

}
