package org.congizant.webService.WebMicrcoService.ExchangeValue;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExachangeValue {
	
	@Id
	private long id; 
	@Column(name ="currency_from")
	private String from;

	@Column(name ="currency_to")
	private String to;
	
	private BigDecimal conversionMultiple;
	
	private int port;
	
	public ExachangeValue() {
		
	}	
	public ExachangeValue(long id, String from, String to, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.port = port;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return from;
	}
	public void setName(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

}
