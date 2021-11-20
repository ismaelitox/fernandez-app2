package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

public class InventoryManagementApplicationController implements Initializable {

    @FXML
    private Menu Loa;

    @FXML
    private Button addItem;

    @FXML
    private Button clearItem;

    @FXML
    private Button deleteItem;

    @FXML
    private TableColumn<InventoryItem, String> displayItemName;

    @FXML
    private TableColumn<InventoryItem, String> displayPrice;

    @FXML
    private TableColumn<InventoryItem, String> displaySerial;

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
    private TableView<InventoryItem> tableData;

    @FXML
    void addItemToList(ActionEvent event) {

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

    @FXML
    void clearItemFromList(ActionEvent event) {

    }

    @FXML
    void deleteItemFromList(ActionEvent event) {

    }

    @FXML
    void searchFilteredList(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTable();
    }

    private void initTable() {
        initCols();
    }

    private void initCols(){
        displayItemName.setCellValueFactory(new PropertyValueFactory<>("Item Name"));
        displayPrice.setCellValueFactory(new PropertyValueFactory<>("USD Price"));
        displaySerial.setCellValueFactory(new PropertyValueFactory<>("Serial Number"));

         editableCols();
    }

    private void editableCols(){

        displayItemName.setCellFactory(TextFieldTableCell.forTableColumn());
        displayItemName.setOnEditCommit(e-> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setDescription(e.getNewValue());
        });

        displaySerial.setCellFactory(TextFieldTableCell.forTableColumn());
        displaySerial.setOnEditCommit(e-> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setDescription(e.getNewValue());
        });

        displayPrice.setCellFactory(TextFieldTableCell.forTableColumn());
        displayPrice.setOnEditCommit(e-> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setDescription(e.getNewValue());
        });

    }


}
