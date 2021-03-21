package com.example.practicleexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    private TextView txtAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        txtAbout=findViewById(R.id.txtAboutUs);

        txtAbout.setText("Foody\ninfo.foody@gmail.com\n9879516789");
    }
}
