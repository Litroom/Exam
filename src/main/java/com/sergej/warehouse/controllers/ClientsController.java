package com.sergej.warehouse.controllers;

import com.sergej.warehouse.dto.ClientsGetDTO;
import com.sergej.warehouse.dto.ClientsPutDTO;
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
    public void save(@RequestBody ClientsPutDTO client){
        clientsService.saveNewClient(client);
        logger.info("saving new client");
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Remove client by id")
    public void deleteClientById(@ApiParam(value = "id",required = true) @PathVariable final long id){
        clientsService.deleteById(id);
        logger.warn("deleting a client");
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update client")
    public void updateClient(@PathVariable final long id, @RequestBody ClientsPutDTO clientsPutDTO){
        clientsService.updateClient(id, clientsPutDTO);
        logger.info("updating a client");
    }

    @PutMapping("/{client_id}/{inventory_title}")
    @ApiOperation(value = "Add a client to inventory")
    public void addToolToInventory(@PathVariable final long client_id, @PathVariable final String inventory_title){
        clientsService.addClientToInventory(inventory_title, client_id);
    }

    @GetMapping("/{id}/all-tools")
    @ApiOperation(value = "Get all tools for client")
    public List<InventoryGetDTO> getAllClientsTools(@PathVariable final Long id) {
        return clientsService.getAllClientTools(id);
    }
}
