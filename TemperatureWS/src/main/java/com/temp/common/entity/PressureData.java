package com.temp.common.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PressureData {
	private String pressure;
	private String sea_level;
	private String grnd_level;
	private String humidity;

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getSea_level() {
		return sea_level;
	}

	public void setSea_level(String sea_level) {
		this.sea_level = sea_level;
	}

	public String getGrnd_level() {
		return grnd_level;
	}

	public void setGrnd_level(String grnd_level) {
		this.grnd_level = grnd_level;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
}
