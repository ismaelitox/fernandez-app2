/*
 * UCF COP 3330 Fall 2021 Application Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

package baseline;



// Inventory Object
// Use Strings for each item and stuff
// will use stuff for validation

public class InventoryItem {

    String description;
    String serial;
    String price;
    // Constructors to use class
    // created get and set methods
    // use to create instance in controller

    public InventoryItem(String description, String serial, String price) {

        this.description = description;
        this.serial = serial;
        this.price = price;
    }


    // generate set and get methods for each of the fields used.

    public String getDescription() {
        return description;
     }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSerial() {
       return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getPrice() {
       return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }







}
