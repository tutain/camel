package com.demo.camel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author hu
 */
@Component
public class RestTemplateConf {
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        StringHttpMessageConverter stringHttpMessageConverter =
                new StringHttpMessageConverter(StandardCharsets.UTF_8);
        messageConverters.add(0, stringHttpMessageConverter);
        restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }

}
