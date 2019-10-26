package com.vogella.android.todolistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

// To feed all your data to the list, you must extend the RecylcerView.Adapter class.
// This object creates views for items, and replaces the content of some of the views with
// new data items when the original is no longer visible.
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<String> items;

    public MyAdapter(Context context, ArrayList<String> list) {

        // set items to the list passed in, so now we have to link to the
        // list passed in and now we can use the objects in that list
        items = list;
    }

    // Inner class that has access to the outer class methods, will
    // represent every item that we will place in our view
    public class ViewHolder extends RecyclerView.ViewHolder {

        // we need to define every item in our list
        CheckBox checkBox;
        TextView tvName;

        // itemView refers to the list_items view
        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.checkBox);
            tvName = itemView.findViewById(R.id.tvName);

            // do something when the checkbox is clicked
        }
    }

    // method called when adapter is created, used to initialize viewholder
    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        // get connection to the layout
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }





}
