package com.sergej.cars.controllers;

import com.sergej.cars.dto.CarDealerGetDTO;
import com.sergej.cars.dto.CarBrandGetDTO;
import com.sergej.cars.dto.CarBrandPutDTO;
import com.sergej.cars.services.CarBrandService;
import com.sergej.cars.services.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "Brands")
@RequestMapping(value = "/api/brands")
public class CarBrandController {

    @Autowired
    private CarBrandService carBrandService;

    public CarBrandController(CarBrandService carBrandService) {
        this.carBrandService = carBrandService;
    }

    private final Logger logger = LoggerFactory.getLogger(CarBrandController.class);

    //Get All Brands

    @GetMapping
    @ApiOperation(value = "Get all brands", notes = "Returns brands dto from database")
    public List<CarBrandGetDTO> findAllCarBrands(){
       return carBrandService.finadAllCarBrandss();
    }

    //Get CarBrand by Title

    @GetMapping(value = "/{title}")
    @ApiOperation(value = "Get brand by title", notes = "Returns specific brand by title")
    public CarBrandGetDTO findByTitle(
            @PathVariable final String title){
       return carBrandService.findByTitle(title);
    }

    //Save new brand

    @PostMapping
    @ApiOperation(value = "Save new record brand", notes = "Crates new brand and saves to database")
    public void save(
            @RequestBody
            final CarBrandPutDTO putDTO){
        carBrandService.CreateNewCarBrand(putDTO);
        logger.info("Creating new car Brand");
    }

    @PutMapping("/{title}")
    @ApiOperation(value = "Update existing brand")
    public void update(@PathVariable final String title, @RequestBody CarBrandPutDTO carBrandPutDTO){
        carBrandService.update(title, carBrandPutDTO);
        logger.info("Updating a car Brand");
    }

    @DeleteMapping("/{title}")
    @ApiOperation(value = "Delete brand by title")
    public void delete(@PathVariable final String title){
        carBrandService.delete(title);
        logger.warn("Deleting a car Brand");
    }

    @GetMapping("/{title}/all-brands")
    @ApiOperation(value = "Get all dealers for brand")
    public List<CarDealerGetDTO> getAllDealerBrand(@PathVariable final String title){
        return carBrandService.getAllBrandDealers(title);
    }

    @PutMapping("/{brand_title}/{dealer_title}")
    @ApiOperation(value = "Add dealer to a brand")
    public void addDealer(@PathVariable final String brand_title, @PathVariable final String dealer_title){
        carBrandService.addCarBrand(brand_title,dealer_title);

    }

}
