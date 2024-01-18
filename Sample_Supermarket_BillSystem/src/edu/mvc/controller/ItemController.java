/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mvc.controller;

import edu.mvc.dto.ItemDto;
import edu.mvc.model.ItemModel;
import java.util.ArrayList;

/**
 *
 * @author tharidu dilshan
 */
public class ItemController {
    
    private ItemModel itemModel;

    public ItemController() {
        itemModel = new ItemModel();
    }
    
    
    public String saveItem(ItemDto itemDto)throws Exception {
       return itemModel.saveItem(itemDto);
    }
    
    public ArrayList<ItemDto> loadItem() throws Exception {
        return itemModel.loadItem();
    }
}
