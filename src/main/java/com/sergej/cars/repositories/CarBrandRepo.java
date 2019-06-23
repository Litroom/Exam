package com.sergej.cars.repositories;

import com.sergej.cars.entities.CarBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBrandRepo extends JpaRepository<CarBrand,Long> {

    CarBrand findByTitle(String title);

    void deleteByTitle(String title);
}
