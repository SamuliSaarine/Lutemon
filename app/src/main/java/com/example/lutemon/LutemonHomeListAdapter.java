package com.example.lutemon;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LutemonHomeListAdapter extends RecyclerView.Adapter<LutemonViewHolder> {

    private final Context context;
    private final ArrayList<Lutemon> lutemons;

    public LutemonHomeListAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = lutemons;
    }

    @NonNull
    @Override
    public LutemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LutemonViewHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_view, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull LutemonViewHolder holder, int position) {
        holder.onBindView(lutemons.get(position), context);
    }



    @Override
    public int getItemCount() {
        return lutemons.size();
    }
}

