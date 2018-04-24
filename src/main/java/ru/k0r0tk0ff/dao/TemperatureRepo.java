package ru.k0r0tk0ff.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.k0r0tk0ff.entities.Temperature;

@Repository
public interface TemperatureRepo extends JpaRepository<Temperature, Long> {

    @Query(value =
            "SELECT temperature_value FROM temperatures t  " +
            "JOIN cities ON t.city_id = cities.city_id  " +
            "WHERE t.date = ?1 " +
         //   "WHERE t.date = '2018-01-01' " +
         //   "AND cities.name = 'Moscow'",
            "AND cities.name = ?2 ",
            nativeQuery = true)
    Double getCurrentTemperature(String today, String cityName);

    @Query(value =
            "SELECT min(temperature_value) " +
            "FROM temperatures t " +
            "JOIN cities ON t.city_id = cities.city_id " +
            "WHERE cities.NAME = ?1 " +
            "AND t.date BETWEEN ?2 AND ?3",
            nativeQuery = true
    )
    Double getForecastTemperatures(
            String cityName,
            String today,
            String todayPlusTreeDay
    );
}
