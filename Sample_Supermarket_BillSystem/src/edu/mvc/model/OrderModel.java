/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mvc.model;

import com.sun.jdi.connect.spi.Connection;
import edu.mvc.db.DBConnection;
import edu.mvc.dto.OrderDetailDto;
import edu.mvc.dto.OrderDto;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class OrderModel {

    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDtos) throws Exception{
        java.sql.Connection connection = DBConnection.getInstance().getConnection();
        
        try {
            connection.setAutoCommit(false);
            
            String sql = "INSERT INTO orders VALUES(?,?,?)";
            PreparedStatement orderstatement = connection.prepareStatement(sql);
            orderstatement.setString(1, orderDto.getOrderId());
            orderstatement.setString(2, orderDto.getOrderDate());
            orderstatement.setString(3, orderDto.getCustID());
            
            boolean isOrderSaved = orderstatement.executeUpdate() > 0;
            
            if(isOrderSaved) {
                boolean idOrderDetailSave = true;
                
                String orderDetailSql = "INSERT INTO orderdetail VALUES(?,?,?,?)";
                for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                    PreparedStatement orderDetailstatement = connection.prepareStatement(orderDetailSql);
                    orderDetailstatement.setString(1, orderDetailDto.getOrderId());
                    orderDetailstatement.setString(2, orderDetailDto.getItemCode());
                    orderDetailstatement.setDouble(3, orderDetailDto.getDiscount());
                    orderDetailstatement.setInt(4, orderDetailDto.getQty());
                    
                    if(!(orderDetailstatement.executeUpdate() > 0)) {
                        idOrderDetailSave = false;
                    }
                }
                
                if(idOrderDetailSave) {
                    boolean isItemUpdated = true;
                    
                    String itemsql = "UPDATE item SET QtyOnHand = QtyOnHand - ? WHERE ItemCode = ?";
                    for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                        PreparedStatement itemStatement = connection.prepareStatement(itemsql);
                        itemStatement.setInt(1, orderDetailDto.getQty());
                        itemStatement.setString(2, orderDetailDto.getItemCode());
                        
                        if(!(itemStatement.executeUpdate() > 0)) {
                            isItemUpdated = false;
                        }
                    }
                    
                    if(isItemUpdated) {
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Item Update Faild";
                    }
                } else {
                    connection.rollback();
                    return "Order detail Save Faild";
                }
                
            } else {
                connection.rollback();
                return "Order Save Faild";
            }
            
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return e.getMessage();
        } finally {
            connection.setAutoCommit(true);
        }
        
        
    }
    
}
