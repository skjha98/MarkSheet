package com.gtx.android.marksheet;

import java.util.ArrayList;

/**
 * Created by GTX on 13-01-2017.
 */

public class ListItems extends ArrayList {

    private String subjectCode;

    private String subjectName;

    private String marksDivision;

    private int totalMarks;

    public ListItems(String setSubjectCode, String setSubjectName, String setMarksDivision, int setTotalMarks) {

        subjectCode = setSubjectCode;
        subjectName = setSubjectName;
        marksDivision = setMarksDivision;
        totalMarks = setTotalMarks;

    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getMarksDivision() {
        return marksDivision;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

}
