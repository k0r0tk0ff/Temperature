package ru.k0r0tk0ff.services;

import ru.k0r0tk0ff.entities.City;

import java.util.Collection;

public interface CityService {
    City findOne(Long id);
    Collection<City> findAll();
}
