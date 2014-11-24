package com.example.franckamayou.barcodescanningapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class HomeActivity extends Activity {

    final Context context = this;

    private Button sell_button;
    private Button buy_button;
    private Button logout_button;
    private Button my_account_button;

    private String currentUserId;

    private final static String TAG = "Home-Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sell_button = (Button) findViewById(R.id.sell_button);
        buy_button =  (Button) findViewById(R.id.buy_button);
        logout_button = (Button) findViewById(R.id.logout_button);
        my_account_button = (Button) findViewById(R.id.my_account_button);

        sell_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent sellActivityIntent = new Intent(context, SellActivity.class);
                    startActivity(sellActivityIntent);
                } catch (Exception e)
                {
                    Log.e(TAG, e.toString());
                }
            }
        });

        buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent buyActivityIntent = new Intent(context, BuyActivity.class);
                    startActivity(buyActivityIntent);
                } catch (Exception e)
                {
                    Log.e(TAG, e.toString());
                }
            }
        });

        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    GlobalApplication application = (GlobalApplication) getApplicationContext();
                    application.setAuthenticated(false);

                    Intent loginActivityIntent = new Intent(context, LoginActivity.class);
                    startActivity(loginActivityIntent);
                } catch (Exception e)
                {
                    Log.e(TAG, e.toString());
                }
            }
        });

        my_account_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent myAccountActivityIntent = new Intent(context, MyAccountActivity.class);
                    startActivity(myAccountActivityIntent);
                } catch (Exception e)
                {
                    Log.e(TAG, e.toString());
                }
            }
        });


    }
}
