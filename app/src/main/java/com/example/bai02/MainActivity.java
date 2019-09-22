package com.example.bai02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBai2, btnBai5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBai2 = findViewById(R.id.btnBai2);
        btnBai5 = findViewById(R.id.btnBai5);

        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, Bai02.class);
                startActivity(int1);

            }
        });
        btnBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2= new Intent(MainActivity.this,Bai05.class);
                startActivity(int2);
            }
        });
    }
}
