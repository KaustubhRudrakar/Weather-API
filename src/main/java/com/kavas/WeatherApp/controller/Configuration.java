package com.kavas.WeatherApp.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Collections;

@org.springframework.context.annotation.Configuration
public class Configuration
{
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder)
    {
        RestTemplate restTemplate = builder.build();

        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        jsonConverter.setSupportedMediaTypes(Collections.singletonList(org.springframework.http.MediaType.TEXT_PLAIN));

        restTemplate.getMessageConverters().add(0, jsonConverter);
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
        return restTemplate;
    }
}
