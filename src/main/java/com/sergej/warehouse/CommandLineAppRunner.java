//package com.sergej.warehouse;
//
//
//import com.sergej.warehouse.dto.ClientsPutDTO;
//import com.sergej.warehouse.dto.InventoryGetDTO;
//import com.sergej.warehouse.dto.InventoryPutDTO;
//import com.sergej.warehouse.entities.Clients;
//import com.sergej.warehouse.entities.Inventory;
//import com.sergej.warehouse.repositories.ClientsRepo;
//import com.sergej.warehouse.repositories.InventoryRepo;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//@Component
//public class CommandLineAppRunner implements CommandLineRunner {
//
//    private final Logger logger = LoggerFactory.getLogger(CommandLineAppRunner.class);
//
//    @Autowired
//    private ClientsRepo clientsRepo;
//    @Autowired
//    private InventoryRepo inventoryRepo;
//    @Autowired
//    private InventoryPutDTO inventoryPutDTO;
//    @Autowired
//    private ClientsPutDTO clientsPutDTO;
//
//
//
//    public CommandLineAppRunner(ClientsRepo clientsRepo, InventoryRepo inventoryRepo, InventoryPutDTO inventoryPutDTO
//    , ClientsPutDTO clientsPutDTO) {
//        this.clientsRepo = clientsRepo;
//        this.inventoryRepo = inventoryRepo;
//        this.inventoryPutDTO = inventoryPutDTO;
//        this.clientsPutDTO = clientsPutDTO;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        logger.warn("Deleting all information from in-memory database");
//        clientsRepo.deleteAllInBatch();
//        inventoryRepo.deleteAllInBatch();
//
//
//
//
//        List<Inventory> inventories = Arrays.asList(
//                new Inventory("Tado",100.00, 1, inventory.setStoringDate(LocalDate.of(2019, 06, 24)), Collections.emptySet());
//                new Inventory("VAG","Regional","EU",Collections.emptySet()));
//        clientsRepo.saveAll(inventories);
//        logger.info("Creating new inventories => {}", inventories.toString());
//
//
//
//        List<Clients> clients = Arrays.asList(
//                new Clients("Audi","Diesel",10000.00, Collections.emptySet()),
//                new Clients("VW","Gas",20000.00,Collections.emptySet()),
//                new Clients("Toyota", "Electricity", 30000.00, Collections.emptySet()));
//        inventoryRepo.saveAll(clients);
//        logger.info("Creating new warehouse => {}", clients.toString());
//
//
//    }
//}
