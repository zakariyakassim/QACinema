
package com.qa.QACinema.entities;

import com.qa.QACinema.Constants;

import javax.persistence.*;

@Entity
@Table(name = Constants.film_table)
public class Film {

	@Id
	@GeneratedValue
	@Column(name = Constants.film_id, unique = true)
	private long filmId;

	@Column(name = Constants.film_title)
	private long title;

	@Column(name = Constants.film_description)
	private long description;

	@Column(name = Constants.film_screenId)
	private long screenId;

	@Column(name = Constants.film_showtime)
	private long showtime;



	public Film(){

	}

	public Film(long title, long description, long screenId, long showtime) {
		this.title = title;
		this.description = description;
		this.screenId = screenId;
		this.showtime = showtime;
	}

	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}

	public void setTitle(long title) {
		this.title = title;
	}

	public void setDescription(long description) {
		this.description = description;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public void setShowtime(long showtime) {
		this.showtime = showtime;
	}

	public long getFilmId() {
		return filmId;
	}

	public long getTitle() {
		return title;
	}

	public long getDescription() {
		return description;
	}

	public long getScreenId() {
		return screenId;
	}

	public long getShowtime() {
		return showtime;
	}
}
