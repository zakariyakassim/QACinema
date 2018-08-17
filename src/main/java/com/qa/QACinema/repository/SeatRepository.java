package com.qa.QACinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.QACinema.entities.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long>{

}
