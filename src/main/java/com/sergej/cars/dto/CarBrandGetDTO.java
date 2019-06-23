package com.sergej.cars.dto;


public class CarBrandGetDTO {
    private String title;
    private String logo;

    public CarBrandGetDTO(String title, String logo) {
        this.title = title;
        this.logo = logo;
    }

    public CarBrandGetDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
