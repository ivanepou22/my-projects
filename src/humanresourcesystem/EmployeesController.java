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
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import travel.TravelController;

/**
 * FXML Controller class
 *
 * @author Ivan Epou
 */
public class EmployeesController implements Initializable {

    @FXML
    private AnchorPane Employeepane;
    @FXML
    private TableView employeeTable;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
       //new button in employee tab of employee Data
    @FXML
    public void newButtonEmp(){
         try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EmployeeForm.FXML"));
                Parent border;
                border = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("Employee Registration");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(EmployeesController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @FXML
    public void buttonRefreshEmp1(){

        System.out.println("humanresourcesystem.EmployeesController.buttonRefreshEmp1()");
    }
    public void settingEmployees(){
    
    }
    //new button for skills
    public void newButtonSkills(){
         try {
                FXMLLoader newSkill = new FXMLLoader(getClass().getResource("EmployeeSkills.FXML"));
                Parent border;
                border = (Parent) newSkill.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("Employee Skills");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        //new button for Employee Education
    public void newButtonEducation(){
         try {
                FXMLLoader newEducation = new FXMLLoader(getClass().getResource("EmployeeEducation.FXML"));
                Parent border;
                border = (Parent) newEducation.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("Employee Education");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
            //new button for Employee Certification
    public void newButtonCertification(){
         try {
                FXMLLoader newCertification = new FXMLLoader(getClass().getResource("EmployeeCertification.FXML"));
                Parent border;
                border = (Parent) newCertification.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("Employee Certifications");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
                //new button for Employee Languages
    public void newButtonLanguages(){
         try {
                FXMLLoader newLanguage = new FXMLLoader(getClass().getResource("EmployeeLanguages.FXML"));
                Parent border;
                border = (Parent) newLanguage.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("Employee Languages");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
                //new button for Employee Dependants
    public void newButtonDependant(){
         try {
                FXMLLoader newDependant = new FXMLLoader(getClass().getResource("EmployeeDependants.FXML"));
                Parent border;
                border = (Parent) newDependant.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("Employee Dependants");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
                //new button for Employee Emergency
    public void newButtonContact(){
         try {
                FXMLLoader newContact = new FXMLLoader(getClass().getResource("EmployeeEmergency.FXML"));
                Parent border;
                border = (Parent) newContact.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("Employee Emergency");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
                //new button for Employee Referees
    public void newButtonReferee(){
         try {
                FXMLLoader newReferee = new FXMLLoader(getClass().getResource("EmployeeReferees.FXML"));
                Parent border;
                border = (Parent) newReferee.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(border));  
                stage.setTitle("Employee Referees");
                stage.show();
                
        } catch (IOException ex) {
            Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
