package com.sergej.cars.controllers;

import com.sergej.cars.dto.CarGetDTO;
import com.sergej.cars.dto.CarPutDTO;
import com.sergej.cars.services.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "Car controller")
@RequestMapping("/api/cars")
public class CarController {


    @Autowired
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    //Get All songs

    @GetMapping
    @ApiOperation(value = "Get all cars", notes = "Returns all cars from server")
    public List<CarGetDTO> getAllcars(){
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public CarGetDTO getById(
            @ApiParam(value = "id", required = true)
            @PathVariable long id){
        return carService.getById(id);
    }

    @PostMapping
    @ApiOperation(value = "Save new car")
    public void save(@RequestBody CarPutDTO car){
        carService.saveCar(car);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Remove car by id")
    public void deleteCarById(@ApiParam(value = "id",required = true) @PathVariable final long id){
        carService.deleteCarById(id);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update car")
    public void updateSong(@PathVariable final long id, @RequestBody CarPutDTO carPutDTO){
        carService.updateSong(id, carPutDTO);
    }

    @PutMapping("/{car_id}/{dealer_title}")
    @ApiOperation(value = "Add a car to dealer")
    public void addCarToDealer(@PathVariable final long car_id, @PathVariable final String dealer_title){
        carService.addCarToCarDealer(car_id,dealer_title);
    }

}
