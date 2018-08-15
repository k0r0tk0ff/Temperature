package ru.k0r0tk0ff.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.k0r0tk0ff.dao.TemperatureRepo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;


@Service
public class MainServiceImpl implements MainService {


    private TemperatureRepo tRepo;

    @Autowired
    public MainServiceImpl(TemperatureRepo tRepo) {
        this.tRepo = tRepo;
    }

    @Override
    public Map<String, Double> getResult(String cityName, String countryName) {
        String today;
        String todayPlusTreeDay;
        Map<String, Double> map = new HashMap<>();

        today = getCurrentDate();
        todayPlusTreeDay = getCurrentDatePlusTreeDay();

        // DEBUG
        // System.out.println("-----------------------------------------------------------------------");

        map.put(
                "Current_temperature",
                tRepo.getCurrentTemperature(today, cityName, countryName));

        // DEBUG
        //System.out.println(tRepo.getCurrentTemperature(today, cityName, countryName));
        //System.out.println("-----------------------------------------------------------------------");

        map.put("Forecast_temperature",
                tRepo.getForecastTemperatures(countryName, cityName, today, todayPlusTreeDay));

        return map;
    }

    private String getCurrentDate() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today = LocalDate.now();

        return today.format(formatter);
    }

    private String getCurrentDatePlusTreeDay() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate todayPlusTreeDay = LocalDate.now().plusDays(3);

        return todayPlusTreeDay.format(formatter);
    }
}
