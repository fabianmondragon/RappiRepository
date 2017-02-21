package com.fabian.rappi.rappi.activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.view.View;
import android.view.WindowManager;

import com.fabian.rappi.rappi.R;

import static android.R.transition.explode;

/**
 * Created by FabianPc on 19/02/17.
 */

public class LoginActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


    }
    public void start (View v)
    {
        Intent myIntent = new Intent();
        myIntent.setClass(this, MainActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            startActivity(myIntent, ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this).toBundle());
        }
        else
            startActivity(myIntent);

    }
}
