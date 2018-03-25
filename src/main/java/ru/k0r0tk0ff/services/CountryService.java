package ru.k0r0tk0ff.services;

import ru.k0r0tk0ff.entities.Country;

import java.util.Collection;

public interface CountryService {

    Country findOne(Long id);
    Collection<Country> findAll();
}
