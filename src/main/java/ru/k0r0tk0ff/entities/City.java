package ru.k0r0tk0ff.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "city_id")
    private Long city_id;

    private String name;

    @ManyToOne
    @JoinColumn (name="country_id")
    @JsonBackReference
    private Country country;

    @OneToMany(mappedBy = "city")
    private Set<Temperature> temperatures = new HashSet<>();


    public Set<Temperature> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(Set<Temperature> temperatures) {
        this.temperatures = temperatures;
    }

    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
