
package com.epam.borisov.task_1.facultyes;

import com.epam.borisov.task_1.exception.Absence;
import com.epam.borisov.task_1.exception.MarkRange;

import java.util.Arrays;
import java.util.List;

public class Student {

    private final String MATH = "Math";
    private final String ENGLISH = "English";
    private final String HISTORY = "History";

    private int idGroup;
    private String firstName;
    private String secondName;
    private List<Subject> subjectList;

    public Student(int idGroup, String firstName, String secondName) {
        this.idGroup = idGroup;
        this.firstName = firstName;
        this.secondName = secondName;
        if (idGroup == 711 || idGroup == 712) {
            this.subjectList = group711And712();
        } else if (idGroup == 511 || idGroup == 512) {
            this.subjectList = group511And512();
        }
    }

    public void averageStudentSubjectsGrade() throws Absence {
        float averageValue = 0;
        for (Subject subject : getSubjectList()) {
            averageValue += subject.averageSubjectMark();
        }
        System.out.println("Average grade " + firstName + " " + secondName + ": " + averageValue / subjectList.size());
    }

    public void addMark(String subjectName, int... marks) throws MarkRange, Absence {
        for (Subject subject : getSubjectList()) {
            if (subject.getSubjectName().equals(subjectName)) {
                for (int i = 0; i < marks.length; i++) {
                    if (marks[i] < 0 || marks[i] > 10)
                        throw new MarkRange("Out of mark range!");
                }
                subject.setMarks(marks);
            }
        }
    }

    private List<Subject> group711And712() {
        return Arrays.asList(
                new Subject(MATH),
                new Subject(ENGLISH));
    }

    private List<Subject> group511And512() {
        return Arrays.asList(
                new Subject(HISTORY),
                new Subject(ENGLISH));
    }

    public int getIdGroup() {
        return idGroup;
    }

    public List<Subject> getSubjectList() throws Absence {
        if (subjectList == null || subjectList.isEmpty() == true) {
            throw new Absence("List of subject is empty!");
        }
        return subjectList;
    }

    @Override
    public String toString() {
        return "Student : " + firstName + " " + secondName + " id group " + idGroup + " subject list " + subjectList;
    }
}
