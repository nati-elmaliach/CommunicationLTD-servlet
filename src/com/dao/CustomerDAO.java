package com.dao;

import java.util.List;
import com.entity.Customer;

public interface CustomerDAO {
	
	List<Customer> get();
	
	boolean saveCustomer(Customer c);
}