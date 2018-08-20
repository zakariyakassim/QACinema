package com.qa.QACinema.entities;

import com.qa.QACinema.Constants;

import javax.persistence.*;

@Entity
@Table(name = Constants.order_table)
public class Order {



	@Id
	@GeneratedValue
	@Column(name = Constants.order_id, unique = true)
	private long orderId;

	@Column(name = Constants.account_id)
	private long accountId;
	
	@Column(name = Constants.film_id)
	private long filmId;

	public Order(){

	}

	public Order(long accountId, long filmId) {
		this.accountId = accountId;
		this.filmId = filmId;
	}

	public long getFilmId() {
		return filmId;
	}

	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getOrderId() {
		return orderId;
	}

	public long getAccountId() {
		return accountId;
	}


	@Override
	public String toString() {
		return "Order{" +
				"orderId=" + orderId +
				", accountId=" + accountId +
				'}';
	}
}
