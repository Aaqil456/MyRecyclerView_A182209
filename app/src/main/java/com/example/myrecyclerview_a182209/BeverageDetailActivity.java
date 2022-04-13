package com.example.myrecyclerview_a182209;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BeverageDetailActivity extends AppCompatActivity {
    TextView tvNameDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage_detail);
        Intent intent = getIntent();

        tvNameDetail=findViewById(R.id.tv_beverage_name_detail);
        tvNameDetail.setText(intent.getStringExtra("beverageName"));
    }
}