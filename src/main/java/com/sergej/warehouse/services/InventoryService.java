package com.sergej.warehouse.services;

import com.sergej.warehouse.dto.ClientsGetDTO;
import com.sergej.warehouse.dto.InventoryGetDTO;
import com.sergej.warehouse.dto.InventoryPutDTO;
import com.sergej.warehouse.entities.Clients;
import com.sergej.warehouse.entities.Inventory;
import com.sergej.warehouse.repositories.ClientsRepo;
import com.sergej.warehouse.repositories.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepo inventoryRepo;
    @Autowired
    private ClientsRepo clientsRepo;

    public InventoryService(InventoryRepo inventoryRepo, ClientsRepo clientsRepo) {
        this.inventoryRepo = inventoryRepo;
        this.clientsRepo = clientsRepo;
    }

    @Transactional(readOnly = true)
    public List<InventoryGetDTO> getWholeInventory() {
        return inventoryRepo.findAll().stream().map(tools ->
                new InventoryGetDTO(tools.getTitle() , tools.getWeight(), tools.getInventorySection(),
                        tools.getStoringDate()))
                .collect(Collectors.toList());
    }

    @Transactional
    public InventoryGetDTO findByTitle(String title) {
        Inventory inventory = inventoryRepo.findByTitle(title);
        if (inventory != null) {
            return new InventoryGetDTO(inventory.getTitle() , inventory.getWeight(),
                    inventory.getInventorySection(), inventory.getStoringDate());
        }
        return null;
    }

    @Transactional
    public void saveInventory(InventoryPutDTO inventoryPutDTO) {
        Inventory inventory = new Inventory();
        inventory.setTitle(inventoryPutDTO.getTitle());
        inventory.setWeight(inventoryPutDTO.getWeight());
        inventory.setInventorySection(inventoryPutDTO.getInventorySection());
        inventory.setStoringDate(inventoryPutDTO.getStoringDate());
        inventoryRepo.save(inventory);
    }

    @Transactional
    public void deleteToolByTitle(String title) {
        inventoryRepo.deleteByTitle(title);
    }

    @Transactional
    public void addToolsToClient(String tool_title, Long client_id) {
        Inventory inventory = inventoryRepo.findByTitle(tool_title);
        Clients client = clientsRepo.getOne(client_id);
        if(client != null){
            client.getInventory().add(inventory);
        }
    }

        @Transactional
    public List<ClientsGetDTO> getAllToolsOfClient(String title) {
        Inventory inventory = inventoryRepo.findByTitle(title);
        if(inventory != null){
            return inventory.getClients().stream().map(client ->
                    new ClientsGetDTO(client.getId(),
                            client.getFirstName(),
                            client.getLastName(),
                            client.getDateOfBirth(),
                            client.getPhoneNumber(),
                            client.getClientType())
                    ).collect(Collectors.toList());
        }
        return null;
    }

    @Transactional
    public void updateInventory(String title, InventoryPutDTO inventoryPutDTO) {
        Inventory inventory = inventoryRepo.findByTitle(title);
        if (inventory != null){
            inventory.setTitle(inventoryPutDTO.getTitle());
            inventory.setWeight(inventoryPutDTO.getWeight());
            inventory.setInventorySection(inventoryPutDTO.getInventorySection());
            inventory.setStoringDate(inventoryPutDTO.getStoringDate());
        }
    }
}
