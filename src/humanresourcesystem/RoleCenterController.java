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
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
//import static javafx.collections.FXCollections.observableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Ivan Epou
 */
public class RoleCenterController implements Initializable {
    private ObservableList<String> FinanceList;
    private ObservableList<String> documentList;
    private ObservableList<String> settingList;
    private ObservableList<String> adminList;
    private ObservableList<String> employeeList;
    private ObservableList<String> leaveList;
    private ObservableList<String> payrollList;
    private ObservableList<String> personalList;
    private ObservableList<String> timeList;
    private ObservableList<String> recruiteList;
    private ObservableList<String> companyList;
    private ObservableList<String> homeList;
    //private ObservableList<String> companyList;
    @FXML
    private ListView<String> Finance;
    @FXML
    private ListView<String> documents;
    @FXML
    private ListView<String> setting;
    @FXML
    private ListView<String> admin;
    @FXML
    private ListView<String> employee;
    @FXML
    private ListView<String> leave;
    @FXML
    private ListView<String> payroll;
    @FXML
    private ListView<String> personal;
    @FXML
    private ListView<String> time;
    @FXML
    private ListView<String> recruite;
    @FXML
    private ListView<String> company;
    @FXML
    private ListView<String> home;
    @FXML
    private AnchorPane activitiesPane;
    @FXML
    private Label toplabel;
    @FXML
    private Label HomeLabel;
    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        //Home List
        homeList=FXCollections.observableArrayList();
        homeList.add("Role Center");
        home.setItems(homeList);
        home.getSelectionModel().isSelected(1);
        //Admin menu List
        adminList = FXCollections.observableArrayList();
        adminList.add("Company Structure");
        adminList.add("Job Details Setup");
        adminList.add("Qualification Setup");
        adminList.add("Projects/Clients Setup");
        adminList.add("Comapny Loans");
        adminList.add("Training Setup");
        adminList.add("Leave Setup");
        adminList.add("Audit Log");
        admin.setItems(adminList);
        //employees menu items
        employeeList=FXCollections.observableArrayList();
        employeeList.add("Employee");
        employeeList.add("Employee History");
        employeeList.add("Document Management");
        employeeList.add("Travel Administration");
        employeeList.add("Expense Administration");
        employeeList.add("Monitor Attendance");
        employeeList.add("OverTime Administration");
        employee.setItems(employeeList);
        //Leave Management
        leaveList=FXCollections.observableArrayList();
        leaveList.add("Leave Management");
        leaveList.add("Leave Calendar");
        leave.setItems(leaveList);
        //Payroll Management
        payrollList=FXCollections.observableArrayList();
        payrollList.add("Salary");
        payrollList.add("Payroll Reports");
        payroll.setItems(payrollList);
        //Personal Information
        personalList=FXCollections.observableArrayList();
        personalList.add("Basic Information");
        personalList.add("Qualifications");
        personalList.add("Dependants");
        personalList.add("Emergency Contacts");
        personal.setItems(personalList);
        //Time management
        timeList=FXCollections.observableArrayList();
        timeList.add("Projects");
        timeList.add("Attendance");
        timeList.add("Time Sheet");
        timeList.add("Attendance Sheet");
        timeList.add("OverTime Requests");
        time.setItems(timeList);
        //Recruitement
        recruiteList=FXCollections.observableArrayList();
        recruiteList.add("Recruitement Setup");
        recruiteList.add("Job Applications");
        recruiteList.add("Candidates");
        recruite.setItems(recruiteList);
        //Company items Setup
        companyList=FXCollections.observableArrayList();
        companyList.add("Item Setup");
        companyList.add("Items");
        companyList.add("Statistics");
        company.setItems(companyList);
        // Finance menu Items
        FinanceList = FXCollections.observableArrayList();
        FinanceList.add("Expenses");
        FinanceList.add("Salaries");
        FinanceList.add("LOans");
        Finance.setItems(FinanceList);

        
        //Document menu items
        documentList= FXCollections.observableArrayList();
        documentList.add("My Documents");
        documentList.add("HR Forms");
        documents.setItems(documentList);
        
