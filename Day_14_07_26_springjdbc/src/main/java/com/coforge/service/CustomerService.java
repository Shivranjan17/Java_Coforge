package com.coforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coforge.dao.CustomerDao;
import com.coforge.entities.Customer;


@Service
public class CustomerService {
	private final JdbcTemplate jdbcTemplate;
	@Autowired
	CustomerDao dao;

	CustomerService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Customer> getAllCustomers() {
	
		return dao.getAllCustomers();
	}

	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.addCustomer(customer);
	}
	
	

	public Customer getCustomerById(long cid) {
		// TODO Auto-generated method stub
		return dao.getCustomerById(cid);
	}
	
	public int updateCustomer(Customer customer) {
		return dao.updateCustomer(customer);
	}
	
	public int deleteCustomer(long cid) {
		return dao.deleteCustomer(cid);
	}
	
	

}
