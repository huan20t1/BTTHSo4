package com.example.btth4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class giaoDienProfile extends AppCompatActivity {
    Button btndangxuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien_profile);
        btndangxuat = findViewById(R.id.btndangxuat);

        btndangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(giaoDienProfile.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}