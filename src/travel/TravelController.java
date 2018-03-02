/*
============================================================================================================
Adroit HRM V1.0.0 - (c)Copyright Adroit Solutions Ltd. 2017.
This object includes confidential information and intellectual property of Adroit Solutions Ltd,
and is protected by local and international copyright and Trade Secret laws and agreements.
------------------------------------------------------------------------------------------------------------
Change Log
------------------------------------------------------------------------------------------------------------
DATE       | Author               | Version | Description
------------------------------------------------------------------------------------------------------------
15-08-2017 | EPOU IVAN            | V1.0.0  | Version Completed

============================================================================================================
*/
package travel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ivan Epou
 */
public class TravelController implements Initializable {

    @FXML
    private AnchorPane Employeepane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //call the method
       //newButtonEmp();
    }    
//new button in employee tab of employee Data
    @FXML
    public void newButtontravel(){
         try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TravelForm.FXML"));
                Parent border;
                border = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("Travel Requests");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @FXML
    public void buttonDeletetravel(){
        //Code Here
    }
}
