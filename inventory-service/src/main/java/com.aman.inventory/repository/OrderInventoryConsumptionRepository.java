package com.aman.inventory.repository;

import com.aman.inventory.entity.OrderInventoryConsumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderInventoryConsumptionRepository extends JpaRepository<OrderInventoryConsumption, UUID> {
}
