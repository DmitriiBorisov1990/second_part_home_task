package com.epam.borisov.task_1.facultyes;

import java.util.ArrayList;
import java.util.List;

public class Groups {

    private List<Student> studentListGroupOfAviationFaculty = new ArrayList<>();
    private List<Student> studentListGroupOfAirDefenseFaculty = new ArrayList<>();

    public Groups(List<Student> students) {
        if (students.isEmpty() || students == null) {
            System.out.println("!!!!!!");
        } else {
            for (Student student : students) {
                if (student.getIdGroup() == 711 || student.getIdGroup() == 712) {
                    studentListGroupOfAviationFaculty.add(student);
                } else {
                    studentListGroupOfAirDefenseFaculty.add(student);
                }
            }
        }
    }

    public List<Student> getStudentListGroupOfAviationFaculty() {
        return studentListGroupOfAviationFaculty;
    }

    public List<Student> getStudentListGroupOfAirDefenseFaculty() {
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
