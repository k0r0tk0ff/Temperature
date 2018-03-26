package ru.k0r0tk0ff.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "temperatures")
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "temperature_id")
    private Long temperature_id;

    @Column(name = "date")
    private Date date;

    @Column(name = "temperature_value")
    private Double temperature_value;

    @ManyToOne
    @JoinColumn(name="city_id")
    @JsonBackReference
    private City city;

    public Long getTemperature_id() {
        return temperature_id;
    }

    public void setTemperature_id(Long temperature_id) {
        this.temperature_id = temperature_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTemperature_value() {
        return temperature_value;
    }

    public void setTemperature_value(Double temperature_value) {
        this.temperature_value = temperature_value;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
