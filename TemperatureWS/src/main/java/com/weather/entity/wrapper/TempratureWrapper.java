package com.weather.entity.wrapper;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

import com.weather.common.entity.Location;
import com.weather.common.entity.TemperatureData;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "weather")
// specifying the target collection
public class TempratureWrapper {

	private String id;
	private String name;
	private String cod;
	private String timeStamp;
	private String serviceType;
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

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
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
