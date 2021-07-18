package org.lubchynsky.games.tictactoe;

public class GameManager {
    private String firstPlayer;
    private String secondPlayer;
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public String getPlayer(){
        return counter%2==0?firstPlayer:secondPlayer;
    }

    public String getSymbolAndIncrement(){
        return counter++%2==0?"X":"O";
    }

    public void setPlayers(String firstPlayer, String secondPlayer){
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }
}
