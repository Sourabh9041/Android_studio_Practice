package com.example.revision_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class second_Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=findViewById(R.id.actor_name);

        Bundle bundle=getIntent().getExtras();
        String pass_actor_name= bundle.getString("actor");
        textView.setText(pass_actor_name);




    }
}