/*
 * UCF COP 3330 Fall 2021 Application Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

package baseline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import java.util.function.BooleanSupplier;

public class InventoryGUI {

    // Create new observable list to use for inventory class
    // Create new filter list to use for inventory class
    ObservableList<InventoryItem> inventoryItems = FXCollections.observableArrayList();
    // Wrapper to use for the observable list
    // will use for search bar functionality
    FilteredList<InventoryItem> sortedInventory = new FilteredList<>(inventoryItems, p->true);

    public FilteredList<InventoryItem> getSortedInventory(){

        return this.sortedInventory;
    }



    // get inventory items to add to observable list
    public ObservableList<InventoryItem> getInventoryItems(){

        return this.inventoryItems;

    }
    // add helper function for call in controller class
    // parameters ensure a proper object is added to list

    public BooleanSupplier addTask(String description, String serial, String price)
    {
        inventoryItems.add(new InventoryItem(description, serial, price));
        return null;
    }
    // delete helper function for call in controller class
    // Call the inventory items
    // called created list
    // use built in delete function
    public void delete(InventoryItem item)
    {
        inventoryItems.remove(item);
    }

    // Method to clear the list
    // call the inventory items
    // call created list
    // use  built in clear function
    public void clear(){

        inventoryItems.clear();

    }








}
