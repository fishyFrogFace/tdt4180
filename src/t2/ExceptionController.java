package t2;

public class ExceptionController {

    public static void show(Exception e) {
        ErrorPane errorPane = new ErrorPane(e.getMessage());
        Appointment.changeScene(errorPane);
        e.printStackTrace();
    }
}