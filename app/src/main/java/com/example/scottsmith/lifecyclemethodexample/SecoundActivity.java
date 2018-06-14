package com.example.scottsmith.lifecyclemethodexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecoundActivity extends AppCompatActivity {
private Button finishButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);


        finishButton = findViewById(R.id.finish_button);

        setListener();
    }

    private void setListener() {

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                finish();
            }
        });
    }

}
