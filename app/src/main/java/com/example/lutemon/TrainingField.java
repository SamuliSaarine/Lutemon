package com.example.lutemon;

public class TrainingField
{
    public static void trainAttack(int lutemonIndex)
    {
        Player.getInstance().getLutemons().get(lutemonIndex).AddAttack();
    }

     public static void trainDefense(int lutemonIndex)
    {
        Player.getInstance().getLutemons().get(lutemonIndex).AddDefense();
    }
}
