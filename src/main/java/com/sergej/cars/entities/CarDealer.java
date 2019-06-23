package com.sergej.cars.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CarDealer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title",unique = true)
    private String title;

    @Column(name = "type")
    private String type;

    @Column(name = "country")
    private String country;


//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
//    @JoinTable(name = "studio_performer",
//            joinColumns = @JoinColumn(name = "performer_id"), inverseJoinColumns = @JoinColumn(name = "studio_id"))
//    private Set<CarBrand> carBrands = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(name = "carDealer_car",
            joinColumns = @JoinColumn(name = "carDealer_id"), inverseJoinColumns = @JoinColumn(name = "car_id"))
    private Set<Car> cars = new HashSet<>();

    public CarDealer(String title, String type, String country, Set<Car> cars) {
        this.title = title;
        this.type = type;
        this.country = country;
        this.cars = cars;
    }

    public CarDealer() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarDealerService{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", cars='" + cars +'\'' +
                '}';
    }
}
