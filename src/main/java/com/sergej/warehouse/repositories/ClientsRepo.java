package com.sergej.warehouse.repositories;

import ch.qos.logback.core.net.server.Client;
import com.sergej.warehouse.entities.Clients;
import com.sergej.warehouse.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.LongAccumulator;

@Repository
public interface ClientsRepo extends JpaRepository<Clients,Long> {

    void deleteById(Long id);
}
