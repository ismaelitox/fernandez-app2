package baseline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagementApplicationControllerTest {

    InventoryGUI guiTest = new InventoryGUI();



    // create new list
    // populate and then test
    //
    @Test
    void addItemToListTest() {
        ObservableList<InventoryItem> inventoryItems = FXCollections.observableArrayList();
        inventoryItems.add(new InventoryItem("Jonah's","6323","499.99"));
        guiTest.addTask("Jonah's","6323","523.99");
        assertEquals(inventoryItems,guiTest.inventoryItems);


    }


    @Test
    void addSerialNumberFromFieldTest() {
    }
    // Test for clear item
    // new list
    // test if clear
    @Test
    void clearItemFromList() {
        ObservableList<InventoryItem> inventoryItems = FXCollections.observableArrayList();
        guiTest.addTask("Descr","serial","499.99");
        guiTest.clear();
        assertEquals(inventoryItems,guiTest.inventoryItems);
    }
    // Test for deleted item
    // new list
    // test if deleted
    //
    @Test
    void deleteItemFromList() {

    }
    // search from filtered list
    // use listener to pull from columns
    @Test
    void searchFilteredList() {
    }
}