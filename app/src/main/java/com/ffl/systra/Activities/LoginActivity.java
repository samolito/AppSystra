package com.ffl.systra.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.ffl.systra.R;

public class LoginActivity extends AppCompatActivity {
    CheckBox chkbShowPassword;
    EditText email;
    EditText password;
Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        email=(EditText)findViewById(R.id.edtemail);
        //get the password EditText
        password=(EditText)findViewById(R.id.edtpassword);
        //get the checkbox show/hide password
        chkbShowPassword= (CheckBox)findViewById(R.id.chkshowpassword);

        btnlogin=(Button) findViewById(R.id.btnlogin);
        btnlogin=(Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
//add onCheckedListener on Checkbox
        //When user clicks on this checkbox this is the handler
        chkbShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //Checkbox status is changed from unchecked to checked
                if(!isChecked){
                    //show password
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                else
                {
                    //hide password
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

                }


            }
        });


    }


}
