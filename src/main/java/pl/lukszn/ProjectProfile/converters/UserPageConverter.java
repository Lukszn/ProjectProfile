package pl.lukszn.ProjectProfile.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.lukszn.ProjectProfile.models.UserPageModel;
import pl.lukszn.ProjectProfile.repositories.UserPageRepository;


public class UserPageConverter  implements Converter<String, UserPageModel>{
	
	@Autowired
	private UserPageRepository userPageRepository;
	
	public UserPageModel convert(String source) {
		UserPageModel userPageModel = userPageRepository.findOne(Long.parseLong(source));
		return userPageModel;
	}
}
