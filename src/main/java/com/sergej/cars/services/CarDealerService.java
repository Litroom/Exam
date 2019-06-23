package com.sergej.cars.services;

import com.sergej.cars.dto.CarDealerGetDTO;
import com.sergej.cars.dto.CarGetDTO;
import com.sergej.cars.entities.CarDealer;
import com.sergej.cars.repositories.CarDealerRepo;
import com.sergej.cars.dto.CarDealerPutDTO;
import com.sergej.cars.repositories.CarBrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarDealerService {

    @Autowired
    private CarBrandRepo carBrandRepo;
    @Autowired
    private CarDealerRepo carDealerRepo;

    public CarDealerService(CarBrandRepo carBrandRepo, CarDealerRepo carDealerRepo) {
        this.carBrandRepo = carBrandRepo;
        this.carDealerRepo = carDealerRepo;
    }

    @Transactional
    public List<CarDealerGetDTO> findAll() {
        return carDealerRepo.findAll().stream().map(dealer ->
                new CarDealerGetDTO(dealer.getTitle(),
                        dealer.getType(),
                        dealer.getCountry()
                )).collect(Collectors.toList());
    }

    @Transactional
    public CarDealerGetDTO findByTitle(String title) {
        CarDealer carDealer = carDealerRepo.findByTitle(title);
        if (carDealer != null) {
            return new CarDealerGetDTO(carDealer.getTitle(),
                    carDealer.getType(),
                    carDealer.getCountry()
);
        }
        return null;
    }

    @Transactional
    public void deleteByTitle(String title) {
        carDealerRepo.deleteByTitle(title);
    }


    @Transactional
    public void saveCarDealer(CarDealerPutDTO putDTO) {
        CarDealer carDealer = new CarDealer();
        carDealer.setTitle(putDTO.getTitle());
        carDealer.setType(putDTO.getType());
        carDealer.setCountry(putDTO.getCountry());
        carDealerRepo.save(carDealer);
    }

    @Transactional
    public List<CarGetDTO> getAllSongs(String title) {
        CarDealer carDealer = carDealerRepo.findByTitle(title);
        if(carDealer != null){
            return carDealer.getCars().stream().map(car ->
                    new CarGetDTO(car.getId(),car.getBrand(),car.getFuel(),car.getPrice())
                    ).collect(Collectors.toList());
        }
        return null;
    }

    @Transactional
    public void updateCarDealer(String title, CarDealerPutDTO putDTO) {
        CarDealer carDealer = carDealerRepo.findByTitle(title);
        if(carDealer != null){
            carDealer.setTitle(putDTO.getTitle());
            carDealer.setType(putDTO.getType());
            carDealer.setCountry(putDTO.getCountry());
        }
    }
}

