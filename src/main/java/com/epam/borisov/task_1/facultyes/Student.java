
package com.epam.borisov.task_1.facultyes;

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
        } else {
            this.subjectList = group511And512();
        }
    }

    public void averageStudentSubjectsGrade() {
        float averageValue = 0;
        for (Subject subject : subjectList) {
            averageValue += subject.averageSubjectMark();
        }
        System.out.println("Average grade " + firstName + " " + secondName + ": " + averageValue / subjectList.size());
    }

    public void addMark(String subjectName, int... marks) {
        for (Subject subject : getSubjectList()) {
            if (subject.getSubjectName().equals(subjectName)) {
                for (int i = 0; i < marks.length; i++) {
                    if (marks[i] < 0 || marks[i] > 10)
                        //throw
                        System.out.println(marks[i] + "!!!!!");
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

    public String getSecondName() {
        return secondName;
    }

    public List<Subject> getSubjectList() {
        if (subjectList.size() == 0) {
            // throw
        }
        return subjectList;
    }

    @Override
    public String toString() {
        return "Student : " + firstName + " " + secondName + " id group " + idGroup + " subject list " + subjectList;
    }
}
