package me.niamulhasan.tutorial.lifecycle;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "We are in onCreate() method!", Toast.LENGTH_LONG).show();
        Log.d("LIFE CYCLE", "We are in onCreate() method!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "We are in onStart() method!", Toast.LENGTH_LONG).show();
        Log.d("LIFE CYCLE", "We are in onStart() method!");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "We are in onResume() method!", Toast.LENGTH_LONG).show();
        Log.d("LIFE CYCLE", "We are in onResume() method!");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "We are in onPause() method!", Toast.LENGTH_LONG).show();
        Log.d("LIFE CYCLE", "We are in onPause() method!");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "We are in onStop() method!", Toast.LENGTH_LONG).show();
        Log.d("LIFE CYCLE", "We are in onStop() method!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(), "We are in onDestroy() method!", Toast.LENGTH_LONG).show();
        Log.d("LIFE CYCLE", "We are in onDestroy() method!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), "We are in onRestart() method!", Toast.LENGTH_LONG).show();
        Log.d("LIFE CYCLE", "We are in onRestart() method!");
    }
}
