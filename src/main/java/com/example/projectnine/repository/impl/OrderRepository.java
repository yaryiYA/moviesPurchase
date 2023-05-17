package com.example.projectnine.repository.impl;

import com.example.projectnine.entity.Order;
import com.example.projectnine.repository.CommonRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface OrderRepository extends CommonRepository<Order> {
}