package com.submission;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.submission.adapter.GunungAdapter;
import com.submission.model.Gunung;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    public RecyclerView mRecyclerView;
    private ArrayList<Gunung> isi = new ArrayList<>();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isi.addAll(GunungData.getData());
        tampillist();

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Gunung");

    }

    public void tampillist() {
        mRecyclerView = findViewById(R.id.recyclerview_);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        GunungAdapter adapter = new GunungAdapter(isi);
        mRecyclerView.setAdapter(adapter);

    }


    public void profile() {
        Intent mIntent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(mIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.profile) {
            profile();
        }
        return super.onOptionsItemSelected(item);
    }

}
