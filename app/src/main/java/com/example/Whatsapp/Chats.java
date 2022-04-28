package com.example.Whatsapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Whatsapp.R;

import java.util.ArrayList;
import java.util.List;

public class Chats extends Fragment {

    ImageView img1;

    public static String[] name = {"Manubhai", "Mister", "Rhitik", "Kishor", "Lata", "Narendra ", "Vijay", "Jhonny", "Tom", "Motu", "Desny", "Bajrangi", "Akshay", "Android ", "Harsh"};
    public static String[] surname = {"Mental", "Bean", "Roshan", "Kumar", "Mangeshkar", "Modi", "Malya", "Sins", "And Jerry", "Patlu", "Land", "Bhaijan", "Kumar", "Devloper", "Malaviya"};
    public static int[] img = {R.drawable.i1, R.drawable.i2, R.drawable.i3, R.drawable.i4, R.drawable.i5, R.drawable.i6, R.drawable.i7, R.drawable.i8, R.drawable.i9, R.drawable.i10, R.drawable.i11, R.drawable.i12, R.drawable.i13, R.drawable.i14, R.drawable.i15};

    public static List<data> modelList = new ArrayList<>();
    private static final String TAG = "MainActivity";
    RecyclerView lists;


    public Chats() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_chats, container, false);

        lists = view.findViewById(R.id.lists);

        for (int i = 0; i < name.length; i++) {

            data model = new data(name[i], surname[i], img[i]);
            modelList.add(model);
        }
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 1, GridLayoutManager.VERTICAL, false);
        RecycleAdapter adapter = new RecycleAdapter((MainActivity) getActivity(), modelList);
        lists.setLayoutManager(manager);
        lists.setAdapter(adapter);

        return view;
    }
}