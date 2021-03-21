package com.example.practicleexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAbout,btnRating;

    private GridView gvImage;

    adp a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAbout=findViewById(R.id.btnAbout);
        btnRating=findViewById(R.id.btnRating);
        gvImage=findViewById(R.id.gvimages);

        a=new adp(getApplicationContext());
        gvImage.setAdapter(a);

        gvImage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int av=position;
                Intent intent=new Intent(getApplicationContext(),Pizza.class);
                intent.putExtra("id",""+position);
                intent.putExtra("name",a.pname[av]);
                intent.putExtra("size",a.psize[av]);
                intent.putExtra("price",a.price[av]);
                startActivity(intent);
            }
        });


        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AboutUs.class);
                startActivity(intent);
            }
        });

        btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Rating.class);
                startActivity(intent);
            }
        });


    }
}
