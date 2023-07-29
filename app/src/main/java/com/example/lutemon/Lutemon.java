package com.example.lutemon;
import android.graphics.Color;
import java.util.Random;

public class Lutemon
{
    //private
    private String name;
    private final int color;
    private int experience;
    private int attack;
    private int defense;
    private int maxHealth;
    private int health;

    private boolean training;

    private final static Random random = new Random();

    //public
    public String getName()
    {
        return name;
    }
    public int getExperience()
    {
        return experience;
    }
    public int getAttack()
    {
        return attack;
    }
    public int getDefense()
    {
        return defense;
    }
    public int getHealth()
    {
        return health;
    }
    public int getColor()
    {
        return COLORS[color];
    }
    public boolean isTraining() { return training;}

    //functions

    Lutemon(int color, int attack, int defense, int maxHealth)
    {
        name = COLOR_NAMES[color];
        this.color = color;
        experience = 0;
        this.attack = attack;
        this.defense = defense;
        this.maxHealth = maxHealth;
        health = maxHealth;
        training=false;
    }

    public void giveName(String name)
    {
        this.name = name;
    }

    public void addMaxHealth()
    {
        maxHealth += 1;
        experience += 1;
        health=maxHealth;
    }

    public void addAttack()
    {
        attack += 1;
        experience += 1;
    }

    public void addDefense()
    {
        defense += 1;
        experience += 1;
    }

    public String doAttack(Lutemon target)
    {
        String message=name + " attacked " + target.getName() + ": " + attack + "\n";
        message += target.doDefense(attack);
        return message;
    }


    public String doDefense(int damage)
    {
        int divide = damage/defense;
        int subract = damage-defense;
        damage = divide>subract ? divide : subract;
        health -= damage;
        if(health<0)
        {
            health = 0;
        }
        return name + " defense reduced damage to " + damage + ". Health left: " + health + "\n";
    }

    public void startTraining()
    {
        training=true;
    }

    public void endTraining()
    {
        training=false;
    }

    //static

    //Returning random Lutemon with random skills corresponding to experience
    public static Lutemon randomLutemon(int experience)
    {
        Lutemon lutemon = randomLutemon();
        lutemon.experience = experience;
        for (int i = 0; i < experience; i++)
        {
            int whatToUpgrade=random.nextInt(3);
            switch(whatToUpgrade)
            {
                case 0:
                    lutemon.attack += 1;
                    break;
                case 1:
                    lutemon.defense += 1;
                    break;
                case 2:
                    lutemon.maxHealth += 1;
                    break;
            }
        }
        return lutemon;
    }

    public static Lutemon randomLutemon()
    {
        int type = random.nextInt(5);
        switch(type)
        {
            case 1:
                return black();
            case 2:
                return orange();
            case 3:
                return pink();
            case 4:
                return green();
            default:
                return white();
        }
    }

    static private Lutemon white()
    {
        return new Lutemon(0, 1, 2, 6);
    }

    static private Lutemon black()
    {
        return new Lutemon(1, 3, 2, 2);
    }

    static private Lutemon orange()
    {
        return new Lutemon(2, 2, 3, 2);
    }

    static private Lutemon pink()
    {
        return new Lutemon(3, 1, 3, 4);
    }

    static private Lutemon green()
    {
        return new Lutemon(4, 2, 1, 6);
    }

    static final String[] COLOR_NAMES = new String[]
    {
        "White",
        "Black",
        "Orange",
        "Pink",
        "Green",
    };

    static final int[] COLORS = new int[]
    {
            Color.WHITE,
            Color.rgb(51, 51, 51), //black
            Color.rgb(255, 178, 102), //orange
            Color.rgb(255, 153, 230), //pink
            Color.rgb(204, 255, 179) //green
    };
}
