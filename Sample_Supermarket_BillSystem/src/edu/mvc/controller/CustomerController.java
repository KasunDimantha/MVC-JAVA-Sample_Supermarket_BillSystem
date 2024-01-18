/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mvc.controller;

import edu.mvc.dto.CustomerDto;
import edu.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class CustomerController {
    
    private CustomerModel customerModel;

    public CustomerController() {
        
        customerModel = new CustomerModel();
    }
    
    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return customerModel.saveCustomer(customerDto);
    } 
    
    public ArrayList<CustomerDto> loadCustomer()throws Exception{
        return customerModel.loadCustomer();
    }
    
    public CustomerDto searchCustomer(String CustId) throws Exception{
        return customerModel.searchCustomer(CustId);
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerModel.updateCustomer(customerDto);
    }
    
}
