package org.congizant.MicroServiceProject.MicroServiceProject.limitConfiguration;

public class LimitConfiguration {
	
	private int maximum;
	private int minimum;
	
	private LimitConfiguration() {
		
	}
	
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public int getMaximum() {
		return maximum;
	}
	public int getminimum() {
		return minimum;
	}
}
