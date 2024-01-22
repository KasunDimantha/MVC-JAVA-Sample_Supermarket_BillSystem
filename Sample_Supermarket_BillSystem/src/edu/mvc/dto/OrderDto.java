/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mvc.dto;

/**
 *
 * @author tharidu dilshan
 */
public class OrderDto {
    private String orderId;
    private String orderDate;
    private String custID;

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    public OrderDto() {
    }

    public OrderDto(String orderId, String orderDate, String custID) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.custID = custID;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", orderDate=" + orderDate + ", custID=" + custID + '}';
    }
    
    
}
