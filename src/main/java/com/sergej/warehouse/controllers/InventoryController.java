package com.sergej.warehouse.controllers;

import com.sergej.warehouse.dto.ClientsGetDTO;
import com.sergej.warehouse.dto.ClientsPutDTO;
import com.sergej.warehouse.dto.InventoryGetDTO;
import com.sergej.warehouse.services.ClientsService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouse/inventory")
public class InventoryController {

    @Autowired
    private ClientsService clientsService;

    public InventoryController(ClientsService clientsService) {
        this.clientsService = clientsService;
    }

    private final Logger logger = LoggerFactory.getLogger(InventoryController.class);

    @GetMapping
    @ApiOperation(value = "Get all dealers")
    public List<ClientsGetDTO> findAllDeaers() {
        return clientsService.findAll();
    }

    @GetMapping("/{title}")
    @ApiOperation(value = "Get dealer by title")
    public ClientsGetDTO findDealerByTitle(@PathVariable final String title) {
        return clientsService.findByTitle(title);
    }

    @DeleteMapping("/{title}")
    @ApiOperation(value = "Delete dealer by title")
    public void deleteDealerByTitle(@PathVariable final String title) {
        clientsService.deleteByTitle(title);
        logger.warn("Deleting car dealer");
    }

    @PostMapping
    @ApiOperation(value = "Add new dealer")
    public void save(@RequestBody final ClientsPutDTO putDTO){
        clientsService.saveCarDealer(putDTO);
        logger.info("Adding new car dealer");
    }

    @GetMapping("/{title}/warehouse")
    @ApiOperation(value = "Get all warehouse")
    public List<InventoryGetDTO> getAllSongs(@PathVariable final String title){
        return clientsService.getAllSongs(title);
    }


    @PutMapping("/{title}")
    @ApiOperation(value = "Update dealer")
    public void updateDealer(@PathVariable final String title, @RequestBody ClientsPutDTO putDTO){
        clientsService.updateCarDealer(title, putDTO);
        logger.info("Updating car dealer");
    }

}
