package org.lubchynsky.games.tictactoe.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Login {

    @FXML
    private AnchorPane errorCode;

    @FXML
    private Button startGameButton;

    @FXML
    private TextField firstPlayerName;

    @FXML
    private TextField secondPlayerName;

    @FXML
    void startGame() {
        System.out.println("It works");
    }

}