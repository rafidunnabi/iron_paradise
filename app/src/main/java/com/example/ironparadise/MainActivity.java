package com.example.ironparadise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

import static com.example.ironparadise.R.id.menubutton;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    private ImageButton menu;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        //ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.naviigation_drawer_open,R.string.naviigation_drawer_close);
        //drawer.addDrawerListener(toggle);
        //toggle.syncState();


        button = findViewById(R.id.button);

       menu = (ImageButton)findViewById(menubutton);



       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openChoose_goals();
           }
       });


       menu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               drawer.openDrawer(GravityCompat.START);
           }
       });





    }

    @Override
    public void onBackPressed()
    {
        if(drawer.isDrawerOpen(GravityCompat.START)){

            drawer.closeDrawer(GravityCompat.START);

        }
        else
        {
            super.onBackPressed();
        }



        super.onBackPressed();

    }

    public void openChoose_goals()
    {

        Intent intent = new Intent(this, com.example.ironparadise.choose_goals_page.class);
        startActivity(intent);


    }





    }

