package com.sergej.warehouse.controllers;

import com.sergej.warehouse.dto.ClientsGetDTO;
import com.sergej.warehouse.dto.InventoryGetDTO;
import com.sergej.warehouse.dto.InventoryPutDTO;
import com.sergej.warehouse.services.ClientsService;
import com.sergej.warehouse.services.InventoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "Clients controller")
@RequestMapping("/warehouse/clients")
public class ClientsController {


    @Autowired
    private ClientsService clientsService;

    public ClientsController(ClientsService clientsService) {
        this.clientsService = clientsService;
    }

    private final Logger logger = LoggerFactory.getLogger(ClientsController.class);

    //Get All Clients

    @GetMapping
    @ApiOperation(value = "Get all clients", notes = "Returns all clients from server")
    public List<ClientsGetDTO> getAllClients(){
        return clientsService.findAll();
    }

    @GetMapping("/{id}")
    public ClientsGetDTO getById(
            @ApiParam(value = "id", required = true)
            @PathVariable long id){
        return clientsService.findById(id);
    }

    @PostMapping
    @ApiOperation(value = "Save new client")
    public void save(@RequestBody InventoryPutDTO car){
        inventoryService.saveCar(car);
        logger.info("saving new car");
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Remove car by id")
    public void deleteCarById(@ApiParam(value = "id",required = true) @PathVariable final long id){
        inventoryService.deleteCarById(id);
        logger.warn("deleting a car");
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update car")
    public void updateSong(@PathVariable final long id, @RequestBody InventoryPutDTO inventoryPutDTO){
        inventoryService.updateSong(id, inventoryPutDTO);
        logger.info("updating a car");
    }

    @PutMapping("/{car_id}/{dealer_title}")
    @ApiOperation(value = "Add a car to dealer")
    public void addCarToDealer(@PathVariable final long car_id, @PathVariable final String dealer_title){
        inventoryService.addCarToCarDealer(car_id,dealer_title);
    }

}
