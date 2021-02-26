
package com.epam.borisov.task_1;

import com.epam.borisov.task_1.facultyes.Faculty;
import com.epam.borisov.task_1.facultyes.Groups;
import com.epam.borisov.task_1.facultyes.Student;
import com.epam.borisov.task_1.facultyes.University;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversityManager {

    private static final String MATH = "Math";
    private static final String ENGLISH = "English";
    private static final String HISTORY = "History";

    public static void main(String[] args) {
        Student student_1 = new Student(711, "Mary", "Smith");
        Student student_2 = new Student(712, "Jack", "Brown");
        Student student_3 = new Student(511, "Tom", "White");
        Student student_4 = new Student(512, "Nick", "Green");
        student_1.addMark(MATH, 7,8);
        student_1.addMark(ENGLISH, 6,7);
        student_2.addMark(MATH, 4,6);
        student_2.addMark(ENGLISH, 5,6);
        student_3.addMark(HISTORY, 8,7);
        student_3.addMark(ENGLISH, 6,6);
        student_4.addMark(HISTORY, 8,8);
        student_4.addMark(ENGLISH, 5,7);
        List<Student>TEST = null;
        //Groups test = new Groups(TEST);
        Groups groups = new Groups(addStudent(student_1, student_2, student_3, student_4));
        Faculty aviationFaculty = new Faculty("aviation",groups);
        Faculty airDefenseFaculty = new Faculty("air defense",groups);
        University university = new University("West point academy", Arrays.asList(aviationFaculty, airDefenseFaculty));
        student_1.averageStudentSubjectsGrade();
        aviationFaculty.averageSubjectGradeInGroup(711,MATH,"aviation");
        university.averageUniversitySubjectGrade(ENGLISH);
    }

    private static List<Student> addStudent(Student... students) {
        return new ArrayList<>(Arrays.asList(students));
    }
}
