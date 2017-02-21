package t2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class AppointmentController extends BorderPane {

    @FXML
    private TextField purpose;

    public AppointmentController() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "appointment.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }
}