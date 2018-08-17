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


import com.qa.QACinema.entities.Screen;
import com.qa.QACinema.repository.ScreenRepository;

@Controller
@RequestMapping("/api/screens")
public class ScreenController {
	
	  @Autowired
	    private ScreenRepository screenRepository;


	    @GetMapping
	    @ResponseBody
	    public List<Screen> retrieveAllScreens() {

	        return screenRepository.findAll();
	    }

	    @PostMapping
	    public Screen addScreen(@RequestBody Screen screen) {

	        return screenRepository.save(screen);
	    }



	    @GetMapping("/{id}")
	    @ResponseBody
	    public List<Optional<Screen>> retrieveScreenById(@PathVariable Long id) {



	        List<Optional<Screen>> list = new ArrayList<>();
	        list.add(screenRepository.findById(id));


	        return list;

	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteScreen(@PathVariable Long id) {

	        screenRepository.deleteById(id);

	    }

}
