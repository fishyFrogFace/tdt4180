package t1.wordfeud;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Wordfeud extends Application {

    private final char[] letters = {'A', 'N', 'B', 'O', 'C', 'P', 'D', 'Q', 'E',
                                      'R', 'F', 'S', 'G', 'T', 'H', 'U', 'I', 'V', 
                                      'J', 'W', 'K', 'X', 'L', 'Y', 'M', 'Z'};
    
    private final int[] points = {1, 1, 4, 1, 4, 4, 2, 10, 1, 1, 4, 1, 3, 1, 4, 2, 1, 4, 10, 4, 5, 8, 1, 4, 3, 10};
    
    private final String[][] boardState = {{"", "", "DW", "", "", "", "\u2605"},
                                           {"", "DL", "", "DL", "", "", ""},
                                           {"TL", "", "", "", "TL", "", ""},
                                           {"", "", "", "DW", "", "DL", ""},
                                           {"", "", "TL", "", "", "", "DW"},
                                           {"", "R", "I", "V", "E", "R", ""},
                                           {"DL", "", "", "", "TL", "", ""}};
    
    private final int sizeOfScene = (boardState.length)*79;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = new Board(boardState);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, sizeOfScene, sizeOfScene));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
