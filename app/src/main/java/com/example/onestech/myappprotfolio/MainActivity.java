package com.example.onestech.myappprotfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.widget.Toast;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


//hi no hiuhfh
        //jhgfkf
//ghfhjasdf
//ramesh
           // fhgsdhkfgsdhf
        //ganesh
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    //hi i have changes this
//srinivas
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //Code for event handled on button press


    //this method is called by buttonMessage and it creates the toasts and format the string and time for the toasts
    public void showButtonContent(String message)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch "+message;
        int duration = Toast.LENGTH_SHORT;


        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }


    // this method is called when ever a button is pressed and it takes the string from the button
    public void buttonMessage(View v)
    {
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        showButtonContent(buttonText);
    }

}
