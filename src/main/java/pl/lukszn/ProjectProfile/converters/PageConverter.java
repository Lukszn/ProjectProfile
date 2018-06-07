package pl.lukszn.ProjectProfile.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.lukszn.ProjectProfile.models.Page;
import pl.lukszn.ProjectProfile.repositories.PageRepository;

public class PageConverter implements Converter<String, Page>{

	@Autowired
	PageRepository pageRepository;
	
	public Page convert(String source) {
		Page page = pageRepository.findOne(Long.parseLong(source));
		return page;	
	}

}
