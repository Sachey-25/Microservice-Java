package org.congizant.webService.Dbservice.repository;

import java.util.List;

import org.congizant.webService.Dbservice.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRespository extends JpaRepository<Quote,Integer>{

	List<Quote> findByUserName(String username);

}
