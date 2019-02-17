package com.softedge.urbantrend.orderservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softedge.urbantrend.orderservice.exception.OrderNotFoundException;
import com.softedge.urbantrend.orderservice.model.Order;
import com.softedge.urbantrend.orderservice.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/orders")
	public ResponseEntity<Order> placeNewOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.placeNewOrder(order), HttpStatus.OK);
	}
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> findAllOrders() {
		return new ResponseEntity<List<Order>>(orderService.findAllOrders(), HttpStatus.OK);
	}
	
	@GetMapping("/orders/{orderId}") 
	public ResponseEntity<Order> findOrderById(@PathVariable String orderId) {
		ResponseEntity<Order> response = null;
		try {
			response = new ResponseEntity<Order>(orderService.findOrderById(orderId), HttpStatus.OK);
		}
		catch(OrderNotFoundException ex) {
			response = new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@PutMapping("/orders")
	public ResponseEntity<Order> changeOrderStatus(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.changeOrderStatus(order), HttpStatus.OK);
	}
	
}








 