package com.example.net1814080903206activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.online_store);
        Button button=findViewById(R.id.Adidas);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main.this, Search.class);
                Main.this.startActivity(intent);
            }
        });
        Button button2=findViewById(R.id.Nike);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Main.this, Select.class);
                Main.this.startActivity(intent2);
            }
        });
        Button button3=findViewById(R.id.Lining);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(Main.this, Shopping_Car.class);
                Main.this.startActivity(intent3);
            }
        });
        Button button4=findViewById(R.id.manager);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(Main.this, Customer.class);
                Main.this.startActivity(intent4);
            }
        });
    }
}