package com.sergej.cars.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private Long id;

    @Column(name ="brand")
    private String brand;

    @Column(name = "fuel")
    private String fuel;

    @Column(name = "price")
    private double price;


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(name = "carBrand_car",
            joinColumns = @JoinColumn(name = "car_id"), inverseJoinColumns = @JoinColumn(name = "carBrand_id"))
    private Set<CarBrand> carBrands = new HashSet<>();

    public Car(String brand, String fuel, double price, Set<CarBrand> carBrands) {
        this.brand = brand;
        this.fuel = fuel;
        this.price = price;
        this.carBrands = carBrands;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<CarBrand> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Set<CarBrand> carBrands) {
        this.carBrands = carBrands;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", fuel='" + fuel + '\'' +
                ", price=" + price +
                ", carBrands=" + carBrands +
                '}';
    }
}
