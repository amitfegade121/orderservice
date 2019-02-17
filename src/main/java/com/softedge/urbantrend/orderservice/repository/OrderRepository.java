package com.softedge.urbantrend.orderservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.softedge.urbantrend.orderservice.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

}
