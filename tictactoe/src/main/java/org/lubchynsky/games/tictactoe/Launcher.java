package org.lubchynsky.games.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.lubchynsky.games.tictactoe.view.ViewFactory;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ViewFactory viewFactory = new ViewFactory(new GameManager());
        viewFactory.showLoginWindow();
    }
}
