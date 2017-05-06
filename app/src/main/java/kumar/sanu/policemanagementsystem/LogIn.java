package kumar.sanu.policemanagementsystem;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ashrafiqubal on 06/05/17.
 */

public class LogIn extends AppCompatActivity {
    EditText customerMobileNo ,customerPassword;
    String customerMobileNoString,customerPasswordString,selectedItemsInSTring;
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_log_in);
        customerMobileNo = (EditText)findViewById(R.id.customer_mobile_no);
        customerPassword = (EditText)findViewById(R.id.customer_password);
        Log.d("Sing Up://", "Line Executed");
    }
    public void logIn(View view){
        customerMobileNoString = customerMobileNo.getText().toString();
        if(customerMobileNoString.length()<10){
            Toast.makeText(getApplicationContext(),"Enter a valid Mobile no",Toast.LENGTH_SHORT).show();
            return;
        }else if(!customerMobileNoString.equals("0000000000")){
            Toast.makeText(getApplicationContext(),"Mobile number not found",Toast.LENGTH_SHORT).show();
            return;
        }
        customerPasswordString = customerPassword.getText().toString();
        if(!customerPasswordString.equals("sanukumar")){
            Toast.makeText(getApplicationContext(),"Incorrect Password",Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void joinToday(View view){
        Intent signUp = new Intent(LogIn.this,SingUp.class);
        startActivity(signUp);
        finish();
    }
}
