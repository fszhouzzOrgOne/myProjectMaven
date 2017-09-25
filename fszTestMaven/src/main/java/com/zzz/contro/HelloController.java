package com.zzz.contro;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello/{name}")  
    public String hello(@PathVariable("name") String name, Map<String,Object> model){  
       model.put("name", name);  
       return "json/hello";  
    }  
}
