package kumar.sanu.policemanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chatIcon(View view){
        Intent intent = new Intent(this,ChattingClass.class);
        startActivity(intent);
    }
    public void notificationIcon(View view){
        Intent intent = new Intent(this,NotificationClass.class);
        startActivity(intent);
    }
}
