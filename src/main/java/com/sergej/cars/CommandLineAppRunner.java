package com.sergej.cars;

import com.sergej.cars.entities.Car;
import com.sergej.cars.entities.CarBrand;
import com.sergej.cars.entities.CarDealer;
import com.sergej.cars.repositories.CarDealerRepo;
import com.sergej.cars.repositories.CarRepo;
import com.sergej.cars.repositories.CarBrandRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class CommandLineAppRunner implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(CommandLineAppRunner.class);

    @Autowired
    private CarBrandRepo carBrandRepo;
    @Autowired
    private CarDealerRepo carDealerRepo;
    @Autowired
    private CarRepo carRepo;

    public CommandLineAppRunner(CarBrandRepo carBrandRepo, CarDealerRepo carDealerRepo, CarRepo carRepo) {
        this.carBrandRepo = carBrandRepo;
        this.carDealerRepo = carDealerRepo;
        this.carRepo = carRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        logger.warn("Deleting all information from in-memory database");
        carBrandRepo.deleteAllInBatch();
        carDealerRepo.deleteAllInBatch();
        carRepo.deleteAllInBatch();




        List<CarDealer> carDealers = Arrays.asList(
                new CarDealer("Sostena","Local","LT",Collections.emptySet()),
                new CarDealer("VAG","Regional","EU",Collections.emptySet()));
        carDealerRepo.saveAll(carDealers);
        logger.info("Creating new carDealers => {}", carDealers.toString());


        List<CarBrand> carBrands = Arrays.asList(
                new CarBrand("Audi", "OOOO",Collections.emptySet()),
                new CarBrand("BMW", "O",Collections.emptySet()),
                new CarBrand("Toyota", "Logo", Collections.emptySet()),
                new CarBrand("Volvo", "V", Collections.emptySet())
        );
        logger.info("Creating new record studios => {}", carBrands.toString());
        carBrandRepo.saveAll(carBrands);


        List<Car> cars = Arrays.asList(
                new Car("Audi","Diesel",10000.00, Collections.emptySet()),
                new Car("VW","Gas",20000.00,Collections.emptySet()),
                new Car("Toyota", "Electricity", 30000.00, Collections.emptySet()));
        carRepo.saveAll(cars);
        logger.info("Creating new cars => {}", cars.toString());


    }
}
