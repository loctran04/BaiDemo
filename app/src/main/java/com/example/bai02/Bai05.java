package com.example.bai02;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Bai05 extends AppCompatActivity {
    List<CauThu> data = new ArrayList<>();
    ListView lvCauThu;
    CauThuAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai05);

        CauThu cau1 = new CauThu("Beckham","1997",R.drawable.beckham,R.drawable.flag);
        CauThu cau2 = new CauThu("Ronaldo","1997",R.drawable.beckham,R.drawable.flag);
        CauThu cau3 = new CauThu("Rooney","1997",R.drawable.beckham,R.drawable.flag);
        data.add(cau1);
        data.add(cau3);data.add(cau2);
        adapter = new CauThuAdapter(data,this,R.layout.bai05_item);
        lvCauThu = findViewById(R.id.listCauThu);
        lvCauThu.setAdapter(adapter);
    }
}
