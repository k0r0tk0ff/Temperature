package ru.k0r0tk0ff.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.k0r0tk0ff.dao.TemperatureRepo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    TemperatureRepo tRepo;

    @Override
    public Map<String, Double> getResult(String cityName) {
        String today;
        String todayPlusTreeDay;
        Map<String, Double> map = new HashMap<>();

        //String today = "2018-01-01";
        today = getCurrentDate2();
        todayPlusTreeDay = getCurrentDatePlusTreeDay();

        map.put(
                "Current_temperature",
                tRepo.getCurrentTemperature(today, cityName));

        map.put("Forecast_temperature",
                tRepo.getForecastTemperatures(today, todayPlusTreeDay));

        return map;
    }

    private String getCurrentDate2() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today = LocalDate.now();

        return today.format(formatter);
    }

    private String getCurrentDatePlusTreeDay() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today = LocalDate.now().plusDays(3);

        return today.format(formatter);
    }
}
