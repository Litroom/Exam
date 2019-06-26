package com.sergej.warehouse.dto;

import java.util.Date;

public class InventoryGetDTO {

    private String title;
    private Double weight;
    private Integer inventorySection;
    private Date storingDate;

    public InventoryGetDTO(String title, Double weight, Integer inventorySection, Date storingDate) {
        this.title = title;
        this.weight = weight;
        this.inventorySection = inventorySection;
        this.storingDate = storingDate;
    }

    public InventoryGetDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getInventorySection() {
        return inventorySection;
    }

    public void setInventorySection(Integer inventorySection) {
        this.inventorySection = inventorySection;
    }

    public Date getStoringDate() {
        return storingDate;
    }

    public void setStoringDate(Date storingDate) {
        this.storingDate = storingDate;
    }
}
