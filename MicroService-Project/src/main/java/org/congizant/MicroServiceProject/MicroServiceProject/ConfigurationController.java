package org.congizant.MicroServiceProject.MicroServiceProject;

import java.util.Arrays;
import java.util.List;

import org.congizant.MicroServiceProject.MicroServiceProject.Configuration.Configuration;
import org.congizant.MicroServiceProject.MicroServiceProject.Course.Course;
import org.congizant.MicroServiceProject.MicroServiceProject.bean.Name;
import org.congizant.MicroServiceProject.MicroServiceProject.limitConfiguration.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigurationController {
	
	//Object created // new // object holds tight
	//SB <--- LC <--- Object is freed <-- public
	// DI <--- @Component <--- @Autowired <-- object
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/api/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"Learn Microservice","Sachin Anil"));
		
	}
	@GetMapping("/info")
	public List <Name>person_info(){
		return Arrays.asList(new Name("Sachin","Anil"));
	}
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(),
				configuration.getMinimum());
	}

}
