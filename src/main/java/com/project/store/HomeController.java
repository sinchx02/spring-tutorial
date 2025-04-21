package com.project.store;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // annotation to tell compiler to treat it as web controller for receiving web traffic
public class HomeController {

    @Value("${spring.application.name}") //to inject the value of key that exists in application.properties
    private String appName; // the value is injected into this field

    @RequestMapping("/") //to map web requests to specific handler methods or classes in a controller
    // In this case when a person visits / root page they will view the below method
    public String index()
    {
        System.out.println("Application Name :"+appName);
        return "index.html"; //view where the viewer sees it

    }

}
