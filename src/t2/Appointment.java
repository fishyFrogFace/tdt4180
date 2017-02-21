package t2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.stream.IntStream;

public class Appointment extends Application {

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
/*        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        IntStream
                .range(0, 10)
                .forEach(k -> System.out.println(trace[k]));*/
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
