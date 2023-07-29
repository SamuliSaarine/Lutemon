package com.example.lutemon;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class BattleActivity extends AppCompatActivity {

    private BattleField field;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        field=BattleField.getInstance();
        output=findViewById(R.id.battleOutput);
        startFight();
    }

    public void startFight()
    {
        field.getEnemy();
        cycleTurns();
    }

    void cycleTurns()
    {
        TurnResult result;
        do {
            result=field.turn();
            if(!result.getMessage().isEmpty())
            {
                output.append(result.getMessage());
            }
        } while(result.battleContinues());

        endFight();
    }

    void endFight()
    {
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}