package com.example.demo.Customer;

import com.example.demo.Exception.NotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping(value = "/api/customers/v2")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;
    @Autowired
    public CustomerControllerV2(CustomerService customerService)
    {
        this.customerService = customerService;
    }
    @GetMapping(value = "all")
    public List<Customer> course()
    {
        return customerService.getCustomers();
    }
    @GetMapping(path = "{id}")
    public Customer courses(@PathVariable("id") Long id)
    {
        return customerService.getCustomers().stream().filter(customer -> customer.getId() == id).findFirst().orElseThrow(() -> new NotFoundException("not found"));
    }
    @PostMapping
    void createCustomer(@Valid @RequestBody Customer customer)
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
