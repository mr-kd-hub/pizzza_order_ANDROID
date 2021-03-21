package com.example.practicleexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rating extends AppCompatActivity {

    private Button btnsubmit;

    private RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        btnsubmit=findViewById(R.id.btnSubmit);
        ratingBar=findViewById(R.id.ratingBar);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= (int) ratingBar.getRating();
                Toast.makeText(getApplicationContext(),"Rating given by you : "+a,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
