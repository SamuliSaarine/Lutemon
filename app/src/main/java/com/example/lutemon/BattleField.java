package com.example.lutemon;

import java.util.Random;

public class BattleField
{
    private Lutemon player;
    private Lutemon enemy;
    private final Random random = new Random();

    private boolean playerTurn;

    private static BattleField instance;

    public static BattleField getInstance()
    {
        if(instance==null)
        {
            instance=new BattleField();
        }
        return  instance;
    }

    public void setPlayer(Lutemon lutemon)
    {
        player = lutemon;
    }

    public void getEnemy()
    {
        if(player==null){player=Player.getInstance().getLutemons().get(0);}
        int enemyExperience = player.getExperience()+random.nextInt(5)-2;
        if (enemyExperience < 0) enemyExperience = 0;
        enemy=Lutemon.randomLutemon(enemyExperience);
    }

    public TurnResult turn()
    {
        String message="";

        if(playerTurn)
        {
            message += player.doAttack(enemy);
        }
        else
        {
            message += enemy.doAttack(player);
        }

        if(player.getHealth()>0&&enemy.getHealth()>0)
        {
            playerTurn = !playerTurn;
            message+="\n";
            return new TurnResult(message,true);
        }
        else if(player.getHealth()>enemy.getHealth())
        {
            playerWon();
            message += "\n Player won :)";
            return new TurnResult(message,false);
        }
        else
        {
            enemyWon();
            message += "\n Enemy won :(";
            return new TurnResult(message,false);
        }
    }

    void enemyWon()
    {
        Player.getInstance().killLutemon(player);
        player=null;
    }

    void playerWon()
    {
        player.addMaxHealth();
    }
}