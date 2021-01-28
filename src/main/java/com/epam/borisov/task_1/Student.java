package com.epam.borisov.task_1;

import com.epam.borisov.task_1.groups.Group;
import com.epam.borisov.task_1.subjects.Subject;

import java.util.List;

public class Student {

    private int groupId;
    private String firstName;
    private String secondName;
    private List<com.epam.borisov.task_1.subjects.Subject> subjectsList;
    private Group groupName;

    public Student(int groupId, String firstName, String secondName) {
        this.groupId = groupId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.groupName = new Group(groupId);
        this.subjectsList = groupName.getSubjectList();
    }

    public List<Subject> getSubjectsList() {
        return subjectsList;
    }

    @Override
    public String toString() {
        return "Student " +  firstName + " " +  secondName +
                " group id : " + groupId + ", subjects list " + subjectsList;
    }
}
