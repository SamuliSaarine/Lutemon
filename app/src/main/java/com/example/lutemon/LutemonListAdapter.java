package com.example.lutemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LutemonListAdapter extends RecyclerView.Adapter<LutemonViewHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons;

    public LutemonListAdapter(Context context, ArrayList<Lutemon> rockets) {
        this.context = context;
        this.lutemons = rockets;
    }

    @NonNull
    @Override
    public LutemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LutemonViewHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LutemonViewHolder holder, int position) {
        holder.lutemonName.setText(lutemons.get(position).getName() + " (" + ")");
        holder.lutemonAttack.setText(String.valueOf(lutemons.get(position).getAttack()) + " kg");
        holder.lutemonAttack.setText(String.valueOf(lutemons.get(position).getDefense()) + " m");
        holder.lutemonImage.setColorFilter(lutemons.get(position).getColor());

    }

    @Override
    public int getItemCount() {
        return lutemons.size();
    }
}

