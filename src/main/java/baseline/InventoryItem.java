/*
 * UCF COP 3330 Fall 2021 Application Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

package baseline;

import java.awt.*;
import javafx.scene.control.Button;

public class InventoryItem {

    String description;
    String serial;
    String price;

    Button addItem;

    public InventoryItem(String description, String serial, String price, Button addItem) {
        this.description = description;
        this.serial = serial;
        this.price = price;
        this.addItem = addItem;
    }


    public String getDescription(){

        return description;
    }
    public String getSerial(){

        return serial;
    }
    public  String getPrice(){

        return price;
    }

    public void setDescription(String description){
        this.description = description;

    }

    public void setSerial(String serial){
        this.serial = serial;

    }

    public void setPrice(String price){
        this.price = price;

    }
}
