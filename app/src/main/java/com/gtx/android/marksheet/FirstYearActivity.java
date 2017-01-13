package com.gtx.android.marksheet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FirstYearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);

        TextView firstSemTextView = (TextView) findViewById(R.id.firstSem);
        firstSemTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FirstYearActivity.this, "Opening MarkSheet for 1st Semester", Toast.LENGTH_SHORT).show();

                Intent firstSemActivityIntent = new Intent(FirstYearActivity.this, FirstSemActivity.class);
                startActivity(firstSemActivityIntent);
            }
        });

        TextView secondSem = (TextView) findViewById(R.id.secondSem);
        secondSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FirstYearActivity.this, "Opening MarkSheet for 2nd Semester", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
