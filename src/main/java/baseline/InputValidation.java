package baseline;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Separate class to use for validation
// Boolean values to determine is valid
public class InputValidation {
   /*

    public boolean validItem (String itemDesc){

        Pattern p = Pattern.compile("[2-256]");
        Matcher m = p.matcher(itemDesc.get());
        if(m.find() && m.group().equals(itemDesc.getText)) {

            return true;
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Invalid Item");
            alert.setHeaderText(null);
            alert.setContentText("Please Enter an Item between 2 & 256 characters ");
            alert.showAndWait();

            return false;
        }
    }

    */
}
