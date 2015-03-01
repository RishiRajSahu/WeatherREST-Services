package com.temp.common.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection="weather")
public class WeatherData {

	private String id;
	private String name;
	private String cod;
	private TemperatureData main;
	private Location coord;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public TemperatureData getMain() {
		return main;
	}

	public void setMain(TemperatureData main) {
		this.main = main;
	}

	public Location getCoord() {
		return coord;
	}

	public void setCoord(Location coord) {
		this.coord = coord;
	}
}
