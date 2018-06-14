package com.example.scottsmith.lifecyclemethodexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // reference buttons located in xml associated with this activity
    private Button newActivityButton;
    private Button finishProgramButton;
    private Intent newActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create small pop up at the bottom of the screen
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

        // link the variable references to the specific UI elements by ID/Name
        newActivityButton = findViewById(R.id.new_activity_button);
        finishProgramButton = findViewById(R.id.finish_activity_button);

        // setting intent to navigate from this activity to a different one
        newActivity = new Intent(this, SecoundActivity.class);

        // method to initiate onClickListener for the buttons in the UI
        setListeners();
    }

    private void setListeners() {
        // sets listener only for the newActivityButton
        newActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // takes our intent and tell it to use that to start a newActivity
                startActivity(newActivity);
            }
        });

        // sets listener for finishProgramButton
        finishProgramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // closes current activity (in this location, this call will close our program)
                finish();
            }
        });
    }

    // LifeCycle methods below
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }

}
