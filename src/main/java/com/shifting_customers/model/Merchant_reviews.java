package com.shifting_customers.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table( name = "merchant_reviews")
public class Merchant_reviews {

	@Id
	@Column( name = "merchant_id")
	private long merchant_id;
	
	@OneToMany( mappedBy = "merchant_reviews")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<Reviews> reviews;


	public long getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(long merchant_id) {
		this.merchant_id = merchant_id;
	}

	public Set<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Reviews> reviews) {
		this.reviews = reviews;
	}

	public Merchant_reviews() {
		
	}
	
}
