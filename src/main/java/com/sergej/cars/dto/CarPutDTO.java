package com.sergej.cars.dto;

public class CarPutDTO {

    private String brand;
    private String fuel;
    private double price;

    public CarPutDTO(String brand, String fuel, double price) {
        this.brand = brand;
        this.fuel = fuel;
        this.price = price;
    }

    public CarPutDTO() {
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
