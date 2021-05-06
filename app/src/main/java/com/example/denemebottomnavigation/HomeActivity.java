package com.example.denemebottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomBar;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_home);
        Button encode=findViewById (R.id.encode_button);
        Button decode=findViewById (R.id.decode_button);
        encode.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (getApplicationContext (),EncodeActivity.class));

            }
        });
        decode.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (getApplicationContext (),DecodeActivity.class));
            }
        });

        bt=(Button)findViewById (R.id.btnshare);
        bt.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(Intent.ACTION_SEND);
                myIntent.setType ("text/plain");
                String shareBody="Your body here";
                String shreSub="Your Subject here";
                myIntent.putExtra (Intent.EXTRA_SUBJECT,shreSub);
                myIntent.putExtra (Intent.EXTRA_TEXT,shareBody);
                startActivity (Intent.createChooser (myIntent,"Share using"));
            }
        });



        BottomNavigationView bottomNavigationView=(BottomNavigationView)findViewById (R.id.bottomBar);
        bottomNavigationView.setSelectedItemId (R.id.home);
        bottomNavigationView.setOnNavigationItemReselectedListener (new BottomNavigationView.OnNavigationItemReselectedListener () {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId ()){
                    case R.id.home:
                    case R.id.encode:
                        startActivity (new Intent(getApplicationContext (),EncodeActivity.class));
                        finish ();
                        overridePendingTransition (0,0);
                        return;
                    case R.id.decode:
                        startActivity (new Intent (getApplicationContext (),DecodeActivity.class));
                        finish ();
                        overridePendingTransition (0,0);
                        return;
                }
            }
        });












        bottomBar = findViewById (R.id.bottomBar);

        bottomBar.setOnNavigationItemSelectedListener (new BottomNavigationView.OnNavigationItemSelectedListener () {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Toast.makeText (HomeActivity.this, item.getTitle (), Toast.LENGTH_SHORT).show ();
                return true;
            }
        });
    }














}

























































