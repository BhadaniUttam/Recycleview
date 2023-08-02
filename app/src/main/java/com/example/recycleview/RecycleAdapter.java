package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleHolder>
{

    MainActivity mainActivity;
    String[] name;
    public RecycleAdapter(MainActivity mainActivity, String[] name) {
        this.mainActivity = mainActivity;
        this.name = name;

    }


    @NonNull
    @Override
    public RecycleAdapter.RecycleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(mainActivity).inflate(R.layout.recycle_item,parent,false);
        RecycleHolder holder=new RecycleHolder(view);

        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.RecycleHolder holder, int position) {
        holder.textView.setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class RecycleHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public RecycleHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.recycleitem);
        }
    }
}