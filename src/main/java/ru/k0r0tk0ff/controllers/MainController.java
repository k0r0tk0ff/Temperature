package ru.k0r0tk0ff.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.k0r0tk0ff.services.MainService;

import java.util.Map;

@RestController
public class MainController {

    @Autowired
    MainService mainService;

    @RequestMapping(
            value="/getCurrentTAndMinTwithForecast",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Map<String, Double> getData(@RequestParam String city) {
         return mainService.getResult(city);
    }
}
