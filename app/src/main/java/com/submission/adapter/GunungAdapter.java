package com.submission.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.Glide;
import com.submission.GunungDetail;
import com.submission.R;
import com.submission.model.Gunung;

import java.util.ArrayList;

public class GunungAdapter extends RecyclerView.Adapter<GunungAdapter.GunungViewHolder> {
    private ArrayList<Gunung> isiGunung;

    public GunungAdapter(ArrayList<Gunung> isi) {
        this.isiGunung = isi;
    }

    @NonNull
    @Override
    public GunungViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_list, viewGroup, false);
        return new GunungViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GunungAdapter.GunungViewHolder gunungViewHolder, int i) {
        final Gunung gunung = isiGunung.get(i);
        Glide.with(gunungViewHolder.itemView.getContext())
                .load(gunung.getGambar())
                .placeholder(R.drawable.ic_filter_hdr_24dp)
                .into(gunungViewHolder.mImageView);
        gunungViewHolder.mTextView1.setText(gunung.getNama());
        gunungViewHolder.mTextView2.setText(gunung.getDaerah());
        gunungViewHolder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Toast.makeText(gunungViewHolder.itemView.getContext(), "Anda Memilih " + isiGunung.get(gunungViewHolder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
                Intent detailintent = new Intent(context, GunungDetail.class);
                detailintent.putExtra("mImageView", gunung.getGambar());
                detailintent.putExtra("mTextView1", gunung.getNama());
                detailintent.putExtra("mTextView2", gunung.getDaerah());
                context.startActivity(detailintent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return isiGunung.size();
    }

    public class GunungViewHolder extends RecyclerView.ViewHolder {

        ImageView mImageView;
        TextView mTextView1, mTextView2;
        RelativeLayout mRelativeLayout;

        public GunungViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.iv_foto);
            mTextView1 = itemView.findViewById(R.id.tv_nama);
            mTextView2 = itemView.findViewById(R.id.tv_detail);
            mRelativeLayout = itemView.findViewById(R.id.rl_list);
        }
    }
}
