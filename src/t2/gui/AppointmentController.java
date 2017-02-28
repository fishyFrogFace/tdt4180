package t2.gui;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import t2.app.Appointment;
import t2.app.AppointmentBuilder;

import java.io.IOException;
import java.net.URL;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

public class AppointmentController extends BorderPane implements Initializable {

    @FXML
    private TextField purpose;

    @FXML
    private ComboBox<String> room = new ComboBox<>();

    @FXML
    private DatePicker date;

    @FXML
    private ComboBox<String> from = new ComboBox<>();

    @FXML
    private ComboBox<String> to = new ComboBox<>();

    @FXML
    private TextField daysBetween;

    @FXML
    private DatePicker toDate;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

    public AppointmentController() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "appointment.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }

    @FXML
    public Appointment submit() throws ParseException {
        return AppointmentBuilder.appointment()
                .withPurpose(purpose.getText())
                .withRoom(room.getValue())
                .withDate(date.getValue())
                .withFromTime(dateFormat.parse(from.getValue()))
                .withToTime(dateFormat.parse(to.getValue()))
                .withFrequency(Integer.parseInt(daysBetween.getText()))
                .withToDate(toDate.getValue())
                .build();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        room.getItems().addAll("IT-vest 234", "Bygg 3 234", "Ananas 34");
        from.getItems().addAll("10:00", "10:30", "11:00", "11:30");
        to.getItems().addAll("10:00", "10:30", "11:00", "11:30");
    }
}