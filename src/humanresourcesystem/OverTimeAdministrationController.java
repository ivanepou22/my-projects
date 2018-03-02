/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanresourcesystem;

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
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;
import travel.TravelController;

/**
 * FXML Controller class
 *
 * @author Ivan Epou
 */
public class OverTimeAdministrationController implements Initializable {

    @FXML
    private  Label newLabel;
    @FXML
    private Label editLabel;
    @FXML
    private Label deleteLabel;
    @FXML
    private Label viewLabel;
    @FXML
    private Label pasteLabel;
    @FXML
    private Label exportLabel;
    @FXML
    private Label copyLabel;
    @FXML
    private Label importLabel;
    @FXML
    private Label refreshLabelButton;
    @FXML
    private TextField searchWhat;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setToolTips();
    }    
       public void setToolTips(){
        
        //ToolTip for new button
        final Tooltip newLabe = new Tooltip();
        newLabe.setText("Create a new row");
        newLabel.setTooltip(newLabe);
        
        //ToolTip for edit button
        final Tooltip editlabe = new Tooltip();
        editlabe.setText("Edit a row");
        editLabel.setTooltip(editlabe);
        
        //ToolTip for delete button
        final Tooltip deletelabe = new Tooltip();
        deletelabe.setText("Delete a row");
        deleteLabel.setTooltip(deletelabe);
        
        //ToolTip for view button
        final Tooltip viewlabe = new Tooltip();
        viewlabe.setText("View data but can not edit the information");
        viewLabel.setTooltip(viewlabe);
        
        //ToolTip for paste button
        final Tooltip pasteLabe = new Tooltip();
        pasteLabe.setText("Used for Pasting Data after Copying");
        pasteLabel.setTooltip(pasteLabe);
        
        //ToolTip for copy button
        final Tooltip copylabe = new Tooltip();
        copylabe.setText("Used for copying Data");
        copyLabel.setTooltip(copylabe);
        
        //ToolTip for export button
        final Tooltip exportlabe = new Tooltip();
        exportlabe.setText("Used for exporting Data out of the system");
        exportLabel.setTooltip(exportlabe);
        
        //ToolTip for import button
        final Tooltip importlabe = new Tooltip();
        importlabe.setText("Used for importing Data into the system");
        importLabel.setTooltip(importlabe);
        
        //ToolTip for refresh button
        final Tooltip refreshlabes = new Tooltip();
        refreshlabes.setText("Used for refreshing the Page");
        refreshLabelButton.setTooltip(refreshlabes);
        
        //ToolTip for search TextField
        final Tooltip searches = new Tooltip();
        searches.setText("Search through the table: Enter keyword to search");
        searchWhat.setTooltip(searches);
    } 
       
          //new button in overtime categories
    @FXML
    public void newButtonOverTimeCat(){
         try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OverTimeCategoriesReg.FXML"));
                Parent border;
                border = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("OverTime Categories");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
           //new button in OverTime Requests
    @FXML
    public void newButtonOverTimeRequest(){
         try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OverTimeRequestsReg.FXML"));
                Parent border;
                border = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("OverTime Requests");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
