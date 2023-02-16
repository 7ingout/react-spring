// src/main/java/com.demogroup.demoweb/Controller/HelloWorldController.java

package com.demogroup.demoweb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Tip : @RestController = @Controller + @ResponseBody
public class HelloWorldController {

    @GetMapping("/api/hello")
    public String test() {
        return "Hello, world!";
    }
}