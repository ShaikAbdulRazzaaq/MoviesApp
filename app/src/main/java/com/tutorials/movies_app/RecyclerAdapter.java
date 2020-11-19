package com.tutorials.movies_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tutorials.movies_app.databinding.CustomViewBinding;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Holder> {
    Context context;

    public RecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(CustomViewBinding.inflate(LayoutInflater.from(context), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.customViewBinding.ivMovieImage.setImageResource(R.drawable.ic_launcher_background);

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public static class Holder extends RecyclerView.ViewHolder {
        CustomViewBinding customViewBinding;

        public Holder(CustomViewBinding customViewBinding) {
            super(customViewBinding.getRoot());
            this.customViewBinding = customViewBinding;
        }

    }
}
