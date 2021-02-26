
package com.epam.borisov.task_1.facultyes;

import java.util.List;

public class University {

    private String universityName;
    private List<Faculty> facultyList;

    public University(String universityName, List<Faculty> faculties) {
        this.universityName = universityName;
        this.facultyList = faculties;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    public void averageUniversitySubjectGrade(String subjectName) {
        float averageTempMark = 0;
        int counter = 0;
        for (Faculty faculty : facultyList) {
            for (Student student : faculty.getGroupList()) {
                for (Subject subject : student.getSubjectList()) {
                    if (subject.getSubjectName().equals(subjectName)) {
                        averageTempMark += subject.averageSubjectMark();
                        counter++;
                    }
                }
            }
        }
        System.out.println("Average university grade in " + subjectName + ": " + averageTempMark / counter);
    }

    @Override
    public String toString() {
        return "University : " + universityName + ". Faculty list : " + facultyList;
    }
}

