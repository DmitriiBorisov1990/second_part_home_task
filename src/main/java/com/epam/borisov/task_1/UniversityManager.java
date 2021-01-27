package com.epam.borisov.task_1;


import com.epam.borisov.task_1.facultyes.Faculty;
import com.epam.borisov.task_1.facultyes.University;
import com.epam.borisov.task_1.facultyes.Group;
import com.epam.borisov.task_1.subjects.Subject;

import java.util.Arrays;
import java.util.List;

public class UniversityManager {

    public static void main(String[] args) {

        Student student_1 = new Student("Dmitrii", "Borisov");
        Student student_2 = new Student("Dmitrii", "Shevelev");
        Student student_3 = new Student("Ilia", "Kuznetsov");
        Student student_4 = new Student("Viktor", "Virkovskii");
        Student student_5 = new Student("Sergei", "Semenuk");
        Student student_6 = new Student("Dmitrii", "Nosachev");
        Student student_7 = new Student("Kirill", "Sokolovskii");
        Student student_8 = new Student("Aleksandr", "Turonok");
        /*addMark(student_1, "English", 9, 6, 8);
        addMark(student_1, "Math", 6, 5, 7);
        addMark(student_2, "Math", 4, 5, 7);
        addMark(student_2, "English", 4, 5);
        addMark(student_3, "Math", 7, 8, 7);
        addMark(student_3, "English", 4, 5, 6);
        addMark(student_4, "Math", 4, 3, 3);
        addMark(student_4, "English", 4, 5, 4);*/
        Group group_711 = new Group(711,Arrays.asList(student_1,student_2));
        Group group_712 = new Group(712,Arrays.asList(student_3,student_4));
        Group group_511 = new Group(511,Arrays.asList(student_5,student_6));
        Group group_512 = new Group(512,Arrays.asList(student_7,student_8));
        Faculty aviationFaculty = new Faculty("aviation faculty",Arrays.asList(group_711,group_712));
        Faculty airDefenseFaculty = new Faculty("air defense faculty",Arrays.asList(group_511,group_512));
        University university = new University("Military academy", Arrays.asList(aviationFaculty,airDefenseFaculty));
        System.out.println(university);
    }

    private static void addMark(Group group,String studentName, String subjectName, int... marks) {
        /*for (Subject subject : student.getSubjectsList()) {
            if (subject.getSubjectName().equals(subjectName)) {
                subject.setMarks(marks);
            }
        }*/
    }

    /*private static float averageScoreForAllSubjectsOfStudent(Student student) {
        int quantityMarks = 0;
        float averageMarks = 0;
        int marksTotal[];
        List<Subject> subjectList = student.getSubjectsList();
        for (Subject subject : subjectList) {
            marksTotal = subject.getMarks();
            quantityMarks += marksTotal.length;
            for (int i = 0; i < marksTotal.length; i++) {
                averageMarks += marksTotal[i];
            }
        }
        return averageMarks / quantityMarks;
    }*/

    /**
     * Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
     */
    private static float averageScoreForSubjectInFaculty(String subjectName, int groupId, String facultyesName, University university) {
        List<Faculty> facultyList = university.getFacultyList();
        System.out.println(facultyList);
        return 0;
    }
}
