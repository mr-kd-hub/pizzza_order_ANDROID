package com.example.practicleexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Pizza extends AppCompatActivity {

    private ImageView imageView;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        imageView=findViewById(R.id.ivPizza);
        textView=findViewById(R.id.tvpizzaDetails);
        Intent intent=getIntent();
        String pizzaId=intent.getStringExtra("id");
        String pizzaName=intent.getStringExtra("name");
        String pizzaSize=intent.getStringExtra("size");
        String pizzaPrice=intent.getStringExtra("price");

        adp a=new adp(getApplicationContext());

        imageView.setImageResource(a.img[Integer.parseInt(pizzaId)]);
        textView.setText(pizzaName+"\n"+pizzaSize+"\n"+pizzaPrice);

    }
}
