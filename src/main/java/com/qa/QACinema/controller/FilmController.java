package com.qa.QACinema.controller;



import com.qa.QACinema.entities.Film;
import com.qa.QACinema.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/api/films")
public class FilmController {


    @Autowired
    private FilmRepository filmRepository;



    @GetMapping
    @ResponseBody
    public List<Film> retrieveAllFilms() {


        return filmRepository.findAll();
    }

    @PostMapping
    public Film addFilm(@RequestBody Film film) {

        return filmRepository.save(film);

    }



    @GetMapping("/{id}")
    @ResponseBody
    public List<Optional<Film>> retrieveFilmById(@PathVariable Long id) {

        List<Optional<Film>> list = new ArrayList<>();
        list.add(filmRepository.findById(id));

        return list;

    }

    @DeleteMapping("/delete/{id}")
    public void deleteFilm(@PathVariable Long id) {

        filmRepository.deleteById(id);

    }



}
