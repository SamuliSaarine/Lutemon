package com.example.lutemon;

import java.util.ArrayList;

public class Player {
    ArrayList<Lutemon> lutemons = new ArrayList<>();

    private static Player player = null;

    public static Player getInstance()
    {
        if(player==null)
        {
            player=new Player();
        }
        return  player;
    }

    //Creating lutemon
    public void addLutemon(String name)
    {
        Lutemon lutemon = Lutemon.randomLutemon();
        lutemon.giveName(name);
        lutemons.add(lutemon);
    }

    public void killLutemon(Lutemon lutemon)
    {
        lutemons.remove(lutemon);
    }

    ArrayList<Lutemon> getLutemons()
    {
        return lutemons;
    }
}
