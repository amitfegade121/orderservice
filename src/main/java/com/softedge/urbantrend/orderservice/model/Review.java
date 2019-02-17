package com.softedge.urbantrend.orderservice.model;

import java.time.LocalDate;

public class Review {

	private double rating;
	private String reviewComment;
	private String customerName;
	private LocalDate reviewPostDate;
	private int likes;
	private int dislikes;

	public Review() {
		super();
	}

	public Review(double rating, String reviewComment, String customerName, LocalDate reviewPostDate, int likes,
			int dislikes) {
		super();
		this.rating = rating;
		this.reviewComment = reviewComment;
		this.customerName = customerName;
		this.reviewPostDate = reviewPostDate;
		this.likes = likes;
		this.dislikes = dislikes;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getReviewComment() {
		return reviewComment;
	}

	public void setReviewComment(String reviewComment) {
		this.reviewComment = reviewComment;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getReviewPostDate() {
		return reviewPostDate;
	}

	public void setReviewPostDate(LocalDate reviewPostDate) {
		this.reviewPostDate = reviewPostDate;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

}
