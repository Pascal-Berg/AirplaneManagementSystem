package main;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class PearllyTestMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/KundendatenL√∂schen.fxml"));
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/FluglinieAnsehen.fxml"));

        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/MapFluglinien.fxml"));
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/Kundendaten√§nderung2.fxml"));
       // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/KundeAnlegen.fxml"));
       //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/Kundendaten√§nderung.fxml"));
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/FlugGesManagerAnlegen.fxml"));
       // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/FlugGesManagerAendern.fxml"));
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/fluglinieAendern.fxml"));
       //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/KundePostfach.fxml"));
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/KundePostfachMan.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Fliglinie Map");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }
}

