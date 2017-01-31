package t1.wordfeud;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

class Board extends GridPane {
    
    private static final int buttonSize = 74;
    private static final String radius = "8 8 8";

    Board(String[][] boardState) {
        this.fillBoard(boardState);
        this.setHgap(4);
        this.setVgap(4);
        this.setStyle("-fx-background-color: #15181D");
    }

    private void fillBoard(String[][] boardState) {
        final int size = boardState.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Button newButton = new Button();
                newButton.setFont(Font.font("Arial Black", 40));
                newButton.setPrefSize(buttonSize, buttonSize);
                newButton.setPadding(Insets.EMPTY);
                String tileContent = boardState[i][j];
                newButton.setText(tileContent);
                switch (tileContent) {
                    case "":
                        newButton.setStyle(
                                        "-fx-background-color: #282B30; " +
                                        "-fx-background-radius: " + radius+ "; " +
                                        "-fx-text-fill: white");
                        break;
                    case "DL":
                        newButton.setStyle(
                                        "-fx-background-color: #789F76; " +
                                        "-fx-background-radius: " + radius+ "; " +
                                        "-fx-text-fill: white");
                        break;
                    case "DW":
                        newButton.setStyle(
                                        "-fx-background-color: #BF7A18; " +
                                        "-fx-background-radius: " + radius + "; " +
                                        "-fx-text-fill: white");
                        break;
                    case "TL":
                        newButton.setStyle(
                                        "-fx-background-color: #1A8899; " +
                                        "-fx-background-radius:  " + radius+ "; " +
                                        "-fx-text-fill: white");
                        break;
                    case "\u2605":
                        newButton.setStyle(
                                        "-fx-background-color: #664361; " +
                                        "-fx-background-radius:  " + radius + "; " +
                                        "-fx-text-fill: white");
                        break;
                    default:
                        newButton.setStyle(
                                        "-fx-background-color: #D5D1CE; " +
                                        "-fx-background-radius:  " + radius + "; " +
                                        "-fx-text-fill: black");
                        newButton.setFont(Font.font("Andale Mono", 50));
                }
                GridPane.setConstraints(newButton, j, i);
                this.getChildren().add(newButton);
            }
        }
    }
}
