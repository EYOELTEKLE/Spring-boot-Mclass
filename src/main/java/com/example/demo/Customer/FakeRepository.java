package com.example.demo.Customer;

import java.util.Arrays;
import java.util.List;



public class FakeRepository implements CustomerRepo
{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(new Customer("hello",1L, "sfsf","sfa@gmail.com"),
                            new Customer("esasfs",2L, "sfasfsf","sfsa@gmail.com"),
                            new Customer("selam new", 3L, "sfsafsafas","saf@gmail.com")
                );
    }
}
