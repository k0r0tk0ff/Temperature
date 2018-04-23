package ru.k0r0tk0ff.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.k0r0tk0ff.dao.TemperatureRepo;

import java.util.*;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    TemperatureRepo tRepo;

    @Override
    public Map<String, Double> getResult() {
        Map<String, Double> map = new HashMap<>();

        String today = "2018-01-01";

        map.put("Current_temperature", tRepo.getCurrentTemperature(today));
        map.put("Forecast_temperature", tRepo.getForecastTemperatures());

        return map;
    }
}
