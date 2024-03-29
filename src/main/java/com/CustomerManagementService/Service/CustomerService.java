package com.CustomerManagementService.Service;

import org.springframework.stereotype.Service;

import com.CustomerManagementService.Model.Customer;

public interface CustomerService {
	
	Customer createCustomer(Customer customer);
	Customer updateCustomer(String id,Customer customer);
	Customer getCustomerById(String id);

}
