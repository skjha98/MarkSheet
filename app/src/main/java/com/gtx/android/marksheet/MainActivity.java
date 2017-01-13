package com.gtx.android.marksheet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstYearTextView = (TextView) findViewById(R.id.firstYear);
        firstYearTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening markSheet for 1st Year", Toast.LENGTH_SHORT).show();
            }
        });

        TextView secondYearTextView = (TextView) findViewById(R.id.secondYear);
        secondYearTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening markSheet for 2nd Year", Toast.LENGTH_SHORT).show();
            }
        });

        TextView thirdYearTextView = (TextView) findViewById(R.id.thirdYear);
        thirdYearTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening markSheet for 3rd Year", Toast.LENGTH_SHORT).show();
            }
        });

        TextView fourthYearTextView = (TextView) findViewById(R.id.fourthYear);
        fourthYearTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening markSheet for 4th Year", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
