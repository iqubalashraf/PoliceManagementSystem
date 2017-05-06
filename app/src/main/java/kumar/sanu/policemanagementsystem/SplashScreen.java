package kumar.sanu.policemanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

/**
 * Created by ashrafiqubal on 06/05/17.
 */

public class SplashScreen  extends AppCompatActivity {
    final int SPLASH_TIME_OUT = 3000; // time in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.layout_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                proceedNormally();
            }
        },SPLASH_TIME_OUT);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    private void proceedNormally(){
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
        finish();
    }
}
