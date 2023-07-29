package com.example.lutemon;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TrainingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Player player = Player.getInstance();

        RecyclerView recyclerView = findViewById(R.id.trainingLutemonList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new LutemonTrainingListAdapter(getApplicationContext(), onlyTraining(player.getLutemons())));
    }

    ArrayList<Lutemon> onlyTraining(ArrayList<Lutemon> lutemons)
    {
        ArrayList<Lutemon> training = new ArrayList<>();

        for (Lutemon lutemon : lutemons)
        {
            if(lutemon.isTraining())
            {
                training.add(lutemon);
            }
        }

        return training;
    }
}