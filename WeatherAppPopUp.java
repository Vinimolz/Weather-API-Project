package weatherapppopup;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mbase
 */
public class WeatherAppPopUp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Label location = new Label("Location: ");
        Label date = new Label("Date");
        Label time = new Label("Time");
        Label temperature = new Label("Temperature: ");
        Label humidity = new Label("Humidity: ");
        Label cloudiness = new Label("Cloudiness: ");
        Label airQuality = new Label("Air Quality: ");
        btn.setText("Expand");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button works!");
            }
        });
        
        VBox vBox = new VBox(5);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(btn, location, date, time, temperature, humidity, cloudiness, airQuality);
        
        Scene scene = new Scene(vBox, 600, 300);
        
        primaryStage.setTitle("Weather Update");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

