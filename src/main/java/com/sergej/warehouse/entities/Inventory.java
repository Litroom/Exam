package com.sergej.warehouse.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "inventorySection")          //TODO MIN 1 MAX 40
    private Integer inventorySection;

    @Column(name = "StoringDate")
    private LocalDate storingDate;


//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
//    @JoinTable(name = "studio_performer",
//            joinColumns = @JoinColumn(name = "performer_id"), inverseJoinColumns = @JoinColumn(name = "studio_id"))
//    private Set<CarBrand> carBrands = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(name = "inventory_clients",
            joinColumns = @JoinColumn(name = "clients_id"), inverseJoinColumns = @JoinColumn(name = "inventory_id"))
    private Set<Clients> clients = new HashSet<>();

    public Inventory(String title, Double weight, Integer inventorySection, LocalDate storingDate, Set<Clients> clients) {
        this.title = title;
        this.weight = weight;
        this.inventorySection = inventorySection;
        this.storingDate = storingDate;
        this.clients = clients;
    }

    public Inventory() {
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

    public Set<Clients> getClients() {
        return clients;
    }

    public void setClients(Set<Clients> clients) {
        this.clients = clients;
    }

    public LocalDate getStoringDate() {
        return storingDate;
    }

    public void setStoringDate(LocalDate storingDate) {
        this.storingDate = storingDate;
    }

    @Override
    public String toString() {
        return "ClientsService{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", weight='" + weight + '\'' +
                ", inventorySection='" + inventorySection + '\'' +
                ", storingDate='" + storingDate +'\'' +
                ", clients='" + clients +'\'' +
                '}';
    }
}
