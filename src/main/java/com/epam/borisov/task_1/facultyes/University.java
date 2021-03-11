
package com.epam.borisov.task_1.facultyes;

import com.epam.borisov.task_1.exception.Absence;

import java.util.List;

public class University {

    private String universityName;
    private List<Faculty> facultyList;

    public University(String universityName, List<Faculty> faculties) {
        this.universityName = universityName;
        this.facultyList = faculties;
    }

    public List<Faculty> getFacultyList() throws Absence {
        if (facultyList == null || facultyList.isEmpty()) {
            throw new Absence("There are no faculty in university!");
        }
        return facultyList;
    }

    public void averageUniversitySubjectGrade(String subjectName) throws Absence {
        float averageTempMark = 0;
        int counter = 0;
        for (Faculty faculty : getFacultyList()) {
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

