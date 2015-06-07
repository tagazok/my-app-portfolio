package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void launchSpotify(View v) {
        displayToast("Spotify streamer");
    }

    public void launchScores(View v) {
        displayToast("Scores");
    }

    public void launchLibrary(View v) {
        displayToast("Library");
    }

    public void launchBIB(View v) {
        displayToast("Build it Bigger");
    }

    public void launchXYZ(View v) {
        displayToast("XYZ Reader");
    }

    public void launchCapstone(View v) {
        displayToast("capstone app");
    }

    public void displayToast(String txt) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + txt + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

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
}
