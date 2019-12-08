package com.example.restaurantbooking.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantbooking.Interface.ItemClickListener;
import com.example.restaurantbooking.R;

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView food_name;
    public ImageView food_Image;
    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }


    public FoodViewHolder (View itemView) {
        super(itemView);

        food_name = itemView.findViewById(R.id.food_name);
        food_Image = itemView.findViewById(R.id.food_image);

        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);

    }
}
