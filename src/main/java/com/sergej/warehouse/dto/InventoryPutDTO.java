package com.sergej.warehouse.dto;

import java.time.LocalDate;
import java.util.Date;

public class InventoryPutDTO {

    private String title;
    private Double weight;
    private Integer inventorySection;
    private LocalDate storingDate;

    public InventoryPutDTO(String title, Double weight, Integer inventorySection, LocalDate storingDate) {
        this.title = title;
        this.weight = weight;
        this.inventorySection = inventorySection;
        this.storingDate = storingDate;
    }

    public InventoryPutDTO() {
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

    public LocalDate getStoringDate() {
        return storingDate;
    }

    public void setStoringDate(LocalDate storingDate) {
        this.storingDate = storingDate;
    }
}

