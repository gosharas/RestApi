package org.gosha.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.gosha.spring.repository.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping({"/customers"})
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List findAll(){
        return customerRepository.findAll();
    }
}
