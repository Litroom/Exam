package com.sergej.warehouse.services;

import com.sergej.warehouse.dto.ClientsGetDTO;
import com.sergej.warehouse.dto.InventoryGetDTO;
import com.sergej.warehouse.entities.Clients;
import com.sergej.warehouse.entities.Inventory;
import com.sergej.warehouse.repositories.ClientsRepo;
import com.sergej.warehouse.dto.ClientsPutDTO;
import com.sergej.warehouse.repositories.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientsService {

    @Autowired
    private ClientsRepo clientsRepo;
    @Autowired
    private InventoryRepo inventoryRepo;

    public ClientsService(ClientsRepo clientsRepo, InventoryRepo inventoryRepo) {
        this.clientsRepo = clientsRepo;
        this.inventoryRepo = inventoryRepo;
    }

    @Transactional
    public List<ClientsGetDTO> findAll() {
        return clientsRepo.findAll().stream().map(client ->
                new ClientsGetDTO(client.getId(),
                        client.getFirstName(),
                        client.getLastName(),
                        client.getDateOfBirth(),
                        client.getPhoneNumber(),
                        client.getClientType()
                )).collect(Collectors.toList());
    }

    @Transactional
    public ClientsGetDTO findById(Long id) {
        Clients client = clientsRepo.getOne(id);
        if (client != null) {
            return new ClientsGetDTO(client.getId(),
                    client.getFirstName(),
                    client.getLastName(),
                    client.getDateOfBirth(),
                    client.getPhoneNumber(),
                    client.getClientType()
);
        }
        return null;
    }

    @Transactional
    public void deleteById(Long id) {
        clientsRepo.deleteById(id);
    }


    @Transactional
    public void saveNewClient(ClientsPutDTO putDTO) {
        Clients client = new Clients();
        client.setFirstName(putDTO.getFirstName());
        client.setLastName(putDTO.getLastName());
        client.setDateOfBirth(putDTO.getDateOfBirth());
        client.setPhoneNumber(putDTO.getPhoneNumber());
        client.setClientType(putDTO.getClientType());
        clientsRepo.save(client);
    }

    @Transactional
    public void addClientToInventory(String tool_title, Long client_id) {
        Inventory inventory = inventoryRepo.findByTitle(tool_title);
        Clients client = clientsRepo.getOne(client_id);
        if(inventory != null){
            inventory.getClients().add(client);
        }
    }

    @Transactional
    public List<InventoryGetDTO> getAllClientTools(Long id) {
        Clients clients = clientsRepo.getOne(id);
        if(clients != null){
            return clients.getInventory().stream().map(tool ->
                    new InventoryGetDTO(tool.getTitle(),tool.getWeight(),tool.getInventorySection(),
                            tool.getStoringDate())
                    ).collect(Collectors.toList());
        }
        return null;
    }

    @Transactional
    public void updateClient(Long id, ClientsPutDTO putDTO) {
        Clients client = clientsRepo.getOne(id);
        if(client != null){
            client.setFirstName(putDTO.getFirstName());
            client.setLastName(putDTO.getLastName());
            client.setDateOfBirth(putDTO.getDateOfBirth());
            client.setPhoneNumber(putDTO.getPhoneNumber());
            client.setClientType(putDTO.getClientType());
        }
    }
}

