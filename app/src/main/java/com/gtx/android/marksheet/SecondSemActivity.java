package com.gtx.android.marksheet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondSemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_sem);


        ArrayList<ListItems> mainList = new ArrayList<ListItems>();

        mainList.add(new ListItems("NAS201", "Engg. Physics - II", "24 + 45", 24 + 45));
        mainList.add(new ListItems("NME201", "Basic Manufacturing Process", "23 + 18", 23 + 18));
        mainList.add(new ListItems("NAS203", "Engg. Mathematics - II", "47 + 57", 47 + 57));
        mainList.add(new ListItems("NEC201", "Electronic Engg.", "45 + 70", 5 + 70));
        mainList.add(new ListItems("NAS202", "Engg. Chemistry", "46 + 65", 46 + 65));
        mainList.add(new ListItems("NEE201", "Basic Electrical Engg.", "45 + 67", 45 + 67));

        mainList.add(new ListItems("NAS252", "Engg. Chemistry Lab", "20 + 29", 20 + 29));
        mainList.add(new ListItems("NEE251", "Basic Electrical Engg. Lab", "19 + 29", 19 + 29));
        mainList.add(new ListItems("NWS251", "Workshop Practice", "18 + 28", 18 + 28));
        mainList.add(new ListItems("NAS251", "Engg. Physics Lab", "19 + 28", 19 + 28));

        mainList.add(new ListItems("NGP201", "General Proficiency", "49", 49));

        ListItemsAdapter adapter = new ListItemsAdapter(this, mainList);

        ListView listView = (ListView) findViewById(R.id.activity_second_sem);

        listView.setAdapter(adapter);
    }
}
