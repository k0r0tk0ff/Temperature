package ru.k0r0tk0ff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import ru.k0r0tk0ff.entities.City;
import ru.k0r0tk0ff.services.CityServiceImpl;


@RestController
public class CityController {

    @Autowired
    CityServiceImpl cityService;

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public City getCity(@PathVariable String id) {
        Long cityId = Long.parseLong(id);
        return cityService.findOne(cityId);
    }

    /*    @RequestMapping(value="/cities", method = RequestMethod.GET)
    public ResponseEntity<City> getCities() {
        return new ResponseEntity<City>(
                cityService.findAll(),
                HttpStatus.OK);
    }*/

}
