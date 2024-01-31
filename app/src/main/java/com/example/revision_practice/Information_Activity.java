package com.example.revision_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Information_Activity extends AppCompatActivity {

    ImageView imageView;
    TextView character_name1,character_description1,xxx1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);


        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        imageView=findViewById(R.id.activity_Image);
        character_name1=findViewById(R.id.character_name);
        character_description1=findViewById(R.id.character_description);
        xxx1=findViewById(R.id.xxx);

        Bundle bundle=getIntent().getExtras();
        String name= bundle.getString("character name");
        String desc=bundle.getString("character description");

        character_name1.setText(name);
        character_description1.setText(desc);

        int char_image=getIntent().getIntExtra("character image",0);
        imageView.setImageResource(char_image);
    }
}