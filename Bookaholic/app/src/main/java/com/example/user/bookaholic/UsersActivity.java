package com.example.user.bookaholic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class UsersActivity extends AppCompatActivity {
    private TextView textViewName;
    Button Startnew;
    Button Continue;
    Button Scoreboard;
    Button Instructions;
    Button Challange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        textViewName = (TextView) findViewById(R.id.text1);
        Startnew = (Button) findViewById(R.id.button1);
        Continue = (Button) findViewById(R.id.button2);
        Scoreboard = (Button) findViewById(R.id.button3);
        Instructions = (Button) findViewById(R.id.button4);
        Challange = (Button) findViewById(R.id.button5);
        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewName.setText("Welcome " + nameFromIntent);

        Startnew.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked on Button", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(UsersActivity.this, startnew.class);
                startActivity(i);
            }
        });

        Scoreboard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked on Button", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(UsersActivity.this, scoreboardActivity.class);
                startActivity(i);
            }
        });
        Instructions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked on Button", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(UsersActivity.this, InstructionActivity.class);
                startActivity(i);
            }
        });
        Challange.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked on Button", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(UsersActivity.this, ChallangeActivity.class);
                startActivity(i);
            }
        });}

}
