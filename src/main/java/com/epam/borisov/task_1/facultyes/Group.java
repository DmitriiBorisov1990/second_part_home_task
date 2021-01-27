package com.epam.borisov.task_1.facultyes;

import com.epam.borisov.task_1.Student;
import com.epam.borisov.task_1.subjects.Subject;

import java.util.Arrays;
import java.util.List;

public class Group {
    private static final String MATH = "Math";
    private static final String ENGLISH = "English";
    private static final String HISTORY = "History";

    private int idGroup;
    private List<Subject> subjectList;
    private List<Student> studentList;

    public Group(int idGroup, List<Student> students) {
        this.studentList = students;
        this.idGroup = idGroup;
        if (idGroup == 711 || idGroup == 712) {
            this.subjectList = group711And712();
        } else {
            this.subjectList = otherGroup();
        }
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public int getIdGroup() {
        return idGroup;
    }

    private List<Subject> group711And712() {
        List<Subject> subjectList711And712 = Arrays.asList(
                new Subject(MATH),
                new Subject(ENGLISH)
        );
        return subjectList711And712;
    }

    private List<Subject> otherGroup() {
        List<Subject> subjectListOtherGroup = Arrays.asList(
                new Subject(HISTORY),
                new Subject(ENGLISH)
        );
        return subjectListOtherGroup;
    }

    @Override
    public String toString() {
        return "Group : " + idGroup + " student list " + studentList + " subject list : " + subjectList;
    }
}
