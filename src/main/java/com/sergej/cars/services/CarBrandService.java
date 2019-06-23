package com.sergej.cars.services;

import com.sergej.cars.dto.CarDealerGetDTO;
import com.sergej.cars.entities.CarBrand;
import com.sergej.cars.repositories.CarDealerRepo;
import com.sergej.cars.dto.CarBrandGetDTO;
import com.sergej.cars.dto.CarBrandPutDTO;
import com.sergej.cars.entities.CarDealer;
import com.sergej.cars.repositories.CarBrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarBrandService {

    @Autowired
    private CarBrandRepo carBrandRepo;
    @Autowired
    private CarDealerRepo carDealerRepo;

    public CarBrandService(CarBrandRepo carBrandRepo, CarDealerRepo carDealerRepo) {
        this.carBrandRepo = carBrandRepo;
        this.carDealerRepo = carDealerRepo;
    }

    @Transactional(readOnly = true)
    public List<CarBrandGetDTO> finadAllCarBrandss() {
        return carBrandRepo.findAll().stream().map(brand ->
                new CarBrandGetDTO(brand.getTitle(),brand.getLogo())
        ).collect(Collectors.toList());
    }

//    @Transactional
//    public void savePhoto(CarBrandPutDTO studio) {
//        CarBrand carBrand = new CarBrand(studio.getTitle(), studio.getLogo(), studio.getCategory(), studio.getSize(),Collections.emptySet());
//        carBrandRepo.save(carBrand);
//    }

    @Transactional
    public CarBrandGetDTO findByTitle(String title) {
        CarBrand carBrand = carBrandRepo.findByTitle(title);
        if(carBrand != null){
            return new CarBrandGetDTO(carBrand.getTitle(), carBrand.getLogo());
        }
        else {
            return null;
        }
    }

    @Transactional
    public void delete(String title) {
        carBrandRepo.deleteByTitle(title);
    }


    @Transactional
    public void CreateNewCarBrand(CarBrandPutDTO carBrandPutDTO) {
        CarBrand carBrand = new CarBrand();
        carBrand.setTitle(carBrandPutDTO.getTitle());
        carBrand.setLogo(carBrandPutDTO.getLogo());
        carBrandRepo.save(carBrand);
    }

    @Transactional
    public void update(String title, CarBrandPutDTO carBrandPutDTO) {
        CarBrand carBrand = carBrandRepo.findByTitle(title);
        if(carBrand != null){
            carBrand.setTitle(carBrandPutDTO.getTitle());
            carBrand.setLogo(carBrandPutDTO.getLogo());
        }
    }

    @Transactional
    public List<CarDealerGetDTO> getAllBrandDealers(String title) {
        CarBrand carBrand = carBrandRepo.findByTitle(title);
        if(carBrand != null){
            return carBrand.getCarDealers().stream().map(dealer ->
                    new CarDealerGetDTO(dealer.getTitle(),
                            dealer.getType(),
                            dealer.getCountry())
                    ).collect(Collectors.toList());
        }
        return null;
    }

    @Transactional
    public void addCarBrand(String brand_title, String dealer_title) {
        CarBrand carBrand = carBrandRepo.findByTitle(brand_title);
        CarDealer carDealer = carDealerRepo.findByTitle(dealer_title);
        if(carBrand != null){
            carBrand.getCarDealers().add(carDealer);
        }
    }
}
