package org.lubchynsky.games.tictactoe.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.lubchynsky.games.tictactoe.GameManager;
import org.lubchynsky.games.tictactoe.view.ViewFactory;

public class Login extends AbstractController {

    @FXML
    private Label errorCode;

    @FXML
    private Button startGameButton;

    @FXML
    private TextField firstPlayerName;

    @FXML
    private TextField secondPlayerName;

    public Login(GameManager gameManager, ViewFactory viewFactory, String fxmlName) {
        super(gameManager, viewFactory, fxmlName);
    }

    @FXML
    void startGame() {
        if(checkNames()){
            gameManager.setPlayers(firstPlayerName.getText(), secondPlayerName.getText());
            viewFactory.showGameWindow();
            Stage stage = (Stage) errorCode.getScene().getWindow();
            viewFactory.closeStage(stage);
        }
    }

    private boolean checkNames() {
        if (firstPlayerName.getText().isEmpty()) {
            errorCode.setText("Please set first player name!");
            return false;
        }
        if (secondPlayerName.getText().isEmpty()) {
            errorCode.setText("Please set second player name!");
            return false;
        }
        return true;
    }
}