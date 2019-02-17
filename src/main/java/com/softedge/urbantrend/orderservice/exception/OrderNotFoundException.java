package com.softedge.urbantrend.orderservice.exception;

public class OrderNotFoundException extends Exception {

	public OrderNotFoundException() {
	}

	public OrderNotFoundException(String message) {
		super(message);
	}
}
