package com.platform.customer.service;

import com.platform.customer.CustomerApplication;
import com.platform.customer.domain.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Customer createAccount(String customerId) {
        return Customer.builder().build();
    }

    public String createAccount(Customer customer) {
      return "Created Account Successfully";
    }

    public String updateAccount(String customerId) {
        return "updated Account Successfully";
    }

    public String deleteAccount(String customerId) {
        return "Deleted Account Successfully";
    }
}
