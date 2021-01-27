package com.epam.borisov.task_1.facultyes;

import java.util.List;

public class University {

    private String universityName;
    private List<Faculty> facultyList;

    public University(String universityName,List<Faculty> faculties){
        this.universityName = universityName;
        this.facultyList = faculties;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    @Override
    public String toString() {
        return "University : " + universityName  + ".\nfaculty list : " + facultyList;
    }
}
