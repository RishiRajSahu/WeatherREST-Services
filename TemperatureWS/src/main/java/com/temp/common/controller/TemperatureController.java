package com.temp.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.temp.common.dao.BaseDAO;
import com.temp.common.entity.WeatherData;

@Controller
@RequestMapping("/temp")
public class TemperatureController {
	
@Autowired
private BaseDAO baseDAO;

	@RequestMapping(value = "/accessWeather", method = RequestMethod.GET)
	public @ResponseBody WeatherData accessWeatherApi(HttpServletRequest request) {
 	    String country = request.getParameter("country");
 	    String city = request.getParameter("city");
 	    String url = "http://api.openweathermap.org/data/2.5/weather?q="+city+","+country;
 	    System.out.println("city:"+city+"country:"+country);
		RestTemplate restTemplate = new RestTemplate();
        WeatherData data = restTemplate.getForObject(url, WeatherData.class);
        baseDAO.saveCollection(data);
        System.out.println("Name1:    " + data.getName());
        System.out.println("About:   " + data.getId());
        System.out.println("Phone:   " + data.getCod());
        System.out.println("Temp:   " + data.getMain().getTemp());
        return data;
 
	}

	public BaseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(BaseDAO baseDAO) {
        System.out.println("setBaseDAO:   ");
		this.baseDAO = baseDAO;
	}
}
