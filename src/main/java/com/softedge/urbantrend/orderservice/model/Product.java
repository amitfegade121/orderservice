package com.softedge.urbantrend.orderservice.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

	@Id
	private long productId;
	private String imageURL;
	private String productName;
	private double productRating;
	private Map<String, String> productDetails;
	private Map<String, String> productSpecification;
	private List<Review> ratingsAndReviews;
	private List<QuestionAndAnswer> questionsAndAnswers;
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductRating() {
		return productRating;
	}

	public void setProductRating(double productRating) {
		this.productRating = productRating;
	}

	public Map<String, String> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(Map<String, String> productDetails) {
		this.productDetails = productDetails;
	}

	public Map<String, String> getProductSpecification() {
		return productSpecification;
	}

	public void setProductSpecification(Map<String, String> productSpecification) {
		this.productSpecification = productSpecification;
	}

	public List<Review> getRatingsAndReviews() {
		return ratingsAndReviews;
	}

	public void setRatingsAndReviews(List<Review> ratingsAndReviews) {
		this.ratingsAndReviews = ratingsAndReviews;
	}

	public List<QuestionAndAnswer> getQuestionsAndAnswers() {
		return questionsAndAnswers;
	}

	public void setQuestionsAndAnswers(List<QuestionAndAnswer> questionsAndAnswers) {
		this.questionsAndAnswers = questionsAndAnswers;
	}

}
