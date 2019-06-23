package com.sergej.cars.dto;

public class CarGetDTO {

    private Long id;
    private String brand;
    private String fuel;
    private double price;

    public CarGetDTO(Long id, String brand, String fuel, double price) {
        this.id = id;
        this.brand = brand;
        this.fuel = fuel;
        this.price = price;
    }

    public CarGetDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
