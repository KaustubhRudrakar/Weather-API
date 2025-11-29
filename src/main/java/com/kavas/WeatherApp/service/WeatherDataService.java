package com.kavas.WeatherApp.service;

import com.kavas.WeatherApp.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WeatherDataService
{
    @Autowired
    RestTemplate restTemplate;
    public Double getWeatherData(String district)
    {
        Map<String,Object> fullData=restTemplate.getForObject(Utility.data, Map.class);
        for(Map.Entry<String,Object> stateEntry:fullData.entrySet())
        {
            Map<String,Object> districts=(Map<String,Object>) stateEntry.getValue();
            if(districts.containsKey(district))
            {
                Map<String,Object> weatherInfo=(Map<String,Object>) districts.get(district);
                return (Double) weatherInfo.get("Temperature (°C)");
            }
        }
        return null;
    }
}
