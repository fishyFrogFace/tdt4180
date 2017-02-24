package t2.gui.exceptionhandling;

import t2.gui.ShowStage;

public class ExceptionController {

    public static void show(Exception e) {
        ErrorPane errorPane = new ErrorPane(e.getMessage());
        ShowStage.changeScene(errorPane);
        e.printStackTrace();
    }
}