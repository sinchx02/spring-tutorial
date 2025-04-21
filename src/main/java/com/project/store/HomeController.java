package com.project.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // annotation to tell compiler to treat it as web controller for receiving web traffic
public class HomeController {

    @RequestMapping("/") //to map web requests to specific handler methods or classes in a controller
    // In this case when a person visits / root page they will view the below method
    public String index()
    {
        return "index.html"; //view where the viewer sees it

    }

}
