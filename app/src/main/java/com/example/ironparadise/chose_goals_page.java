package com.example.ironparadise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class choose_goals_page extends AppCompatActivity {

    private ImageButton lose_Fat_Button;
    private ImageButton gain_Muscle_Button;
    private Button goBackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_goals_page);

        lose_Fat_Button = (ImageButton)findViewById(R.id.lose_Fat_Button);
        lose_Fat_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_lose_fat_page();
            }
        });


        goBackButton = (Button) findViewById(R.id.go_back_button);
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_MainPage();
            }
        });


        gain_Muscle_Button = (ImageButton)findViewById(R.id.gain_Muscle_Button);

    }

    public void open_lose_fat_page()
    {

        Intent intent = new Intent(this, com.example.ironparadise.lose_fat_page.class);
        startActivity(intent);


    }


    public void open_MainPage()
    {

        Intent intent = new Intent(this, com.example.ironparadise.MainActivity.class);
        startActivity(intent);


    }


}
