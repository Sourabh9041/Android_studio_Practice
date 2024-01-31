package com.example.revision_practice;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler_view_Adaptor extends RecyclerView.Adapter<Recycler_view_Adaptor.ViewHolder> {


    Context context;
    ArrayList<Arrays_modal> arrayList;

    ArrayList<description_Modal> desc_list;

    public Recycler_view_Adaptor(Context context, ArrayList<Arrays_modal> arrayList,ArrayList<description_Modal> desc_list) {
        this.context = context;
        this.arrayList = arrayList;
        this.desc_list=desc_list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.textView.setText(arrayList.get(position).getName());

       loadAnimation(holder.itemView);

       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent=new Intent(view.getContext(),Information_Activity.class);
               intent.putExtra("character image",desc_list.get(position).getCharacter_image());
               intent.putExtra("character name",desc_list.get(position).getCharacter_name());
               intent.putExtra("character description",desc_list.get(position).getCharacter_Description());
               view.getContext().startActivity(intent);


           }
       });




    }

    @Override
    public int getItemCount() {


        return arrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.sample_image);
            textView=itemView.findViewById(R.id.name_view);
            cardView=itemView.findViewById(R.id.description_cardView);


        }

    }

    public void loadAnimation(View view){

        Animation animation= AnimationUtils.loadAnimation(context,android.R.anim.slide_in_left);
        view.startAnimation(animation);
    }

    }


