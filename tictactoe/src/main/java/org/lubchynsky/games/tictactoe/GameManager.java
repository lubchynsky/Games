package org.lubchynsky.games.tictactoe;

import java.util.Arrays;

public class GameManager {
    private String firstPlayer;
    private String secondPlayer;
    private int counter;
    private String[] res;

    public boolean isOver(){
        return counter==8;
    }

    public GameManager() {
        counter=-1;
        res = new String[9];
        Arrays.fill(res, "");
    }

    public String getPlayer(){
        return counter%2==0?firstPlayer:secondPlayer;
    }

    public void setSymbolInResults(int place){
        res[place]=getSymbol();
    }

    public void updatePlayer(){
        counter++;
    }

    public String getWinner(){
        return getPlayer();
    }

    public String getSymbol(){
        return counter%2==0?"X":"O";
    }

    public void setPlayers(String firstPlayer, String secondPlayer){
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public boolean checkForWinner() {
        return checkHor()||checkVer()||checkDiag();
    }

    private boolean checkHor(){
        for(int line =0;line<3;line++){
            if(!res[line*3].isEmpty() && res[line*3].equals(res[line*3+1]) && res[line*3].equals(res[line*3+2])){
                return true;
            }
        }
        return false;
    }

    private boolean checkVer(){
        for(int col =0;col<3;col++){
            if(!res[col].isEmpty() && res[col].equals(res[col+3]) && res[col].equals(res[col+6])){
                return true;
            }
        }
        return false;
    }

    private boolean checkDiag(){
            return !res[4].isEmpty() && (res[4].equals(res[0]) && res[4].equals(res[8]) || res[4].equals(res[2]) && res[4].equals(res[6]));
    }

    public void resetResults() {
        Arrays.fill(res, "");
        counter=0;
    }
}
