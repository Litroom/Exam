package com.sergej.cars.repositories;

import com.sergej.cars.entities.CarDealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDealerRepo extends JpaRepository<CarDealer,Long> {
    CarDealer findByTitle(String title);

    void deleteByTitle(String title);
}
