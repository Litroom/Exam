//package com.sergej.warehouse.entities;
//
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//public class CarBrand implements Serializable {
//
//    @Id
//    @GeneratedValue(generator = "photo-uuid")
//    @GenericGenerator(name = "photo-uuid", strategy = "uuid")
//    @Column(name = "id")
//    private String id;
//
//    @Column(name = "title")
//    private String title;
//
//    @Column(name = "logo")
//    private String logo;
//
////    @Enumerated(value = EnumType.STRING)
////    private Category category;
////
//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REFRESH})
//    @JoinTable(name = "carBrand_carDealer", joinColumns = @JoinColumn(name = "carBrand_id"), inverseJoinColumns = @JoinColumn(name = "carDealer_id"))
//    private Set<Inventory> inventories = new HashSet<>();
//
//    public CarBrand(String title, String logo, Set<Inventory> inventories) {
//        this.title = title;
//        this.logo = logo;
//        this.inventories = inventories;
//    }
//
//    public CarBrand() {
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getLogo() {
//        return logo;
//    }
//
//    public void setLogo(String logo) {
//        this.logo = logo;
//    }
//
//    public Set<Inventory> getInventories() {
//        return inventories;
//    }
//
//    public void setInventories(Set<Inventory> inventories) {
//        this.inventories = inventories;
//    }
//
//    @Override
//    public String toString() {
//        return "CarBrand{" +
//                "id='" + id + '\'' +
//                ", title='" + title + '\'' +
//                ", logo='" + logo + '\'' +
//                '}';
//    }
//}
