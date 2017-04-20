package org.rest;

public class Weather {
	
	private String weatherDate;
	private float tmin;
	private float tmax;
	
	public String getDate() {
		return weatherDate;
	}
	public void setDate(String weatherDate) {
		this.weatherDate = weatherDate;
	}
	public float getTmin() {
		return tmin;
	}
	public void setTmin(float tmin) {
		this.tmin = tmin;
	}
	public float getTmax() {
		return tmax;
	}
	public void setTmax(float tmax) {
		this.tmax = tmax;
	}

	public String toString()
	{
		return "Date: "+weatherDate+"Tmax: "+tmax+"Tmin: "+tmin;
	}
}
