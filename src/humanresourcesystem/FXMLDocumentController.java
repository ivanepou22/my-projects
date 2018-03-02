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
package humanresourcesystem;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
//import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.util.Duration;
import javafx.stage.Stage;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;

/**
 *
 * @author Ivan Epou
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane loginAcnhorPane;
    @FXML
    private AnchorPane activitiesPane;
    @FXML
    private Label toplabel;
     @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
                Stage stage1 = (Stage) loginAcnhorPane.getScene().getWindow();
                stage1.close();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RoleCenter.FXML"));
                Parent border = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("Role Center");
                stage.setMaximized(true);
                stage.show();  
                
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        if (!HumanResourceSystem.isLoaded){
            loadSplash();
        }
    }    
    private void loadSplash(){
        HumanResourceSystem.isLoaded = true;
        HBox box;
        try {
            box = FXMLLoader.load(getClass().getResource(("slashscreen.FXML")));
            loginAcnhorPane.getChildren().setAll(box);
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(3),box);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);
            fadeIn.setCycleCount(1);
            
            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3),box);
            fadeOut.setFromValue(0);
            fadeOut.setToValue(1);
            fadeOut.setCycleCount(1);
            fadeIn.play();
            fadeIn.setOnFinished((e)->{
                    fadeOut.play();
                    });
            fadeOut.setOnFinished((e)->{
                try {
                    AnchorPane mainContent = FXMLLoader.load(getClass().getResource(("FXMLDocument.FXML")));
                    loginAcnhorPane.getChildren().setAll(mainContent);
                } catch (IOException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   
     
}
