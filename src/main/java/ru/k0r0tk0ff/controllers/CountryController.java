package ru.k0r0tk0ff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.k0r0tk0ff.entities.Country;
import ru.k0r0tk0ff.services.CountryServiceImpl;

import java.util.Collection;

/*@RestController
@RequestMapping("/")
public class CountryController {

    Long id;

    @Autowired
    private CountryServiceImpl cityService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Country>> getCities() {
        return new ResponseEntity<>(cityService.findAll(), HttpStatus.OK);
    }
}*/
