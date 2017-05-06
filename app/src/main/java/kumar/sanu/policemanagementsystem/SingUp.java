package kumar.sanu.policemanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ashrafiqubal on 06/05/17.
 */

public class SingUp extends AppCompatActivity {
    EditText customerMobileNo ,customerPassword ,customerFirstName,customerLastName,email;
    String customerMobileNoString,customerPasswordString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sing_up);
        customerMobileNo = (EditText)findViewById(R.id.customer_mobile_no);
        customerPassword = (EditText)findViewById(R.id.customer_password);
        customerFirstName = (EditText)findViewById(R.id.customer_first_name);
        customerLastName = (EditText)findViewById(R.id.customer_last_name);
        email = (EditText)findViewById(R.id.customer_email_address);
    }
    @Override
    public void onBackPressed(){
        Intent logInIntent = new Intent(SingUp.this,LogIn.class);
        startActivity(logInIntent);
        finish();
    }
    public void singUp(View view){
        customerMobileNoString = customerMobileNo.getText().toString();
        if(customerMobileNoString.length()<10){
            Toast.makeText(getApplicationContext(),"Enter a valid Mobile no",Toast.LENGTH_SHORT).show();
            return;
        }
        customerPasswordString = customerPassword.getText().toString();
        if(customerPasswordString.length()<4){
            Toast.makeText(getApplicationContext(),"Password lenght should be greater than 4 ",Toast.LENGTH_SHORT).show();
            return;
        }
        String customerFirstNameString = customerFirstName.getText().toString();
        if(customerFirstNameString.length()<3){
            Toast.makeText(getApplicationContext(),"Enter a valid Name",Toast.LENGTH_SHORT).show();
            return;
        }
    }
    public void loginNow(View view){
        Intent logInIntent = new Intent(SingUp.this,LogIn.class);
        startActivity(logInIntent);
        finish();
    }
}
