package com.example.lutemon;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LutemonTrainingListAdapter extends RecyclerView.Adapter<LutemonTrainViewHolder> {

    private final Context context;
    private final ArrayList<Lutemon> lutemons;

    public LutemonTrainingListAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = lutemons;
    }

    @NonNull
    @Override
    public LutemonTrainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LutemonTrainViewHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_train_view, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull LutemonTrainViewHolder holder, int position) {
        holder.onBind(lutemons.get(position));
    }

    @Override
    public int getItemCount() {
        return lutemons.size();
    }
}

