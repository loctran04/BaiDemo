package com.example.bai02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Bai02_ketqua extends AppCompatActivity {
    Button btnBack;
    TextView edtResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai02_ketqua);
        btnBack = findViewById(R.id.btnBack);
        edtResult = findViewById(R.id.edtResult);
        Intent getIntent = getIntent();
        edtResult.setText(getIntent.getStringExtra("result"));
        final Intent intent = new Intent(this,Bai02.class);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }
}
