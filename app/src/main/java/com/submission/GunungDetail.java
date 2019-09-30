package com.submission;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class GunungDetail extends AppCompatActivity {

    ImageView ivImageDetail;
    TextView tvNama, tvDaerah;
    String NamaGunung, NamaDaerah, foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunung_detail);

        getSupportActionBar().setTitle("Detail Gunung");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ivImageDetail = findViewById(R.id.foto);
        tvNama = findViewById(R.id.nama);
        tvDaerah = findViewById(R.id.daerah);

        NamaGunung = getIntent().getStringExtra("mTextView1");
        NamaDaerah = getIntent().getStringExtra("mTextView2");
        foto = getIntent().getStringExtra("mImageView");

        tvNama.setText(NamaGunung);
        tvDaerah.setText(NamaDaerah);
        Glide.with(this)
                .load(foto)
                .placeholder(R.drawable.ic_filter_hdr_24dp)
                .into(ivImageDetail);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}

