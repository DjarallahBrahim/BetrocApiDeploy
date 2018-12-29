package com.betroc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexControler {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String getRandomQuote() {
        return "Hellow Sam";
    }
}
