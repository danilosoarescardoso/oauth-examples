package com.danilocardoso.oauth.controller;

import com.danilocardoso.oauth.domain.Country;
import com.danilocardoso.oauth.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountriesController {

    @Autowired
    private CountryService service;

    @GetMapping("/brasil")
    @ResponseBody
    public Country getBrasil (){
        Country brazil = service.fillWithBrazilInfo("brazil");
        return brazil;
    }

}
