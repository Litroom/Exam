package com.sergej.warehouse;

import com.sergej.warehouse.entities.Clients;
import com.sergej.warehouse.entities.CarBrand;
import com.sergej.warehouse.entities.Inventory;
import com.sergej.warehouse.repositories.ClientsRepo;
import com.sergej.warehouse.repositories.InventoryRepo;
import com.sergej.warehouse.repositories.CarBrandRepo;
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
    private ClientsRepo clientsRepo;
    @Autowired
    private InventoryRepo inventoryRepo;

    public CommandLineAppRunner(ClientsRepo clientsRepo, InventoryRepo inventoryRepo) {
        this.clientsRepo = clientsRepo;
        this.inventoryRepo = inventoryRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        logger.warn("Deleting all information from in-memory database");
        clientsRepo.deleteAllInBatch();
        inventoryRepo.deleteAllInBatch();




        List<Inventory> inventories = Arrays.asList(
                new Inventory("Sostena","Local","LT",Collections.emptySet()),
                new Inventory("VAG","Regional","EU",Collections.emptySet()));
        clientsRepo.saveAll(inventories);
        logger.info("Creating new inventories => {}", inventories.toString());


        List<CarBrand> carBrands = Arrays.asList(
                new CarBrand("Audi", "OOOO",Collections.emptySet()),
                new CarBrand("BMW", "O",Collections.emptySet()),
                new CarBrand("Toyota", "Logo", Collections.emptySet()),
                new CarBrand("Volvo", "V", Collections.emptySet())
        );
        logger.info("Creating new record studios => {}", carBrands.toString());
        carBrandRepo.saveAll(carBrands);


        List<Clients> clients = Arrays.asList(
                new Clients("Audi","Diesel",10000.00, Collections.emptySet()),
                new Clients("VW","Gas",20000.00,Collections.emptySet()),
                new Clients("Toyota", "Electricity", 30000.00, Collections.emptySet()));
        inventoryRepo.saveAll(clients);
        logger.info("Creating new warehouse => {}", clients.toString());


    }
}
