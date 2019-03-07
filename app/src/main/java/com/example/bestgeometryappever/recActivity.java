package com.example.bestgeometryappever;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class recActivity extends AppCompatActivity {

    // create a function to calculate the rectangle's area for the button's onClick
    public void calcAreaR(View v){
        // capture field inputs
        final EditText lengthR = (EditText) findViewById(R.id.lengthR);
        final EditText widthR = (EditText) findViewById(R.id.widthR);
        final TextView areaResultR = (TextView) findViewById(R.id.areaResultR);

        // declare local variables
        double lengthRectangle, widthRectangle, areaR = 0.0;

        // capture text field inputs
        lengthRectangle = Double.parseDouble(lengthR.getText().toString());
        widthRectangle = Double.parseDouble(widthR.getText().toString());
        areaR = lengthRectangle * widthRectangle;

        // setup output string formatting
        String outputFormat = String.format("%, .2f", areaR);

        // post output to view
        areaResultR.setText(outputFormat);
    } // end calcAreaR()



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    } // end onCreate()

} // end recActivity
