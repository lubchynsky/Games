package org.lubchynsky.games.tictactoe.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.lubchynsky.games.tictactoe.GameManager;
import org.lubchynsky.games.tictactoe.view.ViewFactory;

public class WinnerController extends AbstractController {

    @FXML
    private Label winner;

    @FXML
    private Button againButton;

    @FXML
    void playAgain() {
        viewFactory.showGameWindow();
        Stage stage = (Stage) winner.getScene().getWindow();
        viewFactory.closeStage(stage);
    }

    public WinnerController(GameManager gameManager, ViewFactory viewFactory, String fxmlName) {
        super(gameManager, viewFactory, fxmlName);
    }

    public void setFinalResult(String res){
        winner.setText(res);
    }
}
