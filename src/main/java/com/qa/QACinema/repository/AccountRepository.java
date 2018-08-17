package com.qa.QACinema.repository;


import com.qa.QACinema.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
