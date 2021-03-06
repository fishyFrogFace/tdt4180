package t2.gui.exceptionhandling;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

class ErrorPane extends VBox {

    private final Text error = new Text("Scene could not be loaded");
    private final Text message;

    ErrorPane(String message) {
        this.message = new Text(message);
        ScrollPane box = messageWrapper();
        this.getChildren().addAll(error, box);
    }

    private ScrollPane messageWrapper() {
        ScrollPane box = new ScrollPane();
        box.setContent(message);
        return box;
    }
}