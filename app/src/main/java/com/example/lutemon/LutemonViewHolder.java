package com.example.lutemon;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonViewHolder extends RecyclerView.ViewHolder {
    private final ImageView lutemonImage;
    private final TextView lutemonName, lutemonAttack, lutemonDefense, lutemonExperience, lutemonHealth;
    private final Button trainBtn, battleBtn;

    private Context context;

    public LutemonViewHolder(@NonNull View itemView) {
        super(itemView);
        lutemonImage = itemView.findViewById(R.id.ivBody);
        lutemonName = itemView.findViewById(R.id.txtName);
        lutemonAttack = itemView.findViewById(R.id.textAttack);
        lutemonDefense = itemView.findViewById(R.id.textDefense);
        lutemonExperience = itemView.findViewById(R.id.txtExperience);
        lutemonHealth = itemView.findViewById(R.id.textHealth);
        trainBtn = itemView.findViewById(R.id.goTrainBtn);
        battleBtn = itemView.findViewById(R.id.goBattleBtn);
    }

    @SuppressLint("SetTextI18n")
    public void onBindView(Lutemon lutemon, Context context)
    {
        this.context=context;

        lutemonName.setText(lutemon.getName());
        lutemonAttack.setText(("Attack: " + lutemon.getAttack()));
        lutemonDefense.setText(("Defense: " + lutemon.getDefense()));
        lutemonExperience.setText(("Experience: " + lutemon.getExperience()));
        lutemonHealth.setText(("Health: " + lutemon.getHealth()));
        lutemonImage.setColorFilter(lutemon.getColor());
        trainBtn.setEnabled(!lutemon.isTraining());
        battleBtn.setEnabled(!lutemon.isTraining());
        trainBtn.setOnClickListener(v -> goTrain(lutemon));
        battleBtn.setOnClickListener(v -> goBattle(lutemon));
    }

    void goTrain(Lutemon lutemon)
    {
        lutemon.startTraining();
    }

    void goBattle(Lutemon lutemon)
    {
        BattleField.getInstance().setPlayer(lutemon);
        Intent intent = new Intent(context, BattleActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}

