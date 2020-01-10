package com.demo.camel.controller;

import com.demo.camel.model.JsonObject;
import com.demo.camel.service.CamelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tu
 */
@RestController
@Slf4j
public class CamelController {

    @Autowired
    private CamelService camelService;

    @RequestMapping(value = "/demo/test",method = RequestMethod.GET)
    public JsonObject<?> demoTest(){
       try {
           return camelService.demoTest();
       }catch (Exception e){
           log.error(e.getMessage(),e);
           return JsonObject.error(e.getMessage());
       }
    }
}
