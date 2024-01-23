/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mvc.dto;

/**
 *
 * @author tharidu dilshan
 */
public class OrderDetailDto {
    private String orderId;
    private String itemCode;
    private Integer qty;
    private Integer discount;

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
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return the discount
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public OrderDetailDto() {
    }

    public OrderDetailDto(String orderId, String itemCode, Integer qty, Integer discount) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" + "orderId=" + orderId + ", itemCode=" + itemCode + ", qty=" + qty + ", discount=" + discount + '}';
    }
    
    
}
