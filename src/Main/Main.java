package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("/View_Controller/MainMenu.fxml"));
    
            Scene scene = new Scene(root);
        
            stage.getIcons().add(new Image("/Icons/icon.png"));
            stage.setTitle("Disaster Inventory Management System");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
