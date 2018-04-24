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

    @Autowired
    TemperatureRepo tRepo;

    @Override
    public Map<String, Double> getResult(String cityName) {
        String today;
        String todayPlusTreeDay;
        Map<String, Double> map = new HashMap<>();

        today = getCurrentDate();
        todayPlusTreeDay = getCurrentDatePlusTreeDay();

        map.put(
                "Current_temperature",
                tRepo.getCurrentTemperature(today, cityName));

        map.put("Forecast_temperature",
                tRepo.getForecastTemperatures(cityName, today, todayPlusTreeDay));

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
