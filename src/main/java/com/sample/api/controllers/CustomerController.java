package com.sample.api.controllers;

import com.sample.api.dto.CustomerResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/customers")
@RestController
public class CustomerController {

    @GetMapping
    public ResponseEntity<List<CustomerResponseDto>> getAllCustomers() {
        System.out.println("Listing all customers");

        CustomerResponseDto customer1 = new CustomerResponseDto(1, "Customer 1");
        CustomerResponseDto customer2 = new CustomerResponseDto(2, "Customer 2");
        List<CustomerResponseDto> list = Arrays.asList(customer1, customer2);

        return ResponseEntity.ok(list);
    }
}
