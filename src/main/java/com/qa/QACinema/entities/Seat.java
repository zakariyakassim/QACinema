package com.qa.QACinema.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.qa.QACinema.Constants;

@Entity
@Table(name = Constants.seat_table)
public class Seat {

	@Id
	@GeneratedValue
	@Column(name = Constants.seat_id, unique = true)
	private long seatId;

	@Column(name = Constants.seat_booked)
	private boolean booked;

	public Seat() {
		
	}

	public Seat(long seatId, boolean booked) {
		this.booked = booked;
	}

	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}

	public boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}
	
	
	
	@Override
	public String toString() {
		return " Seat{" + 
				"seatId=" + seatId + 
				", booked =" + booked+ 
				'}';
	}

}
