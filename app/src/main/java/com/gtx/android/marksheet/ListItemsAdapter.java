package com.gtx.android.marksheet;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by GTX on 13-01-2017.
 */

public class ListItemsAdapter extends ArrayAdapter<ListItems> {

    public static final String LOG_TAG = ListItemsAdapter.class.getSimpleName();

    public ListItemsAdapter(Activity context, ArrayList<ListItems> listItemsElements) {
        super(context, 0, listItemsElements);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_items_view, parent, false);
        }

        ListItems currentList = getItem(position);

        TextView subjectCodeTextView = (TextView) listView.findViewById(R.id.subjectCode);
        subjectCodeTextView.setText(currentList.getSubjectCode());

        TextView subjectNameTextView = (TextView) listView.findViewById(R.id.subjectName);
        subjectNameTextView.setText(currentList.getSubjectName());

        TextView marksDivisionTextView = (TextView) listView.findViewById(R.id.marksDivision);
        marksDivisionTextView.setText(currentList.getMarksDivision());

        TextView totalMarksTextView = (TextView) listView.findViewById(R.id.totalMarks);
        totalMarksTextView.setText(Integer.toString(currentList.getTotalMarks()));

        return listView;
    }
}
