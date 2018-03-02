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
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author EPOU IVANs
 */

public class HumanResourceSystem extends Application {
    public static Boolean isLoaded = false;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
        stage.resizableProperty().setValue(Boolean.FALSE);

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }
    
}
