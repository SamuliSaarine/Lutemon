package com.example.lutemon;

//0=continue 1=player won 2=enemy won
public class TurnResult {

    private String message;
    private boolean continueBattle;

    public TurnResult(String message, boolean continueBattle)
    {
        this.message=message;
        this.continueBattle=continueBattle;
    }

    public String getMessage(){return message;}

    public boolean battleContinues(){return continueBattle;}
}
