package com.weather.common.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CloudsData {
	String all;

	public String getAll() {
		return all;
	}

	public void setAll(String all) {
		this.all = all;
	}
}
