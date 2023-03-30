package com.example.mangaapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mangaapp.R;
import com.example.mangaapp.model.TacGia;

import java.util.List;

public class TacGiaAdapter extends RecyclerView.Adapter<TacGiaAdapter.TacGiaViewHolder> {

    private Context context;
    private final List<TacGia> listTacGia;

    @SuppressLint("NotifyDataSetChanged")
    public TacGiaAdapter(List<TacGia> listTacGia, Context context) {
        this.listTacGia = listTacGia;
        this.context = context;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TacGiaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_the_loai, parent, false);
        return new TacGiaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TacGiaViewHolder holder, int position) {
        TacGia tacGia = listTacGia.get(position);
        if (tacGia == null) {
            return;
        }
        holder.tvTenTacGia.setText(tacGia.getTenTacGia());

    }


    @Override
    public int getItemCount() {
        if (listTacGia != null) {
            return listTacGia.size();
        }
        return 0;
    }

    public static class TacGiaViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTenTacGia;
        private CardView cardView;

        public TacGiaViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.crd_theloai);
            tvTenTacGia = itemView.findViewById(R.id.tv_item_the_loai);
        }
    }
}