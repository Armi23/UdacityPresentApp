package com.boston.armi.presentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popularMovieButton = (Button) findViewById(R.id.popular_movies);
        Button stockHawkButton = (Button) findViewById(R.id.stock_hawk);
        Button buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger);
        Button makeMaterialButton = (Button) findViewById(R.id.material);
        Button ubiquitousButton = (Button) findViewById(R.id.ubiquitous);
        Button capstoneButton = (Button) findViewById(R.id.capstone);

        popularMovieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my popular movie app", Toast.LENGTH_SHORT).show();
            }
        });
        stockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my stock hawk app", Toast.LENGTH_SHORT).show();
            }
        });
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app", Toast.LENGTH_SHORT).show();
            }
        });
        makeMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my make your app material app", Toast.LENGTH_SHORT).show();
            }
        });
        ubiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my go ubiquitous app", Toast.LENGTH_SHORT).show();
            }
        });
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my capstone app", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
