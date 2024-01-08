package com.platform.customer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Customer {
    String name;
    Address address;
    String phone;
    String email;
}
