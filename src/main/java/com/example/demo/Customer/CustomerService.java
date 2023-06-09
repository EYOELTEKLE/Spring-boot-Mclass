package com.example.demo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.*;
@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo)
    {
        this.customerRepo = customerRepo;
    }
    public List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }
}
