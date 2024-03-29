package com.CustomerManagementService.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CustomerManagementService.Controllers.CustomeerController;
import com.CustomerManagementService.Model.Customer;
import com.CustomerManagementService.Service.CustomerService;
import com.CustomerManagementService.Service.CustomerServiceImpl;

@RestController
@RequestMapping("/customers")
public class CustomeerController {
	
	
	@Autowired
	CustomerServiceImpl customerServiceimpl;
	
	@Autowired
	CustomerService customerService;
	
	
	@PostMapping("/create")
	public ResponseEntity<Customer>createDepartement(@RequestBody Customer customer){
		
		return new ResponseEntity<>(customerService.createCustomer(customer),HttpStatus.OK);
		
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Customer>getById(@PathVariable String id, @RequestBody Customer customer){
		
		return new ResponseEntity<>(customerService.updateCustomer(id,customer),HttpStatus.FOUND);
	}
	
	
	@GetMapping("/get/{id}")
	public Customer getCustomerById(@PathVariable String id){
		
		return customerService.getCustomerById(id);
	}

}
