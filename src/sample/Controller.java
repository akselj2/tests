package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 * @author Aksel Jessen
 * @version 1.0.0 / 3.11.2020
 */

public class Controller {

    @FXML
    Button calcButton;

    @FXML
    Button resetButton;

    @FXML
    TextField gbpOut;

    @FXML
    TextField chfIn;

    @FXML
    TextField eurOut;

    @FXML
    TextField jpyOut;

    public void calculate(ActionEvent event){
        try {
            eurOut.setText(String.valueOf(Integer.parseInt(chfIn.getText()) * 0.88));
            gbpOut.setText(String.valueOf(Integer.parseInt(chfIn.getText()) * 0.787));
            jpyOut.setText(String.valueOf(Integer.parseInt(chfIn.getText()) * 114.51));
    } catch(Exception e) {
        e.printStackTrace();
    }

    }
    public void reset(ActionEvent event){
        try {
            chfIn.setText("");
            gbpOut.setText("");
            eurOut.setText("");
            jpyOut.setText("");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
