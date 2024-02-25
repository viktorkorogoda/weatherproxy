package com.vk.weatherproxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/")
    public String weather() {
        return "In Vilnius sunny";
    }
}
