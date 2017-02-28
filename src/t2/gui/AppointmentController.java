package t2.gui;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import t2.app.Appointment;
import t2.app.AppointmentBuilder;

import java.io.IOException;
import java.sql.Time;

public class AppointmentController extends BorderPane {

    @FXML
    private TextField purpose;

    @FXML
    private ComboBox<String> room = new ComboBox<>(
            FXCollections.observableArrayList(
                "IT-vest 234", "Bygg 3 234", "Ananas 34"
            ));

    @FXML
    private DatePicker date;

    @FXML
    private ComboBox<String> from = new ComboBox<>(
            FXCollections.observableArrayList(
                    "10:00", "10:30", "11:00", "11:30"
            ));

    @FXML
    private ComboBox<String> to = new ComboBox<>(
            FXCollections.observableArrayList(
                    "10:00", "10:30", "11:00", "11:30"
            ));

    @FXML
    private TextField daysBetween;

    @FXML
    private DatePicker toDate;

    public AppointmentController() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "appointment.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }

    @FXML
    public Appointment submit() {
        return AppointmentBuilder.appointment()
                .withPurpose(purpose.getText())
                .withRoom(room.getValue())
                .withDate(date.getValue())
                .withFromTime(Time.valueOf(from.getValue()))
                .withToTime(Time.valueOf(to.getValue()))
                .withFrequency(Integer.parseInt(daysBetween.getText()))
                .withToDate(toDate.getValue())
                .build();
    }
}