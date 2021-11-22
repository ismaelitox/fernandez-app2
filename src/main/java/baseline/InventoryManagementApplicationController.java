package baseline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class InventoryManagementApplicationController implements Initializable {


    // Instance for my handler
    // Instance in t
    InventoryGUI handler = new InventoryGUI();
    InputValidation validator = new InputValidation();

  // ObservableList<Object> filteredList = FXCollections.observableArrayList();


    @FXML
    private Menu Loa;

    @FXML
    private Button addItem;

    @FXML
    private Button clearItem;

    @FXML
    private Button deleteItem;



    @FXML
    private TextField enterPriceField;

    @FXML
    private TableColumn<InventoryItem, String> item_col;

    @FXML
    private MenuItem loadList;

    @FXML
    private TextField newItemTextField;

    @FXML
    private TableColumn<InventoryItem, String> price_col;

    @FXML
    private MenuItem saveList;

    @FXML
    private TextField searchTextField;



    @FXML
    private TextField serialNumberField;

    @FXML
    private TableColumn<InventoryItem, String> serial_col;

    @FXML
    private ChoiceBox<?> sortByFilteredList;

    @FXML
    private TableView<InventoryItem> tableInfo;
    //Takes parameters from text field
    //
    @FXML
    void addItemToList(ActionEvent event) {


        String itemDesc = newItemTextField.getText();
        String serialNum = serialNumberField.getText();
        String priceUSD = enterPriceField.getText();
        handler.addTask(itemDesc,serialNum,priceUSD);

       // if (validator.validItem(itemDesc)

       // }

    }

    @FXML
    void addNewItemFromField(ActionEvent event) {

    }

    @FXML
    void addPriceFromField(ActionEvent event) {


    }

    @FXML
    void addSerialNumberFromField(ActionEvent event) {

    }
    // Called from instance from GUI handler class
    // clear the list
    @FXML
    void clearItemFromList(ActionEvent event) {
        handler.clear();
    }

    @FXML
    void deleteItemFromList(ActionEvent event) {
        // Delete selected List function
        // Atomic allows for selected function to automatically update
        // with given value

        AtomicReference<InventoryItem> remove = new AtomicReference<>();
        remove.set(tableInfo.getSelectionModel().getSelectedItem());
        System.out.println(tableInfo.getSelectionModel().getSelectedItem());
        handler.delete(remove.get());

    }

    @FXML
    void searchFilteredList(ActionEvent event) {



    }
    // Initialize my editable columns for tableView
    // call separate function within initialize package

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTable();



    }

    // Helper function to initialize the table

    private void initTable() {
        initCols();

    }
    // function to initialize each collum for my table view
    // also set items to use with handler called
    private void initCols() {

        item_col.setCellValueFactory(new PropertyValueFactory<>("description"));
        serial_col.setCellValueFactory(new PropertyValueFactory<>("serial"));
        price_col.setCellValueFactory(new PropertyValueFactory<>("price"));
        tableInfo.setItems(handler.getInventoryItems());

        editableCols();



    }
    // Function to use for editable columns
    // Pulled from youtube JAVAFX tutorial
    // allows for edit of each item in class

    private void editableCols(){

        item_col.setCellFactory(TextFieldTableCell.forTableColumn());

        item_col.setOnEditCommit(event -> {
        event.getTableView().getItems().get(event.getTablePosition().getRow()).setDescription(event.getNewValue());
        });

        serial_col.setCellFactory(TextFieldTableCell.forTableColumn());

        serial_col.setOnEditCommit(event -> {
            event.getTableView().getItems().get(event.getTablePosition().getRow()).setSerial(event.getNewValue());
        });

        price_col.setCellFactory(TextFieldTableCell.forTableColumn());

        price_col.setOnEditCommit(event -> {
            event.getTableView().getItems().get(event.getTablePosition().getRow()).setPrice(event.getNewValue());
        });

        tableInfo.setEditable(true);

    }
    // May or may not be used or called in final function






}
