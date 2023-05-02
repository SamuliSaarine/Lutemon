package com.example.lutemon;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonViewHolder extends RecyclerView.ViewHolder {
    ImageView lutemonImage;
    TextView lutemonName, lutemonAttack, lutemonDefense, lutemonExperience;

    public LutemonViewHolder(@NonNull View itemView) {
        super(itemView);
        lutemonImage = itemView.findViewById(R.id.ivBody);
        lutemonName = itemView.findViewById(R.id.txtName);
        //lutemonAttack = itemView.findViewById(R.id.txtLutemonAttack);
        //lutemonDefense = itemView.findViewById(R.id.txtLutemonDefense);
        //lutemonExperience = itemView.findViewById(R.id.txtLutemonExperience);
    }
}

