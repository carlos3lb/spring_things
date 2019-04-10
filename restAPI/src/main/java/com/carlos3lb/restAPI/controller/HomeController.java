package com.carlos3lb.restAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

    @GetMapping(path = "/", produces = "application/json")
    public void home(){
        System.out.println("Home Service");
    }
}
