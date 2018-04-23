package ru.k0r0tk0ff.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.k0r0tk0ff.entities.City;
import ru.k0r0tk0ff.dao.CityRepo;

import java.util.Collection;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepo cityRepo;

    public City findOne(Long id) {
        return cityRepo.getOne(id);
    }

    public Collection<City> findAll() {
        return cityRepo.findAll();
    }
}
