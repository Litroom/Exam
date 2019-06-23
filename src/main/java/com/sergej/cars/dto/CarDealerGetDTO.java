package com.sergej.cars.dto;

import java.util.Date;

public class CarDealerGetDTO {

    private String title;
    private String type;
    private String country;


    public CarDealerGetDTO(String title, String type, String country) {
        this.title = title;
        this.type = type;
        this.country = country;
    }

    public CarDealerGetDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {return type; }

    public void setType(String type) {this.type = type; }
}
