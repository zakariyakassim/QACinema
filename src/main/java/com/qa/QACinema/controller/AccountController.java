package com.qa.QACinema.controller;

import com.qa.QACinema.entities.Account;
import com.qa.QACinema.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/accounts")
public class AccountController {


    @Autowired
    private AccountRepository accountRepository;


    @GetMapping
    @ResponseBody
    public List<Account> retrieveAllAccounts() {

        return accountRepository.findAll();
    }

    @PostMapping
    public Account addAccount(@RequestBody Account account) {

        return accountRepository.save(account);
    }



    @GetMapping("/{id}")
    @ResponseBody
    public List<Optional<Account>> retrieveAccountById(@PathVariable Long id) {



        List<Optional<Account>> list = new ArrayList<>();
        list.add(accountRepository.findById(id));


        return list;

    }

    @DeleteMapping("/delete/{id}")
    public void deleteAccount(@PathVariable Long id) {

        accountRepository.deleteById(id);

    }



}
