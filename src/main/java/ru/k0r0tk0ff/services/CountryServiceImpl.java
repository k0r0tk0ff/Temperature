package ru.k0r0tk0ff.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.k0r0tk0ff.entities.Country;
import ru.k0r0tk0ff.repos.CountryRepo;

import java.util.Collection;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepo countryRepo;

    @Override
    public Country findOne(Long id) {

        return countryRepo.getOne(id);
    }

    @Override
    public Collection<Country> findAll() {

        return countryRepo.findAll();
    }
}
