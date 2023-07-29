package com.example.lutemon;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonTrainViewHolder extends RecyclerView.ViewHolder {
    private final TextView lutemonName, lutemonAttack, lutemonDefense;

    private final Button trainAttackBtn, trainDefenseBtn;

    public LutemonTrainViewHolder(@NonNull View itemView) {
        super(itemView);
        lutemonName = itemView.findViewById(R.id.txtName);
        lutemonAttack = itemView.findViewById(R.id.textAttack);
        lutemonDefense = itemView.findViewById(R.id.textDefense);
        trainAttackBtn = itemView.findViewById(R.id.trainAttack);
        trainDefenseBtn = itemView.findViewById(R.id.trainDefense);
    }

    @SuppressLint("SetTextI18n")
    public void onBind(Lutemon lutemon)
    {
        lutemonName.setText(lutemon.getName());
        lutemonAttack.setText("Attack: " + lutemon.getAttack());
        lutemonDefense.setText("Defense: " + lutemon.getDefense());
        trainAttackBtn.setOnClickListener(v -> trainAttack(lutemon));
        trainDefenseBtn.setOnClickListener(v -> trainDefense(lutemon));
    }

    void trainAttack(Lutemon lutemon)
    {
        lutemon.addAttack();
        lutemon.endTraining();
    }

    void trainDefense(Lutemon lutemon)
    {
        lutemon.addDefense();
        lutemon.endTraining();
    }
}

