package com.example.myrecyclerview_a182209.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecyclerview_a182209.Beverage;
import com.example.myrecyclerview_a182209.MainActivity;
import com.example.myrecyclerview_a182209.R;

import java.util.List;

public class BeverageRecyclerViewAdapter extends  RecyclerView.Adapter<BeverageRecyclerViewAdapter.BeverageViewHolder> {
    public List<Beverage> beverageList;
    private Context context;
    public BeverageRecyclerViewAdapter(Context context, List<Beverage> beverageList) {
        this.context=context;
        this.beverageList=beverageList;
    }

    @NonNull
    @Override
    public BeverageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View beverage_row=  LayoutInflater.from(parent.getContext()).inflate(R.layout.beverage_row,null);
        BeverageViewHolder beverageViewHolder = new BeverageViewHolder(beverage_row);
        return beverageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BeverageViewHolder holder, int position) {
        holder.tvBeverageName.setText(beverageList.get(position).getName());
        holder.imgViewBeverageImage.setImageResource(beverageList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return beverageList.size();
    }



    public class BeverageViewHolder extends RecyclerView.ViewHolder {
        public TextView tvBeverageName;
        public ImageView imgViewBeverageImage;
        public BeverageViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBeverageName=itemView.findViewById(R.id.tv_beverages_name);
            imgViewBeverageImage=itemView.findViewById(R.id.img_beverages);
        }
    }
}
