package com.gtx.android.marksheet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstSemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_sem);

        ArrayList<ListItems> mainList = new ArrayList<ListItems>();

        mainList.add(new ListItems("NAS101", "Engg. Physics - I", "24 + 34", 24 + 34));
        mainList.add(new ListItems("NAS105", "Environment & Ecology", "23 + 31", 23 + 31));
        mainList.add(new ListItems("NAS102", "Engg. Mechanics", "49 + 30", 49 + 30));
        mainList.add(new ListItems("NAS103", "Engg. Mathematics - I", "45 + 41", 45 + 41));
        mainList.add(new ListItems("NAS104", "Professional Communication", "46 + 76", 46 + 76));
        mainList.add(new ListItems("NCS101", "Computer System and Programming in C", "50 + 38", 50 + 38));

        mainList.add(new ListItems("NME152", "Mechanics Lab", "18 + 29", 18 + 29));
        mainList.add(new ListItems("NCS151", "Computer Programming Lab", "20 + 28", 20 + 28));
        mainList.add(new ListItems("NCE151", "Computer Aided Engg. Graphics", "19 + 29", 19 + 29));
        mainList.add(new ListItems("NAS154", "Professional Communication Lab", "18 + 28", 18 + 28));

        mainList.add(new ListItems("NGP101", "General Proficiency", "49", 49));

        ListItemsAdapter adapter = new ListItemsAdapter(this, mainList);

        ListView listView = (ListView) findViewById(R.id.activity_first_sem);

        listView.setAdapter(adapter);

    }
}
