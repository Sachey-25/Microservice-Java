package org.congizant.webService.WebMicrcoService.ExchangeRepository;

import org.congizant.webService.WebMicrcoService.ExchangeValue.ExachangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<ExachangeValue, Long>{
	
	ExachangeValue findByFromAndTo(String from, String to);

}
