package org.congizant.webService.Dbservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.congizant.webService.Dbservice.model.Quote;
import org.congizant.webService.Dbservice.repository.QuoteRespository;
import org.congizant.webService.Dbservice.resource.model.Quotes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/db") 
public class DbserviceResource {
	
	private QuoteRespository  quoteRespority;
	
	public DbserviceResource(QuoteRespository  quoteRespority) {
		this.quoteRespority = quoteRespority;
	}
	
	@GetMapping("/{username}")
	public List<String> getQuotes(@PathVariable("username") 
								 final String username){
		return quoteRespority.findByUserName(username) //Java-8 --> stream-api
		.stream()
		.map(Quote::getQuote)
		.collect(Collectors.toList());
		}
	@PostMapping("/add")
	public List<String> add(@RequestBody final Quotes quotes ){
		
		
		return add(quotes);
		
	}
	
}
