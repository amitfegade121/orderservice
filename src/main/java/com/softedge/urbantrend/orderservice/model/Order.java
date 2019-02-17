package com.softedge.urbantrend.orderservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {

	public enum OrderStatus {
		PLACED, IN_PROCESS, CANCELLED, DELIVERED, RETURNED
	};

	@Id
	private String orderId;
	private Product product;
	private int quantity;
	private OrderStatus orderStatus;
	private double orderTotal;
	private long customerId;

	public Order() {
		super();
	}

	public Order(Product product, int quantity, OrderStatus orderStatus, double orderTotal, long customerId) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
		this.orderTotal = orderTotal;
		this.customerId = customerId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

}
