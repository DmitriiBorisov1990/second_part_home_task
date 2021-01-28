
package com.epam.borisov.task_1;

public class Student {

    private String firstName;
    private String secondName;

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Student -> " + firstName + " " + secondName;
    }
}
