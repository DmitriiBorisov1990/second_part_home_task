package com.epam.borisov.task_1.facultyes;

import com.epam.borisov.task_1.exception.Absence;

import java.util.ArrayList;
import java.util.List;

public class Groups {

    private List<Student> studentListGroupOfAviationFaculty = new ArrayList<>();
    private List<Student> studentListGroupOfAirDefenseFaculty = new ArrayList<>();

    public Groups(List<Student> students) {
        for (Student student : students) {
            if (student.getIdGroup() == 711 || student.getIdGroup() == 712) {
                studentListGroupOfAviationFaculty.add(student);
            } else {
                studentListGroupOfAirDefenseFaculty.add(student);
            }
        }
    }

    public List<Student> getStudentListGroupOfAviationFaculty() throws Absence {
        if (studentListGroupOfAviationFaculty.isEmpty()) {
            throw new Absence("There are no students in aviation faculty!");
        }
        return studentListGroupOfAviationFaculty;
    }

    public List<Student> getStudentListGroupOfAirDefenseFaculty() throws Absence {
        if (studentListGroupOfAirDefenseFaculty.isEmpty()) {
            throw new Absence("There are no students in air defense faculty!");
        }
        return studentListGroupOfAirDefenseFaculty;
    }

    public List<Student> getAllGroups() {
        List<Student> allGroups = new ArrayList<>();
        allGroups.addAll(studentListGroupOfAirDefenseFaculty);
        allGroups.addAll(studentListGroupOfAviationFaculty);
        return allGroups;
    }

    @Override
    public String toString() {
        return "Student list " + studentListGroupOfAviationFaculty;
    }
}
