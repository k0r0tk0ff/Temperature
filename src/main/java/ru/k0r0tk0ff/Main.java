package ru.k0r0tk0ff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "ru.k0r0tk0ff")
public class Main implements WebMvcConfigurer{

    public static void main(String[] args) {
      SpringApplication.run(Main.class, args);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Bind Bootstrap static resource:
        // http://somedomain/SomeContextPath/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css
        registry.addResourceHandler("/webjars/**") //
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
