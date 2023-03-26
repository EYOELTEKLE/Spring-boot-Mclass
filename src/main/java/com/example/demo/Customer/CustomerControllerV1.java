package com.example.demo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Deprecated
@RequestMapping(value = "/api/customers/v1")
@RestController
public class CustomerControllerV1 {

    private final CustomerService customerService;
    @Autowired
    public CustomerControllerV1(CustomerService customerService)
    {
        this.customerService = customerService;
    }
    @GetMapping(path="{id}")
    public List<Customer> course(@PathVariable("id") Long id)
    {
        return customerService.getCustomers();
    }
    @PostMapping
    void createCustomer(@RequestBody Customer customer)
    {
        System.out.println("POST request");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer)
    {
        System.out.println("update request");
        System.out.println(customer);
    }
    @DeleteMapping(path="{customer_Id}")
    void deleteCustomer(@PathVariable("customer_Id") Long id)
    {
        System.out.println("delete request");

    }


}
