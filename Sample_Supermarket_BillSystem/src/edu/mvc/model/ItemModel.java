/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mvc.model;

import edu.mvc.db.DBConnection;
import edu.mvc.dto.ItemDto;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author tharidu dilshan
 */
public class ItemModel {
    
    public String saveItem(ItemDto itemDto) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String sql = "INSERT INTO item VALUES (?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemDto.getId());
        statement.setString(2, itemDto.getDescription());
        statement.setString(3, itemDto.getPackSize());
        statement.setDouble(4, itemDto.getUnitPrice());
        statement.setInt(5, itemDto.getQoh());
        
        if(statement.executeUpdate() > 0){
            return "Success";
        } else {
            return "Fail";
        }
    }
    
    public ArrayList<ItemDto> loadItem() throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT *FROM item";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();
        
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        
        while(rst.next()) {
            ItemDto dto = new ItemDto();
            dto.setId(rst.getString("ItemCode"));
            dto.setDescription(rst.getString("Description"));
            dto.setPackSize(rst.getString("PackSize"));
            dto.setUnitPrice(Double.parseDouble(rst.getString("UnitPrice")));
            dto.setQoh(Integer.parseInt(rst.getString("QtyOnHand")));
            
            itemDtos.add(dto);
        }
        return itemDtos;
    }
    
    public ItemDto searchItem(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT *FROM item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
        
        ResultSet rst = statement.executeQuery();
        
        ItemDto dto = null;
        
        while(rst.next()) {
            dto = new ItemDto();
            dto.setId(rst.getString("ItemCode"));
            dto.setDescription(rst.getString("Description"));
            dto.setPackSize(rst.getString("PackSize"));
            dto.setUnitPrice(Double.parseDouble(rst.getString("UnitPrice")));
            dto.setQoh(Integer.parseInt(rst.getString("QtyOnHand")));
        }
        return dto;
    }
    
    public String updateItem(ItemDto itemDto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        
        String sql = "UPDATE item SET Description=?, PackSize=?, UnitPrice=?, QtyOnHand=? WHERE ItemCode=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, itemDto.getDescription());
        statement.setString(2, itemDto.getPackSize());
        statement.setDouble(3, itemDto.getUnitPrice());
        statement.setInt(4, itemDto.getQoh());
        statement.setString(5, itemDto.getId());
        
        if(statement.executeUpdate() > 0){
            return "Succesfully Updated";
        } else {
            return "Update Fail";
        }
    }

    public String deleteItem(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        
        String sql = "DELETE FROM item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
        
        if(statement.executeUpdate() > 0){
            return "Success";
        } else {
            return "Fail";
        }
    }




}
