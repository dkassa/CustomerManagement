package com.CustomerManagementService.Model;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customerTable")

public class Customer {
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="demo-customer")
	@GenericGenerator(name="demo-customer",strategy="com.CustomerManagementService.Model.StringPrefixSequenceGenerator",parameters= {
			
			@Parameter(name=StringPrefixSequenceGenerator.INCREMENT_PARAM, value="1"),
			@Parameter(name=StringPrefixSequenceGenerator.value_prefix_parameter,value="CUST"),
			@Parameter(name=StringPrefixSequenceGenerator.number_format_parameter,value="%06d")
			
	})
	
	
	//@GenericGenerator(name="cust_id",strategy="com.CustomerManagementService.Model.CustomIdGenerator");
	
	private String customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private Address address;
	private String notes;
	private CustomFields customfields;
	
	

}
