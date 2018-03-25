package ru.k0r0tk0ff.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.k0r0tk0ff.entities.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Long> {}