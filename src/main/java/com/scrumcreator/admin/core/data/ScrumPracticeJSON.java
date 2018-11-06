package com.scrumcreator.admin.core.data;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScrumPracticeJSON {

    private List<ScrumPractice> rows;

    public ScrumPracticeJSON(List<ScrumPractice> rows) {
        Collections.sort(rows, Comparator.comparing(ScrumPractice::getPracticeIndex));
        this.rows = rows;
    }

    public List<ScrumPractice> getRows() {
        return rows;
    }

    public void setRows(List<ScrumPractice> rows) {
        this.rows = rows;
    }
}
