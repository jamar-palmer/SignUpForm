package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    //view properties
    EditText txtName;
    EditText txtEmail;
    EditText txtPassword;
    EditText txtRename;
    Button save;

    TextView errName;
    TextView errEmail;
    TextView errPass;
    TextView errPass2;



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

        errName = findViewById(R.id.nameError);
        errEmail = findViewById(R.id.emailError);
        errPass = findViewById(R.id.passError);
        errPass2 = findViewById(R.id.passError2);

        //anonymous class compares for empty string or whitespaces
        View.OnClickListener display = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtName.getText().toString().equals("") || txtName.getText().toString().trim().equals("")){
                    hide();
                    errName.setVisibility(View.VISIBLE);
                    errName.setText("Please Enter Your Name");
                }else if(txtEmail.getText().toString().equals("") || txtEmail.getText().toString().trim().equals("")){
                    hide();
                    errEmail.setVisibility(View.VISIBLE);
                    errEmail.setText("Please Enter Your Email");
                }else if(txtPassword.getText().toString().equals("") || txtPassword.getText().toString().trim().equals("")){
                    hide();
                    errPass.setVisibility(View.VISIBLE);
                    errPass.setText("Please Enter Your Password");
                }else if(txtRename.getText().toString().equals("") || txtRename.getText().toString().trim().equals("")){
                    hide();
                    errPass2.setVisibility(View.VISIBLE);
                    errPass2.setText("Please Re-Enter Your Password");
                }else if(!txtPassword.getText().toString().equals(txtRename.getText().toString())){
                    hide();
                    errPass2.setVisibility(View.VISIBLE);
                    errPass2.setText("Passwords do not match");
                }
                else{
                    hide();
                    Toast.makeText(FormActivity.this, "Welcome, " + txtName.getText().toString() + ", to the SignUpForm App", Toast.LENGTH_SHORT).show();
                }

                //method for hiding error messages
            }
        };

        //defining onClick event
        save.setOnClickListener(display);

    }

    public void hide(){
        errName.setVisibility(View.INVISIBLE);
        errEmail.setVisibility(View.INVISIBLE);
        errPass.setVisibility(View.INVISIBLE);
        errPass2.setVisibility(View.INVISIBLE);
    }

}