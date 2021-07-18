package org.lubchynsky.games.tictactoe.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.lubchynsky.games.tictactoe.GameManager;
import org.lubchynsky.games.tictactoe.view.ViewFactory;

public class GameWindow extends AbstractController{

    @FXML
    private Label whosTurn;

    @FXML
    private Button button4;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button1;

    @FXML
    private Button button5;

    @FXML
    private Button button9;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button6;

    public void updatePlayer(){
        whosTurn.setText(String.format("%s's turn!", gameManager.getPlayer()));
    }

    public GameWindow(GameManager gameManager, ViewFactory viewFactory, String fxmlName) {
        super(gameManager, viewFactory, fxmlName);
    }

    private void setValue(Button button){
        button.setDisable(true);
        button.setText(gameManager.getSymbolAndIncrement());
        updatePlayer();
    }

    @FXML
    void setValue1() {
        setValue(button1);
    }

    @FXML
    void setValue2() {
        setValue(button2);
    }

    @FXML
    void setValue3() {
        setValue(button3);
    }

    @FXML
    void setValue4() {
        setValue(button4);
    }

    @FXML
    void setValue5() {
        setValue(button5);
    }

    @FXML
    void setValue6() {
        setValue(button6);
    }

    @FXML
    void setValue7() {
        setValue(button7);
    }

    @FXML
    void setValue8() {
        setValue(button8);
    }

    @FXML
    void setValue9() {
        setValue(button9);
    }
}
