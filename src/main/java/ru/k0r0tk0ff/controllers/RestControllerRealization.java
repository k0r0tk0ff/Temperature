package ru.k0r0tk0ff.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.k0r0tk0ff.entities.City;
import ru.k0r0tk0ff.services.CityService;

import java.util.Collection;
import java.util.List;

@RestController
public class RestControllerRealization {

    @Autowired
    CityService cityService;

    @RequestMapping(
            value="/cities",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Collection <City> getCityList() {
        Collection<City> collection = cityService.findAll();
        return collection;
    }
}
