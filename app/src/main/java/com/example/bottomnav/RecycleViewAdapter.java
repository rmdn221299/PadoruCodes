package com.example.bottomnav;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

    private ArrayList<Integer> fotoContent = new ArrayList<>();
    private ArrayList<String> namaContent = new ArrayList<>();
    private ArrayList<String> infoContent = new ArrayList<>();
    private Context context;

    public RecycleViewAdapter(ArrayList<Integer> fotoContent, ArrayList<String> namaContent,ArrayList<String> infoContent, Context context) {
        this.fotoContent = fotoContent;
        this.namaContent = namaContent;
        this.infoContent = infoContent;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_layout , parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageViewContent.setImageResource(fotoContent.get(position));
        holder.textViewNamaContent.setText(namaContent.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto_Content", fotoContent.get(position));
                intent.putExtra("nama_Content", namaContent.get(position));
                intent.putExtra("info_Content", infoContent.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaContent.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewContent;
        TextView textViewNamaContent;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewContent = itemView.findViewById(R.id.imageViewContent);
            textViewNamaContent = itemView.findViewById(R.id.textViewNamaContent);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
