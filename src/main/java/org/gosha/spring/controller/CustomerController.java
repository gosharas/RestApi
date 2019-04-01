package org.gosha.spring.controller;

import org.gosha.spring.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.gosha.spring.repository.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping({"/customers"})
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List findAll(){
        return this.customerRepository.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public Customer findById(@PathVariable long id){
        return this.customerRepository.getOne(id);
    }

    @PostMapping
    public  Customer create(@RequestBody Customer customer){
        return this.customerRepository.save(customer);
    }

    @DeleteMapping(path = {"/{id}"})
    public void delete(@PathVariable long id){
        this.customerRepository.deleteById(id);
    }



}
