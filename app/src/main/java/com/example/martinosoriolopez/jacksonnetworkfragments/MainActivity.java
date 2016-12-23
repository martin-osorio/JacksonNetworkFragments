package com.example.martinosoriolopez.jacksonnetworkfragments;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckNetworkClick(View view) {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if((networkInfo != null) && networkInfo.isConnectedOrConnecting()){
            Toast.makeText(this, "YOU HAVE NETWORK!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "YOU DON'T HAVE NETWORK!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onJacksonClick(View view) {
        ObjectMapper objectMapper = new ObjectMapper();
    }
}
