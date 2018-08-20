package com.qa.QACinema.controller;


import com.qa.QACinema.entities.Promotion;
import com.qa.QACinema.repository.PromotionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/promotion")
public class PromotionController {

	@Autowired
    private PromotionRepository promotionRepository;
	
	@GetMapping
    @ResponseBody
    public List<Promotion> retrieveAllPromotion() {
		System.out.println("clicked");
        return promotionRepository.findAll();
    }

    @PostMapping
    public Promotion addPromotion(@RequestBody Promotion promotion) {
    	System.out.println("clicked");
        return promotionRepository.save(promotion);
    }



    @GetMapping("/{id}")
    @ResponseBody
    public List<Optional<Promotion>> retrievePromotionById(@PathVariable Long id) {



        List<Optional<Promotion>> list = new ArrayList<>();
        list.add(promotionRepository.findById(id));


        return list;

    }

    @DeleteMapping("/delete/{id}")
    public void deletePromotion(@PathVariable Long id) {

    	promotionRepository.deleteById(id);

    }

}
