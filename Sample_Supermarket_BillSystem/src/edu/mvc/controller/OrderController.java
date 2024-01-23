/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mvc.controller;

import edu.mvc.dto.OrderDetailDto;
import edu.mvc.dto.OrderDto;
import edu.mvc.model.OrderModel;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class OrderController {
    
    private OrderModel orderModel;

    public OrderController() {
        this.orderModel = new OrderModel();
    }
    
    
    
    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDto) throws Exception {
     return orderModel.placeOrder(orderDto, orderDetailDto);   
    }
}
