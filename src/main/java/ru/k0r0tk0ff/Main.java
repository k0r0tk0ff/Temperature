package ru.k0r0tk0ff;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.k0r0tk0ff.repos.CountryRepo;

// Disable AutoConfiguration
/*@EnableAutoConfiguration(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class })*/

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "ru.k0r0tk0ff")
public class Main {

    @Autowired
    private CountryRepo countryRepo;

    public static void main(String[] args) {
      SpringApplication.run(Main.class, args);
    }
}
