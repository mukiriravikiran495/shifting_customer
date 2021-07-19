package com.shifting_customers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table( name = "reviews")
public class Reviews {

	@Id
	@Column( name = "review_id")
	private int review_id;
	
	@Column( name = "rating")
	private int rating;
	
	@Column( name = "description")
	private String description;
	
	@ManyToOne( fetch = FetchType.EAGER)
	@JoinColumn( name = "user_id")
	private User_reviews user_reviews;

	@ManyToOne( fetch = FetchType.EAGER)
	@JoinColumn( name = "merchant_id")
	@JsonBackReference
	private Merchant_reviews merchant_reviews;
	

	
	

	public void setUser_reviews(User_reviews user_reviews) {
		this.user_reviews = user_reviews;
	}

	

	public void setMerchant_reviews(Merchant_reviews merchant_reviews) {
		this.merchant_reviews = merchant_reviews;
	}

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Reviews() {
		
	}
	
}
