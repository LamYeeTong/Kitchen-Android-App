package com.example.restaurantbooking;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Log_In extends AppCompatActivity {
    EditText input_Email, input_Password;
    ProgressDialog mLogInProgress;
    Button LogInButton;
    Button RegisterButton;
    private FirebaseAuth auth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log__in);

        input_Password = (EditText) findViewById(R.id.input_password);
        input_Email = (EditText) findViewById(R.id.input_email);
        LogInButton = (Button) findViewById(R.id.LogIn_button);
        RegisterButton = (Button) findViewById(R.id.register_button);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        auth = FirebaseAuth.getInstance();
        mLogInProgress = new ProgressDialog(this);

        auth = FirebaseAuth.getInstance();

        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = input_Email.getText().toString().trim();
                final String password = input_Password.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    input_Email.setError(getString(R.string.empty));
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    input_Password.setError(getString(R.string.empty));
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                //authenticate user
                auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(Log_In.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                // If sign in fails, display a message to the user. If sign in succeeds
                                // the auth state listener will be notified and logic to handle the
                                // signed in user can be handled in the listener.
                                progressBar.setVisibility(View.GONE);
                                if (!task.isSuccessful()) {
                                    // there was an error
                                    if (password.length() < 6) {
                                        input_Password.setError(getString(R.string.minimum_password));
                                    } else {
                                        Toast.makeText(Log_In.this, getString(R.string.auth_failed), Toast.LENGTH_LONG).show();
                                    }
                                } else {
                                    //jump to menu page
                                    Intent homeIntent = new Intent(Log_In.this, home.class);
                                    startActivity(homeIntent);
                                    finish();
                                }
                            }
                        });

            }

        });

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUp();
            }
        });
    }

    public void openSignUp(){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
}










