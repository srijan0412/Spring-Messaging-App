package com.springmessagingapp.controller;

import com.springmessagingapp.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @RequestMapping(value = {"/hello/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    // Request Handler to take <name> from the param and respond Hello <name>!
    @RequestMapping("/hello/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + "!";
    }

    // Post Request Handler to take first name and last name in the body
    @PostMapping("/hello/post")
    public String sayHelloBody(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() +  "!";
    }
}
