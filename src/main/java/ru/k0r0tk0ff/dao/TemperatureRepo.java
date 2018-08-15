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
            "JOIN countries ON countries.country_id = cities.country_id " +
            "WHERE t.date = ?1 " +
            "AND cities.name = ?2 " +
            "AND countries.name = ?3 ",
            nativeQuery = true)
    Double getCurrentTemperature(String today, String cityName, String countryName);

    @Query(value =
            "SELECT min(temperature_value) " +
            "FROM temperatures t " +
            "JOIN cities ON t.city_id = cities.city_id " +
            "JOIN countries ON countries.country_id = cities.country_id " +
            "WHERE countries.NAME = ?1 " +
            "AND cities.NAME = ?2 " +
            "AND t.date BETWEEN ?3 AND ?4",
            nativeQuery = true
    )
    Double getForecastTemperatures(
            String countryName,
            String cityName,
            String today,
            String todayPlusTreeDay
    );
}
