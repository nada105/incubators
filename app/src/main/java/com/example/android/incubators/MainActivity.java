package com.example.android.incubators;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        // Find the View that shows the incubator1
        TextView incubator1 = (TextView) findViewById(R.id.incubator1);

        // Set a click listener on that View
        incubator1.setOnClickListener(new View.OnClickListener () {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent incubatorIntent1 = new Intent(MainActivity.this, incubator1.class);

                // Start the new activity
                startActivity(incubatorIntent1);
            }
        });


        // Find the View that shows the incubator2
        TextView incubator2 = (TextView) findViewById(R.id.incubator2);

        // Set a click listener on that View
        incubator2.setOnClickListener(new View.OnClickListener () {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent incubatorIntent2 = new Intent(MainActivity.this, incubator2.class);

                // Start the new activity
                startActivity(incubatorIntent2);
            }
        });


        // Find the View that shows the incubator3
        TextView incubator3 = (TextView) findViewById(R.id.incubator3);

        // Set a click listener on that View
        incubator3.setOnClickListener(new View.OnClickListener () {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent incubatorIntent3 = new Intent(MainActivity.this, incubator3.class);

                // Start the new activity
                startActivity(incubatorIntent3);
            }
        });

        // Find the View that shows the incubator4
        TextView incubator4 = (TextView) findViewById(R.id.incubator4);

        // Set a click listener on that View
        incubator3.setOnClickListener(new View.OnClickListener () {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent incubatorIntent4 = new Intent(MainActivity.this, incubator4.class);

                // Start the new activity
                startActivity(incubatorIntent4);
            }
        });

    }
}
