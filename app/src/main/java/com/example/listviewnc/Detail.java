package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class Detail extends AppCompatActivity {

    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtDetail = (TextView) findViewById(R.id.textViewDetail);
        Intent intent = getIntent();
        String noiDung = intent.getStringExtra("tenxe");
        txtDetail.setText(noiDung);
        txtDetail = (TextView) findViewById(R.id.textViewDetail);
    }
}