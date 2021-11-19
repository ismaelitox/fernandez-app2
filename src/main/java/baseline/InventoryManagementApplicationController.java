/*
 * UCF COP 3330 Fall 2021 Application Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */



package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class InventoryManagementApplicationController {

    @FXML
    private Menu Loa;

    @FXML
    private Button addItem;

    @FXML
    private Button clearItem;

    @FXML
    private Button deleteItem;

    @FXML
    private TableColumn<?, ?> displayItemName;

    @FXML
    private TableColumn<?, ?> displayPrice;

    @FXML
    private TableColumn<?, ?> displaySerial;

    @FXML
    private TextField enterPriceField;

    @FXML
    private MenuItem loadList;

    @FXML
    private TextField newItemTextField;

    @FXML
    private MenuItem saveList;

    @FXML
    private TextField searchTextField;

    @FXML
    private TextField serialNumberField;

    @FXML
    private ChoiceBox<?> sortByFilteredList;

    @FXML
    void addItemToList(String item, String serial, String price) {
        // Add item to new list
        // contain item, sn, price in USD
        // add on action

    }

    @FXML
    void addNewItemFromField(ActionEvent event) {
        // Add item from text field
        // update new list

    }

    @FXML
    void addPriceFromField(ActionEvent event) {
        // Add item from text field
        // Also price to go with Item
        // update new list

    }

    @FXML
    void addSerialNumberFromField(ActionEvent event) {
        // Add item from text field
        // Also add price to with item
        // Also add serial number to text field

    }

    @FXML
    void clearItemFromList(ActionEvent event) {
        // Clear item from list
        // allow to clear all items if needed

    }

    @FXML
    void deleteItemFromList(ActionEvent event) {
        // delete from current list
        // delete one or multiple items from list
        // add functionality later

    }

    @FXML
    void searchFilteredList(ActionEvent event) {
        // code to sort lists by their specific items if needed
        // show all


    }

}
