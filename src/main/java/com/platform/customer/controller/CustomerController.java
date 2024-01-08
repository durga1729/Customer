package com.platform.customer.controller;

import com.platform.customer.domain.Customer;
import com.platform.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getAccount")
    public ResponseEntity<Customer> getAccount(@PathVariable String customerId) {
        Customer customer= customerService.createAccount(customerId);
        return ResponseEntity.ok(customer);
    }

    @PostMapping("/createAccount")
    public ResponseEntity<String> createAccount(@RequestBody Customer customer) {
        String registerService = customerService.createAccount(customer);
        return ResponseEntity.ok(registerService);
    }

    @PutMapping("/updateAccount")
    public ResponseEntity<String> updateAccount(@PathVariable String customerId) {
        String updateAccount = customerService.updateAccount(customerId);
        return ResponseEntity.ok(updateAccount);
    }

    @DeleteMapping("/deleteAccount")
    public ResponseEntity<String> deleteAccount(@PathVariable String customerId) {
        String updateAccount = customerService.deleteAccount(customerId);
        return ResponseEntity.ok(updateAccount);
    }

}
