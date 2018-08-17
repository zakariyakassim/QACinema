package com.qa.QACinema.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.qa.QACinema.entities.Seat;
import com.qa.QACinema.repository.SeatRepository;

@Controller
@RequestMapping("/api/seats")
public class SeatController {

	
	@Autowired
    private SeatRepository seatRepository;
	
	@GetMapping
    @ResponseBody
    public List<Seat> retrieveAllSeats() {

        return seatRepository.findAll();
    }

    @PostMapping
    public Seat addSeat(@RequestBody Seat seat) {

        return seatRepository.save(seat);
    }



    @GetMapping("/{id}")
    @ResponseBody
    public List<Optional<Seat>> retrieveSeatById(@PathVariable Long id) {



        List<Optional<Seat>> list = new ArrayList<>();
        list.add(seatRepository.findById(id));


        return list;

    }

    @DeleteMapping("/delete/{id}")
    public void deleteSeat(@PathVariable Long id) {

    	seatRepository.deleteById(id);

    }

}
