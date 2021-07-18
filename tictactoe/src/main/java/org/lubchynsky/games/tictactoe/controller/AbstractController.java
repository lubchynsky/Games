package org.lubchynsky.games.tictactoe.controller;

import org.lubchynsky.games.tictactoe.GameManager;
import org.lubchynsky.games.tictactoe.view.ViewFactory;

public abstract class AbstractController {

    protected GameManager gameManager;
    protected ViewFactory viewFactory;
    private String fxmlName;

    public AbstractController(GameManager gameManager, ViewFactory viewFactory, String fxmlName) {
        this.gameManager = gameManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    public String getFxmlName(){
        return fxmlName;
    }
}
