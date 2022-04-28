package com.example.Whatsapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Whatsapp.R;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecyclerHolder> {

    Activity activity;
    List<data> modellist;

    public RecycleAdapter(MainActivity mainActivity, List<data> modelList) {

        activity = mainActivity;
        this.modellist=modelList;

    }
    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.fullname,parent,false);


        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.name.setText(modellist.get(position).name);
        holder.surname.setText(modellist.get(position).surname);
        holder.img.setImageResource(modellist.get(position).img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(activity,ChatActivity.class);
//                intent.putExtra("pos",position);
//                activity.startActivity(intent);

            }
        });

    }


    @Override
    public int getItemCount() {
        return modellist.size();
    }

    public class RecyclerHolder extends  RecyclerView.ViewHolder{


        TextView name,surname;
        ImageView img;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            surname = itemView.findViewById(R.id.surname);
            img = itemView.findViewById(R.id.img);

        }
    }
}
