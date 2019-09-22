package com.example.bai02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Bai02 extends AppCompatActivity {
    Button btnGiai;
    EditText edtNumA,edtNumB,edtNumC;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai02);

        btnGiai = findViewById(R.id.btnGiai);
        edtNumA = findViewById(R.id.edtNumA);
        edtNumB = findViewById(R.id.edtNumB);
        edtNumC = findViewById(R.id.edtNumC);

        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bai02.this,Bai02_ketqua.class);
                float soA,soB,soC;
                soA = Float.parseFloat(edtNumA.getText().toString());
                soB = Float.parseFloat(edtNumB.getText().toString());
                soC = Float.parseFloat(edtNumC.getText().toString());
                String kq = giaiPTB2(soA,soB,soC);
                intent.putExtra("result",kq);
                startActivity(intent);
            }
        });


    }
    private String giaiPTB2(float a, float b,float c){
        float delta = b*b - (4*a*c);
        float x1,x2;
        if(delta<0){
            x1 = x2 =0;
            return "Phương trình vô nghiệm";
        }
        else if(delta == 0 ){
            x1 = x2 = -b/(2*a);
            return "Phương trình có nghiệm kép";
        }
        else {
            delta = (float) Math.sqrt(delta);
            x1 = (-b + delta) / (2*a);
            x2 = (-b - delta) / (2*a);
            return "Phương trình có 2 nghiệm phân biệt";
        }
    }
}
