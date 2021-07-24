package com.danilocardoso.oauth.service;

import com.danilocardoso.oauth.domain.Country;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CountryService {

    public Country fillWithBrazilInfo(String countryName){

        String id = java.util.UUID.randomUUID().toString();
        Country brazil = Country.builder()
                .name("Brazil")
                .id(id)
                .continent("America")
                .build();

        return brazil;
    }

}
