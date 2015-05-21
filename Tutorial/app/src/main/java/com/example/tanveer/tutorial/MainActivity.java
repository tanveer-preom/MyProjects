package com.example.tanveer.tutorial;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{
    Button a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("summit","onCreate");
        a = (Button)findViewById(R.id.button);
        a.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("summit", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("summit", "onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("summit", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("summit","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("summit", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("summit", "onDestroy");
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"Button Pressed",Toast.LENGTH_LONG).show();
        Log.i("Summit","Button Clicked");
    }
}
