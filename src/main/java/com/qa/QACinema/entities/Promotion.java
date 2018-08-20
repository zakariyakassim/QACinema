package com.qa.QACinema.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.qa.QACinema.Constants;

@Entity
@Table(name = Constants.promotion_table)
public class Promotion {
	
	@Id
	@GeneratedValue
	@Column(name = Constants.promotion_id, unique = true)
	private long promotionId;

	@Column(name = Constants.promotion_discount)
	private String discount;

	public Promotion() {
		
	}

	public Promotion(String discount) {
		this.discount = discount;
	}

	public long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(long promotionId) {
		this.promotionId = promotionId;
	}

	public String isDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Promotion { " + 
				"promotionId=" + promotionId +
				", discount=" + 
				discount + 
				'}';
	}
	
	
	
	

}
