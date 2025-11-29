package com.kavas.WeatherApp.controller;

import com.kavas.WeatherApp.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/weather-data")
public class WeatherController
{
    @Autowired
    WeatherDataService dataService;
    @GetMapping({"/district/{district}", "/District/{district}"})
    public String getWeatherInfo(@PathVariable String district)
    {
        //System.out.println(district);
        Double weatherData=dataService.getWeatherData(district);
        return "Average Temperature in "+district+": "+weatherData;
    }
}
