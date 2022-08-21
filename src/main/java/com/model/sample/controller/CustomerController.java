package com.model.sample.controller;

import com.model.sample.model.Customer;
import com.model.sample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("customer")
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @PostMapping
    public Boolean addCustomer(@RequestBody Customer customer) {

        try {
            System.out.println("add works");
            customerService.addCustomer(customer);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    @PutMapping
    public Boolean updateCustomer(@RequestBody Customer customer){
        try{
            customerService.updateCustomer(customer);
            return true;
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
}
