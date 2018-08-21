package com.qa.QACinema.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.qa.QACinema.Constants;


@Entity
@Table(name = Constants.screen_table)
public class Screen {

	@Id
	@GeneratedValue
	@Column(name = Constants.screen_id, unique = true)
	private long screenId;
    

	@Column(name = Constants.seat_id)
	private long seatId;
	
	
	@Column(name = Constants.film_id)
	private long filmId;
	

	public Screen() {
		
	}

	public Screen(long seatId, long filmId) {
		this.seatId = seatId;
		this.filmId = filmId;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}

	public long getFilmId() {
		return filmId;
	}

	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}

	@Override
	public String toString() {
		return " Screen{" + 
				"screenId=" + screenId + 
				", seatId=" + seatId + 
				", filmId=" + filmId +
				'}';
	}
	
	
}
	

