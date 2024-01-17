/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mvc.model;

import edu.mvc.db.DBConnection;
import edu.mvc.dto.CustomerDto;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author tharidu dilshan
 */
public class CustomerModel {
    
    public String saveCustomer(CustomerDto customerDto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String sql = "INSERt INTO customer VALUES(?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerDto.getCustId());
        statement.setString(2, customerDto.getTitle());
        statement.setString(3, customerDto.getName());
        statement.setString(4, customerDto.getDob());
        statement.setDouble(5, customerDto.getSalary());
        statement.setString(6, customerDto.getAddress());
        statement.setString(7, customerDto.getCity());
        statement.setString(8, customerDto.getProvince());
        statement.setString(9, customerDto.getZip());
        
        if(statement.executeUpdate() > 0){
            return "Success";
        } else {
            return "Fail";
        }
    }
    
    public ArrayList<CustomerDto> loadCustomer() throws Exception{
    
        Connection connection = DBConnection.getInstance().getConnection();        
        String sql = "SELECT *FROM customer";        
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();
        
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        
        while(rst.next()){
            CustomerDto dto = new CustomerDto();
            dto.setCustId(rst.getString("CustID"));
            dto.setTitle(rst.getString("CustTitle"));
            dto.setName(rst.getString("CustName"));
            dto.setDob(rst.getString("DOB"));
            dto.setSalary(Double.parseDouble(rst.getString("salary")));
            dto.setAddress(rst.getString("CustAddress"));
            dto.setCity(rst.getString("City"));
            dto.setProvince(rst.getString("Province"));
            dto.setZip(rst.getString("PostalCode"));
            
            customerDtos.add(dto);
        }
        
        return customerDtos;
        
    }
}
