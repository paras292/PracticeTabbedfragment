package com.example.t_pagang.practicetabbedfragment;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MultiViewTypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Model> dataSet;
    Context mContext;
    int total_types;

    public static class ImageTypeViewHolder extends RecyclerView.ViewHolder {


        TextView textViewTop;
        TextView textViewMessage;
        ImageView topIconImage;
        ImageView midImage1;
        ImageView midImage2;
        ImageView midImage3;

        public ImageTypeViewHolder(View itemView) {
            super(itemView);

            this.textViewTop = (TextView) itemView.findViewById(R.id.textViewTop);
            this.textViewMessage = (TextView) itemView.findViewById(R.id.textViewMessage);
            this.midImage1 = (ImageView) itemView.findViewById(R.id.midImage1);
            this.midImage2 = (ImageView) itemView.findViewById(R.id.midImage2);
            this.midImage3 = (ImageView) itemView.findViewById(R.id.midImage3);
            this.topIconImage= (ImageView) itemView.findViewById(R.id.topIconImage);

        }

    }

    public MultiViewTypeAdapter(ArrayList<Model> data, Context context) {
        this.dataSet = data;
        this.mContext = context;
        total_types = dataSet.size();

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case Model.IMAGE_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.discover_tab_cards, parent, false);
                return new ImageTypeViewHolder(view);
        }
        return null;
    }


    @Override
    public int getItemViewType(int position) {

        switch (dataSet.get(position).type) {
            case 0:
                return Model.IMAGE_TYPE;
            default:
                return -1;
        }


    }
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int listPosition) {

        Model object = dataSet.get(listPosition);
        if (object != null) {
            switch (object.type) {
                case Model.IMAGE_TYPE:
                    ((ImageTypeViewHolder) holder).textViewTop.setText(object.textViewTop);
                    ((ImageTypeViewHolder) holder).textViewMessage.setText(object.textViewMessage);
                    ((ImageTypeViewHolder) holder).midImage1.setImageResource(object.midImage1);
                    ((ImageTypeViewHolder) holder).midImage2.setImageResource(object.midImage2);
                    ((ImageTypeViewHolder) holder).midImage3.setImageResource(object.midImage3);
                    ((ImageTypeViewHolder) holder).topIconImage.setImageResource(object.topIconImage);
                    break;
            }
        }

    }
    @Override
    public int getItemCount() {
        return dataSet.size();
    }


}
