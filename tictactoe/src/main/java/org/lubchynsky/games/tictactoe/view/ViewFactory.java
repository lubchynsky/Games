package org.lubchynsky.games.tictactoe.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.lubchynsky.games.tictactoe.GameManager;
import org.lubchynsky.games.tictactoe.controller.AbstractController;
import org.lubchynsky.games.tictactoe.controller.GameWindow;
import org.lubchynsky.games.tictactoe.controller.Login;
import org.lubchynsky.games.tictactoe.controller.WinnerController;

import java.io.IOException;

public class ViewFactory {

    private GameManager gameManager;

    public ViewFactory(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    public void showWinnerWindow(){
        WinnerController controller = new WinnerController(gameManager, this, "winner.fxml");
        setView(controller);
        String result = gameManager.checkForWinner()?String.format("%s wins!!!", gameManager.getPlayer()):"Draw :D";
        controller.setFinalResult(result);
    }

    public void showLoginWindow(){
        AbstractController controller = new Login(gameManager, this, "login.fxml");
        setView(controller);
    }

    public void showGameWindow(){
        GameWindow controller = new GameWindow(gameManager, this, "GameWindow.fxml");
        setView(controller);
        controller.updatePlayer();
    }

    private void setView(AbstractController controller){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFxmlName()));
        fxmlLoader.setController(controller);
        Parent parent;
        try{
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void closeStage(Stage stage){
        stage.close();
    }

}
