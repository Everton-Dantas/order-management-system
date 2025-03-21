package com.fiap.productservice.controller;

import com.fiap.productservice.model.Customer;
import com.fiap.productservice.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

@PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
    return customerService.createCustomer(customer);
}

}
