package com.temp.common.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TemperatureData {
	private String temp;
	private String temp_min;
	private String temp_max;

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(String temp_min) {
		this.temp_min = temp_min;
	}

	public String getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(String temp_max) {
		this.temp_max = temp_max;
	}
}
