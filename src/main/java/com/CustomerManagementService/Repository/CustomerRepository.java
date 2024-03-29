package com.CustomerManagementService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerManagementService.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String>{

}
