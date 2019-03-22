package com.example.lab1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleClass> mExampleClass;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mTextView1;
        public RelativeLayout mRelativeLayout;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView2);
            mTextView1 = itemView.findViewById(R.id.textView);
            mRelativeLayout = itemView.findViewById(R.id.background);
        }
    }

    public ExampleAdapter(ArrayList<ExampleClass> exampleList){
        mExampleClass = exampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.example,viewGroup,false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        ExampleClass currentItem = mExampleClass.get(i);

        exampleViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        exampleViewHolder.mTextView1.setText(currentItem.getNumber());
        exampleViewHolder.mRelativeLayout.setBackgroundColor(currentItem.getColor());

    }

    @Override
    public int getItemCount() {
        return mExampleClass.size();
    }
}
