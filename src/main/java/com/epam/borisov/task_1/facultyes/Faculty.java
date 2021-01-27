package com.epam.borisov.task_1.facultyes;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private String facultyName;
    private List<Group> groupList;

    public Faculty(String facultyName, List<Group> groupList) {
        this.facultyName = facultyName;
        this.groupList = groupList;
    }

    public List<Group> getGroups() {
        return groupList;
    }

    public void setGroups(Group group) {
        List<Group> groupList = new ArrayList<>();
        groupList.add(group);
        this.groupList = groupList;
    }

    @Override
    public String toString() {
        return facultyName + "\ngroup list " + groupList + ";";
    }
}
