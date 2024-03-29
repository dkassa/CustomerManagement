package com.CustomerManagementService.Service;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerManagementService.Model.Customer;
import com.CustomerManagementService.Repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(String id, Customer customer) {
		// TODO Auto-generated method stub
		
		java.util.Optional<Customer> optionalCustomer=customerRepository.findById(id);
		if(optionalCustomer.isPresent()) {
			
			Customer data=optionalCustomer.get();
			
			data.setFirstName(customer.getFirstName());
			data.setLastName(customer.getLastName());
			data.setEmail(customer.getEmail());
			data.setAddress(customer.getAddress());
			data.setPhone(customer.getPhone());
			data.setNotes(customer.getNotes());
			
			return customerRepository.save(data);
			
		}
		return null;
	}

	@Override
	public Customer getCustomerById(String id) {
		// TODO Auto-generated method stub
		
		java.util.Optional<Customer> optionalCustomer=customerRepository.findById(id);
		
		if(optionalCustomer.isPresent()) {
			return optionalCustomer.get();
		}
		
		return null;
		
	}
	
	
	

}
