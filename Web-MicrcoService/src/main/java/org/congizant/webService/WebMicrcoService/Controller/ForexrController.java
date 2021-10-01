package org.congizant.webService.WebMicrcoService.Controller;

import org.congizant.webService.WebMicrcoService.ExchangeRepository.ExchangeRepository;
import org.congizant.webService.WebMicrcoService.ExchangeValue.ExachangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexrController {
	@GetMapping("/")
	public String print() {
		return "Good Morning Guys";
	}
	
	@Autowired
	private ExchangeRepository repository;
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/")
	public ExachangeValue retriveExachangeValue(
			@PathVariable String from, @PathVariable String to) {
		ExachangeValue exachangeValue = repository.findByFromAndTo(from, to);
		
		exachangeValue.setPort(
				Integer.parseInt(environment.getProperty("local.server.port")));
		return exachangeValue;
	}
}
