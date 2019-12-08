package com.example.restaurantbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button SignUpButton, LogInButton;
    TextView txtSlogan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignUpButton = (Button)findViewById(R.id.SignUp_button);
        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSignUp();

            }
        });

        LogInButton = (Button)findViewById(R.id.LogIn_button);
        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //when clicked will open log in page
                openLogIn();

            }
        });

    }

    public void openLogIn(){
        Intent intent = new Intent(this, Log_In.class);
        startActivity(intent);
    }

    public void openSignUp(){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
}
