package ru.k0r0tk0ff.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.k0r0tk0ff.entities.Temperature;

@Repository
public interface TemperatureRepo extends JpaRepository<Temperature, Long> {}