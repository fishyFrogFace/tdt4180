package t2.gui;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import t2.gui.exceptionhandling.ExceptionController;

import java.io.IOException;

public class ShowStage extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        try {
            AppointmentController appointmentController = new AppointmentController();
            stage.setTitle("Make an appointment");
            stage.setScene(new Scene(appointmentController, 400, 600));
        } catch (IOException e) {
            ExceptionController.show(e);
        }
        stage.show();
    }

    public static void changeScene(Parent parent) {
        stage.setScene(new Scene(parent, 300, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
