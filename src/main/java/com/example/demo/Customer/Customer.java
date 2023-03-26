package com.example.demo.Customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import net.minidev.json.annotate.JsonIgnore;


public class Customer {
    @NotNull
    private final String name;


    private final Long id;
    @NotNull
    private final String password;


    private final String email;
    public Customer(String name, Long id, String password,String email) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }




    public String getPassword() {
        return password;
    }




}
