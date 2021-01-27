package com.epam.borisov.task_1.subjects;

import java.util.Arrays;

public class Subject {

    private String subjectName;
    private int marks[];

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int... marks) {
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }


    @Override
    public String toString() {
        return "Subject -> " + subjectName + " marks : " + Arrays.toString(marks);
    }
}
