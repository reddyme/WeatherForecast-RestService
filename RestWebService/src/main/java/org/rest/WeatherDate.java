package org.rest;

public class WeatherDate {
	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString()
	{
		return "date:"+date;
	}
	
}
