
package com.epam.borisov.task_1.facultyes;

import java.util.Arrays;

public class Subject {

    private String subjectName;
    private int[] marks;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setMarks(int... marks) {
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public float averageSubjectMark() {
        float averageValue = 0f;
        for (float mark : marks) {
            averageValue += mark;
        }
        return averageValue / marks.length;
    }

    @Override
    public String toString() {
        return subjectName + " " + Arrays.toString(marks);
    }
}

