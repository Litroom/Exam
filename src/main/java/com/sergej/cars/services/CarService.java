package com.sergej.cars.services;

import com.sergej.cars.dto.CarGetDTO;
import com.sergej.cars.dto.CarPutDTO;
import com.sergej.cars.entities.Car;
import com.sergej.cars.entities.CarDealer;
import com.sergej.cars.repositories.CarDealerRepo;
import com.sergej.cars.repositories.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    private CarRepo carRepo;
    @Autowired
    private CarDealerRepo carDealerRepo;

    public CarService(CarRepo carRepo, CarDealerRepo carDealerRepo) {
        this.carRepo = carRepo;
        this.carDealerRepo = carDealerRepo;
    }

    @Transactional(readOnly = true)
    public List<CarGetDTO> getAllCars() {
        return carRepo.findAll().stream().map(car ->
                new CarGetDTO(car.getId() , car.getBrand(), car.getFuel(), car.getPrice()))
                .collect(Collectors.toList());
    }

    @Transactional
    public CarGetDTO getById(Long id) {
        Car car = carRepo.findById(id).orElse(null);
        if (car != null) {
            return new CarGetDTO(car.getId() , car.getBrand(), car.getFuel(), car.getPrice());
        }
        return null;
    }

    @Transactional
    public void saveCar(CarPutDTO carDTO) {
        Car car = new Car();
        car.setBrand(carDTO.getBrand());
        car.setFuel(carDTO.getFuel());
        car.setPrice(carDTO.getPrice());
        carRepo.save(car);
    }

    @Transactional
    public void deleteCarById(Long id) {
        carRepo.deleteById(id);
    }

    @Transactional
    public void addCarToCarDealer(long car_id, String dealer_title) {
        CarDealer carDealer = carDealerRepo.findByTitle(dealer_title);
        Car car = carRepo.getOne(car_id);
        if(carDealer != null){
            carDealer.getCars().add(car);
        }
    }

    @Transactional
    public void updateSong(long id, CarPutDTO carPutDTO) {
        Car car = carRepo.findById(id).orElse(null);
        if (car != null){
            car.setBrand(carPutDTO.getBrand());
            car.setFuel(carPutDTO.getFuel());
            car.setPrice(carPutDTO.getPrice());
        }
    }
}
