package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class showActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent=getIntent();
        String s=intent.getStringExtra("cityname");
        TextView textView=findViewById(R.id.textView_2);
        textView.setText(s);
        //textView.getBackground().setColorFilter(Color.red(255), PorterDuff.Mode.SRC_ATOP);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(showActivity.this,MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}