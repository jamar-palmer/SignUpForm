package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    //view properties
    EditText txtName;
    EditText txtEmail;
    EditText txtPassword;
    EditText txtRename;
    Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning global variables
        txtName = findViewById(R.id.editTextTextPersonName);
        txtEmail = findViewById(R.id.editTextTextEmailAddress);
        txtPassword = findViewById(R.id.editTextTextPassword);
        txtRename = findViewById(R.id.editTextTextPassword2);
        save = findViewById(R.id.saveButton);

        //anonymous class
        View.OnClickListener display = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FormActivity.this, "Welcome, Jayne Dough, to the SignUpForm App", Toast.LENGTH_SHORT).show();
            }
        };

        //defining onClick event
        save.setOnClickListener(display);

    }

}