        //settings menu items
        settingList=FXCollections.observableArrayList();
        settingList.add("Settings");
        settingList.add("Users");
        settingList.add("Manage Metadata");
        settingList.add("Data");
        setting.setItems(settingList);
        //setting the role center
        if (toplabel.getText().equals("Role Center")){
                    try {
            BorderPane homes;
            homes = FXMLLoader.load(RoleCenterController.this.getClass().getResource("CenterRole.FXML"));
            activitiesPane.getChildren().setAll(homes);
            toplabel.setText("Role Center");
        }catch (IOException ex) {
            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        initActions();
    }    
    public void initActions(){
    //Detecting mouse clicked on admin menu items
    admin.setOnMouseClicked(new EventHandler() {
        @Override
        public void handle(Event event) {
          //Check wich list item is selected then set txtContent value for that item
                    if("Company Structure".equals(admin.getSelectionModel().getSelectedItem())){
                                               try {
                            // Displaying the company structures List
                            AnchorPane travel;
                            travel = FXMLLoader.load(getClass().getResource(("/Admin/CompanyStructure.FXML")));
                            activitiesPane.getChildren().setAll(travel);
                            toplabel.setText("Company Structure");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                       
                    }

                    else if("Job Details Setup".equals(admin.getSelectionModel().getSelectedItem())){

                        // Displaying the jobs List
                       try{
                            AnchorPane jobs;
                            jobs = FXMLLoader.load(getClass().getResource(("/Admin/JobDetailsSetup.FXML")));
                            activitiesPane.getChildren().setAll(jobs);
                            //change Title
                            toplabel.setText("Job Details Setup");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    else if("Qualification Setup".equals(admin.getSelectionModel().getSelectedItem())){
                        // Displaying the qualification List
                       try{
                            AnchorPane qualification;
                            qualification = FXMLLoader.load(getClass().getResource(("/Admin/QualificationSetup.FXML")));
                            activitiesPane.getChildren().setAll(qualification);
                            //change Title
                            toplabel.setText("Qualification Setup");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    else if("Projects/Clients Setup".equals(admin.getSelectionModel().getSelectedItem())){
                        // Displaying the projects List
                       try{
                            AnchorPane project;
                            project = FXMLLoader.load(getClass().getResource(("/Admin/ProjectsClientsSetup.FXML")));
                            activitiesPane.getChildren().setAll(project);
                            //change Title
                            toplabel.setText("Projects/Clients Setup");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else if("Comapny Loans".equals(admin.getSelectionModel().getSelectedItem())){
                        // Displaying the company Loans
                       try{
                            AnchorPane loans;
                            loans = FXMLLoader.load(getClass().getResource(("/Admin/CompanyLoans.FXML")));
                            activitiesPane.getChildren().setAll(loans);
                            //change Title
                            toplabel.setText("Comapny Loans");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }				 
                    }

                    else if("Training Setup".equals(admin.getSelectionModel().getSelectedItem())){
                       try{
                            AnchorPane training;
                            training = FXMLLoader.load(getClass().getResource(("/Admin/TrainingSetup.FXML")));
                            activitiesPane.getChildren().setAll(training);
                            //change Title
                            toplabel.setText("Training Setup");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }				 
                    }
                    else if("Leave Setup".equals(admin.getSelectionModel().getSelectedItem())){
                       try{
                            AnchorPane leave;
                            leave = FXMLLoader.load(getClass().getResource(("/Admin/LeaveSetup.FXML")));
                            activitiesPane.getChildren().setAll(leave);
                            //change Title
                            toplabel.setText("Leave Setup");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }					 
                    }							 

                    else if("Audit Log".equals(admin.getSelectionModel().getSelectedItem())){
                       try{
                            AnchorPane audit;
                            audit = FXMLLoader.load(getClass().getResource(("/Admin/AuditLog.FXML")));
                            activitiesPane.getChildren().setAll(audit);
                            //change Title
                            toplabel.setText("Audit Log");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {

                    }		  
        }
    });
            //Detecting mouse clicked on employee menu items
    employee.setOnMouseClicked(new EventHandler(){
                @Override
        public void handle(Event event) {
        //Check wich list item is selected then set txtContent value for that item
                    if("Employee".equals(employee.getSelectionModel().getSelectedItem())){
                            
                        try {
                            AnchorPane employeeReg = FXMLLoader.load(getClass().getResource(("Employees.FXML")));
                             activitiesPane.getChildren().setAll(employeeReg);
                             toplabel.setText("Employees");
                             
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                           					 
                    }

                    else if("Employee History".equals(employee.getSelectionModel().getSelectedItem())){
                            //Put code here
                            toplabel.setText("Employee History");
                    }

                    else if("Document Management".equals(employee.getSelectionModel().getSelectedItem())){
                            //Change the Title
                            toplabel.setText("Document Management");
                    }

                    else if("Travel Administration".equals(employee.getSelectionModel().getSelectedItem())){
                        try {
                            // Displaying the travel Requests List
                            AnchorPane traveling;
                            traveling = FXMLLoader.load(getClass().getResource(("/travel/Travel.FXML")));
                            activitiesPane.getChildren().setAll(traveling);
                            toplabel.setText("Travel Administration");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else if("Expense Administration".equals(employee.getSelectionModel().getSelectedItem())){
                        try {
                            // Displaying the travel Requests List
                            AnchorPane expense;
                            expense = FXMLLoader.load(getClass().getResource(("ExpenseAdmin.FXML")));
                            activitiesPane.getChildren().setAll(expense);
                            toplabel.setText("Expense Administration");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    else if("Monitor Attendance".equals(employee.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane monitor;
                            monitor = FXMLLoader.load(getClass().getResource(("MonitorAttendance.FXML")));
                            activitiesPane.getChildren().setAll(monitor);
                            toplabel.setText("Monitor Attendance");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }				 
                    }
                    else if("OverTime Administration".equals(employee.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane overtime;
                            overtime = FXMLLoader.load(getClass().getResource(("OverTimeAdministration.FXML")));
                            activitiesPane.getChildren().setAll(overtime);
                            toplabel.setText("Monitor Attendance");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }					 
                    }							 

                    else {
                    }							 

            }




    });
    
  //Detecting mouse clicked on Leave management menu items
    leave.setOnMouseClicked(new EventHandler(){
                @Override
        public void handle(Event event) {
        //Check wich list item is selected then set txtContent value for that item
                    if("Leave Management".equals(leave.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane leaveman;
                            leaveman = FXMLLoader.load(getClass().getResource(("/LeaveManagement/LeaveManage.FXML")));
                            activitiesPane.getChildren().setAll(leaveman);
                            toplabel.setText("Leave Management");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     					 
                    }
                    else if("Leave Calendar".equals(leave.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane leavecal;
                            leavecal = FXMLLoader.load(getClass().getResource(("/LeaveManagement/LeaveCalendar.FXML")));
                            activitiesPane.getChildren().setAll(leavecal);
                            toplabel.setText("Leave Calendar");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }							 

                    else {
                    }							 

            }




    });
      //Detecting mouse clicked on Payroll management menu items
    payroll.setOnMouseClicked(new EventHandler(){
                @Override
        public void handle(Event event) {
        //Check wich list item is selected then set txtContent value for that item
                    if("Salary".equals(payroll.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the salary details List
                            AnchorPane sal;
                            sal = FXMLLoader.load(getClass().getResource(("/PayRoll/Salary.FXML")));
                            activitiesPane.getChildren().setAll(sal);
                            toplabel.setText("Payroll=>Salary");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }				 
                    }
                    else if("Payroll Reports".equals(payroll.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane pay;
                            pay = FXMLLoader.load(getClass().getResource(("/PayRoll/PayRollReports.FXML")));
                            activitiesPane.getChildren().setAll(pay);
                            toplabel.setText("Payroll Reports");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }							 

                    else {
                    }							 
            }
    });
          //Detecting mouse clicked on Personal management menu items
    personal.setOnMouseClicked(new EventHandler(){
                @Override
        public void handle(Event event) {
        //Check wich list item is selected then set txtContent value for that item
                    if("Basic Information".equals(personal.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane basic;
                            basic = FXMLLoader.load(getClass().getResource(("/PersonalInformation/BasicInformation.FXML")));
                            activitiesPane.getChildren().setAll(basic);
                            toplabel.setText("Basic Information");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     					 
                    }
                    else if("Qualifications".equals(personal.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane qual;
                            qual = FXMLLoader.load(getClass().getResource(("/PersonalInformation/Qualifications.FXML")));
                            activitiesPane.getChildren().setAll(qual);
                            toplabel.setText("Qualifications");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                   else if("Dependants".equals(personal.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane depend;
                            depend = FXMLLoader.load(getClass().getResource(("/PersonalInformation/Dependants.FXML")));
                            activitiesPane.getChildren().setAll(depend);
                            toplabel.setText("Dependants");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                   else if("Emergency Contacts".equals(personal.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane emerge;
                            emerge = FXMLLoader.load(getClass().getResource(("/PersonalInformation/EmergencyContacts.FXML")));
                            activitiesPane.getChildren().setAll(emerge);
                            toplabel.setText("Emergency Contacts");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                    else {
                    }							 
            }
    });
    //Detecting mouse clicked on Time management menu items
    time.setOnMouseClicked(new EventHandler(){
                @Override
        public void handle(Event event) {
        //Check wich list item is selected then set txtContent value for that item
                    if("Projects".equals(time.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane proj;
                            proj = FXMLLoader.load(getClass().getResource(("/TimeManagement/Projects.FXML")));
                            activitiesPane.getChildren().setAll(proj);
                            toplabel.setText("Projects");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }				 
                    }
                    else if("Attendance".equals(time.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane attend;
                            attend = FXMLLoader.load(getClass().getResource(("/TimeManagement/Attendance.FXML")));
                            activitiesPane.getChildren().setAll(attend);
                            toplabel.setText("Attendance");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                   else if("Time Sheet".equals(time.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane tim;
                            tim = FXMLLoader.load(getClass().getResource(("/TimeManagement/TimeSheet.FXML")));
                            activitiesPane.getChildren().setAll(tim);
                            toplabel.setText("Time Sheet");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                   else if("Attendance Sheet".equals(time.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane attendsheet;
                            attendsheet = FXMLLoader.load(getClass().getResource(("/TimeManagement/AttendanceSheet.FXML")));
                            activitiesPane.getChildren().setAll(attendsheet);
                            toplabel.setText("Attendance Sheet");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                   else if("OverTime Requests".equals(time.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane overtime;
                            overtime = FXMLLoader.load(getClass().getResource(("/TimeManagement/OverTimeRequests.FXML")));
                            activitiesPane.getChildren().setAll(overtime);
                            toplabel.setText("OverTime Requests");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    else {
                    }							 
            }
    });
   //Detecting mouse clicked on recruitement management menu items
    recruite.setOnMouseClicked(new EventHandler(){
                @Override
        public void handle(Event event) {
        //Check wich list item is selected then set txtContent value for that item
                    if("Recruitement Setup".equals(recruite.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane recruites;
                            recruites = FXMLLoader.load(getClass().getResource(("/Recruitement/RecruitementSetup.FXML")));
                            activitiesPane.getChildren().setAll(recruites);
                            toplabel.setText("Recruitement Setup");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }				 
                    }
                    else if("Job Applications".equals(recruite.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane jobapp;
                            jobapp = FXMLLoader.load(getClass().getResource(("/Recruitement/JobApplication.FXML")));
                            activitiesPane.getChildren().setAll(jobapp);
                            toplabel.setText("Job Applications");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                   else if("Candidates".equals(recruite.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane cand;
                            cand = FXMLLoader.load(getClass().getResource(("/Recruitement/Candidates.FXML")));
                            activitiesPane.getChildren().setAll(cand);
                            toplabel.setText("Candidates");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    else {
                    }							 
            }
    });
       //Detecting mouse clicked on Company Items management menu items
    company.setOnMouseClicked(new EventHandler(){
                @Override
        public void handle(Event event) {
        //Check wich list item is selected then set txtContent value for that item
                    if("Item Setup".equals(company.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane itemset;
                            itemset = FXMLLoader.load(getClass().getResource(("/CompanyItems/ItemSetup.FXML")));
                            activitiesPane.getChildren().setAll(itemset);
                            toplabel.setText("Item Setup");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     					 
                    }
                    else if("Items".equals(company.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane items;
                            items = FXMLLoader.load(getClass().getResource(("/CompanyItems/Items.FXML")));
                            activitiesPane.getChildren().setAll(items);
                            toplabel.setText("Items");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                   else if("Statistics".equals(company.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane statics;
                            statics = FXMLLoader.load(getClass().getResource(("/CompanyItems/Statistics.FXML")));
                            activitiesPane.getChildren().setAll(statics);
                            toplabel.setText("Statistics");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    else {
                    }							 
            }
    });
           //Detecting mouse clicked on Finance management menu items
    Finance.setOnMouseClicked(new EventHandler(){
                @Override
        public void handle(Event event) {
        //Check wich list item is selected then set txtContent value for that item
                    if("Expenses".equals(Finance.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane expen;
                            expen = FXMLLoader.load(getClass().getResource(("/Finance/Expenses.FXML")));
                            activitiesPane.getChildren().setAll(expen);
                            toplabel.setText("Expenses");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     					 
                    }
                    else if("Salaries".equals(Finance.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane sala;
                            sala = FXMLLoader.load(getClass().getResource(("/Finance/Salaries.FXML")));
                            activitiesPane.getChildren().setAll(sala);
                            toplabel.setText("Salaries");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                   else if("LOans".equals(Finance.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane loan;
                            loan = FXMLLoader.load(getClass().getResource(("/Finance/Loans.FXML")));
                            activitiesPane.getChildren().setAll(loan);
                            toplabel.setText("Loans");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    else {
                    }							 
            }
    });
     //Detecting mouse clicked on Company Documents management menu items
    documents.setOnMouseClicked(new EventHandler<Event>() {
        @Override
        public void handle(Event event) {
            //Check wich list item is selected then set txtContent value for that item
            if("My Documents".equals(documents.getSelectionModel().getSelectedItem())){
                //Change Title
                toplabel.setText("My Documents");
                
            }
            else if("HR Forms".equals(documents.getSelectionModel().getSelectedItem())){
                //Change Title
                toplabel.setText("HR Forms");
                
            }
            
            else {
            }
        }
    });

  //Detecting mouse clicked on Company settings management menu items
    setting.setOnMouseClicked(new EventHandler(){
                @Override
        public void handle(Event event) {
        //Check wich list item is selected then set txtContent value for that item
                    if("Settings".equals(setting.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane sets;
                            sets = FXMLLoader.load(getClass().getResource(("/Settings/Setting.FXML")));
                            activitiesPane.getChildren().setAll(sets);
                            toplabel.setText("Settings");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     					 
                    }
                    else if("Users".equals(setting.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane user;
                            user = FXMLLoader.load(getClass().getResource(("/Settings/Users.FXML")));
                            activitiesPane.getChildren().setAll(user);
                            toplabel.setText("Users");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                     else if("Manage Metadata".equals(setting.getSelectionModel().getSelectedItem())){
                         try {
                            // Displaying the travel Requests List
                            AnchorPane meta;
                            meta = FXMLLoader.load(getClass().getResource(("/Settings/ManageMetaData.FXML")));
                            activitiesPane.getChildren().setAll(meta);
                            toplabel.setText("Manage Metadata");
                        } catch (IOException ex) {
                            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else if("Data".equals(setting.getSelectionModel().getSelectedItem())){
                        //Change Title
                            toplabel.setText("Company Data");

                    }

                    else {
                    }							 
            }
    });

    HomeLabel.setOnMouseClicked((Event event) -> {
        try {
            BorderPane homelabel;
            homelabel = FXMLLoader.load(RoleCenterController.this.getClass().getResource("CenterRole.FXML"));
            activitiesPane.getChildren().setAll(homelabel);
            toplabel.setText("Role Center");
        }catch (IOException ex) {
            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    home.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
        try {
            BorderPane homebuttons;
            homebuttons = FXMLLoader.load(RoleCenterController.this.getClass().getResource("CenterRole.FXML"));
            activitiesPane.getChildren().setAll(homebuttons);
            toplabel.setText("Role Center");
        }catch (IOException ex) {
            Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    }//initactions method ends here
}
