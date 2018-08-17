package com.qa.QACinema.repository;


import com.qa.QACinema.entities.Account;
import com.qa.QACinema.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {

}
