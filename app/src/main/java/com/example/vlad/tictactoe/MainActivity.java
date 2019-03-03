package com.example.vlad.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startGameButton;
    Button achievmentsButton;
    Button settingsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startGameButton = (Button) findViewById(R.id.start_button);
        achievmentsButton = (Button) findViewById(R.id.achievments_button);
        settingsButton = (Button) findViewById(R.id.settings_button);

        startGameButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        GameActivity.class);
                startActivity(myIntent);
            }
        });

        achievmentsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        AchievmentsActivity.class);
                startActivity(myIntent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        SettingsActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
