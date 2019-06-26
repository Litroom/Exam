package com.sergej.warehouse.repositories;

import com.sergej.warehouse.entities.Clients;
import com.sergej.warehouse.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory,Long> {
    Inventory findByTitle(String title);

   void deleteByTitle(String title);
}
