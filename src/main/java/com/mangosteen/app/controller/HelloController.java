package com.mangosteen.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    //**
    /* SayHello api
    /* @params name
    /* @params id
    /* return
     */
    @GetMapping(path = "v1.0/hello/{name}/{id}")
    public String sayHello (@PathVariable("name") String name,
                            @PathVariable("id") long id
                            ){
        return String.format("Hello  %s %d", name, id);
    }
    @GetMapping("v1.0/greeting")
    public String sayGreeting (@RequestParam("name") String name,
                            @RequestParam("id") long id
    ){
        return String.format("Hello  %s with %d", name, id);
    }
}
