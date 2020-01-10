package com.demo.camel.service.impl;

import com.demo.camel.model.JsonObject;
import com.demo.camel.service.CamelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author tu
 */
@Service
@Slf4j
public class CamelServiceImpl implements CamelService {
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public JsonObject<?> demoTest() {
    return null;
    }
}
