package com.qa.QACinema.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qa.QACinema.Constants;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = Constants.order_table)
public class Order  {



	@Id
	@GeneratedValue
	@Column(name = Constants.order_id, unique = true)
	private long orderId;


	@Column(name = Constants.film_id)
	private long filmId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = Constants.account_id)
	private Account account;

	public Order(){

	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}


	public long getFilmId() {
		return filmId;
	}

	public long getOrderId() {
		return orderId;
	}

	public Account getAccount() {
		return account;
	}
}
