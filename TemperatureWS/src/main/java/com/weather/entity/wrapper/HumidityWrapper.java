package com.weather.entity.wrapper;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

import com.weather.common.entity.CloudsData;
import com.weather.common.entity.HumidityData;
import com.weather.common.entity.Location;
import com.weather.common.entity.PressureData;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "weather")
// specifying the target collection
public class HumidityWrapper {

	private String id;
	private String name;
	private String cod;
	private String timeStamp;
	private String serviceType;
	private HumidityData main;
	private CloudsData clouds;
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

	public HumidityData getMain() {
		return main;
	}

	public void setMain(HumidityData main) {
		this.main = main;
	}

	public CloudsData getClouds() {
		return clouds;
	}

	public void setClouds(CloudsData clouds) {
		this.clouds = clouds;
	}

	public Location getCoord() {
		return coord;
	}

	public void setCoord(Location coord) {
		this.coord = coord;
	}
}
