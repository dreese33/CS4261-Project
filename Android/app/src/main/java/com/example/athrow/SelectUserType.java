package com.example.athrow;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class SelectUserType extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_type);

        Button user = findViewById(R.id.user);
        Button driver = findViewById(R.id.driver);
        Button back = findViewById(R.id.back);

        user.setOnClickListener(openSignup);
        back.setOnClickListener(backIntent);
    }

    private View.OnClickListener openSignup = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener backIntent = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}