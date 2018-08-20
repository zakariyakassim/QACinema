package com.qa.QACinema.controller;



import com.qa.QACinema.entities.Order;
import com.qa.QACinema.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/api/orders")
public class OrderController {


    @Autowired
    private OrderRepository orderRepository;




    @GetMapping
    @ResponseBody
    public List<Order> retrieveAllOrders() {

    	 System.out.println("its working 6");
        return orderRepository.findAll();
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order) {

    	 System.out.println("its working 4");
        return orderRepository.save(order);


    }



    @GetMapping("/{id}")
    @ResponseBody
    public List<Optional<Order>> retrieveOrderById(@PathVariable Long id) {

        System.out.println("its working 2");

        List<Optional<Order>> list = new ArrayList<>();
        list.add(orderRepository.findById(id));


        return list;

    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable Long id) {

        orderRepository.deleteById(id);

    }



}
