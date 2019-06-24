package com.sergej.cars.controllers;

import com.sergej.cars.dto.CarDealerGetDTO;
import com.sergej.cars.dto.CarDealerPutDTO;
import com.sergej.cars.dto.CarGetDTO;
import com.sergej.cars.services.CarDealerService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dealers")
public class CarDealerController {

    @Autowired
    private CarDealerService carDealerService;

    public CarDealerController(CarDealerService carDealerService) {
        this.carDealerService = carDealerService;
    }

    private final Logger logger = LoggerFactory.getLogger(CarDealerController.class);

    @GetMapping
    @ApiOperation(value = "Get all dealers")
    public List<CarDealerGetDTO> findAllDeaers() {
        return carDealerService.findAll();
    }

    @GetMapping("/{title}")
    @ApiOperation(value = "Get dealer by title")
    public CarDealerGetDTO findDealerByTitle(@PathVariable final String title) {
        return carDealerService.findByTitle(title);
    }

    @DeleteMapping("/{title}")
    @ApiOperation(value = "Delete dealer by title")
    public void deleteDealerByTitle(@PathVariable final String title) {
        carDealerService.deleteByTitle(title);
        logger.warn("Deleting car dealer");
    }

    @PostMapping
    @ApiOperation(value = "Add new dealer")
    public void save(@RequestBody final CarDealerPutDTO putDTO){
        carDealerService.saveCarDealer(putDTO);
        logger.info("Adding new car dealer");
    }

    @GetMapping("/{title}/cars")
    @ApiOperation(value = "Get all cars")
    public List<CarGetDTO> getAllSongs(@PathVariable final String title){
        return carDealerService.getAllSongs(title);
    }


    @PutMapping("/{title}")
    @ApiOperation(value = "Update dealer")
    public void updateDealer(@PathVariable final String title, @RequestBody CarDealerPutDTO putDTO){
        carDealerService.updateCarDealer(title, putDTO);
        logger.info("Updating car dealer");
    }

}
