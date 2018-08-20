
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
	private String title;

	@Column(name = Constants.film_description)
	private String description;

	@Column(name = Constants.film_screenId)
	private long screenId;

	@Column(name = Constants.film_showtime)
	private String showtime;



	public Film(){

	}

	public Film(String title, String description, long screenId, String showtime) {
		this.title = title;
		this.description = description;
		this.screenId = screenId;
		this.showtime = showtime;
	}

	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}

	public long getFilmId() {
		return filmId;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public long getScreenId() {
		return screenId;
	}

	public String getShowtime() {
		return showtime;
	}
	
	
}
