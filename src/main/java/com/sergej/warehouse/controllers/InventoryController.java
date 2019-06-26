package com.sergej.warehouse.controllers;

import com.sergej.warehouse.dto.ClientsGetDTO;
import com.sergej.warehouse.dto.InventoryGetDTO;
import com.sergej.warehouse.dto.InventoryPutDTO;
import com.sergej.warehouse.services.InventoryService;
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
    private InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    private final Logger logger = LoggerFactory.getLogger(InventoryController.class);

    @GetMapping
    @ApiOperation(value = "Get whole inventory")
    public List<InventoryGetDTO> findAllTools() {
        return inventoryService.getWholeInventory();
    }

    @GetMapping("/{title}")
    @ApiOperation(value = "Get inventory by title")
    public InventoryGetDTO findInventoryByTitle(@PathVariable final String title) {
        return inventoryService.findByTitle(title);
    }

    @DeleteMapping("/{title}")
    @ApiOperation(value = "Delete inventory by title")
    public void deleteInventoryByTitle(@PathVariable final String title) {
        inventoryService.deleteToolByTitle(title);
        logger.warn("Deleting inventory {title}");
    }

    @PostMapping
    @ApiOperation(value = "Add new inventory")
    public void save(@RequestBody final InventoryPutDTO putDTO){
        inventoryService.saveInventory(putDTO);
        logger.info("Adding new inventory");
    }

    @PutMapping("/{client_id}/{inventory_title}")
    @ApiOperation(value = "Add a client to inventory")
    public void addInventoryToClient(@PathVariable final long client_id, @PathVariable final String inventory_title){
        inventoryService.addToolsToClient(inventory_title, client_id);
    }

    @GetMapping("/{title}/all-inventories")
    @ApiOperation(value = "Get inventories for client")
    public List<ClientsGetDTO> getAllClientsInventories(@PathVariable final String title) {
        return inventoryService.getAllToolsOfClient(title);
    }

    @PutMapping("/{title}")
    @ApiOperation(value = "Update inventory")
    public void updateInventory(@PathVariable final String title, @RequestBody InventoryPutDTO putDTO){
        inventoryService.updateInventory(title, putDTO);
        logger.info("Updating inventory");
    }

}
