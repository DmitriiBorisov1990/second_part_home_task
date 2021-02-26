package com.epam.borisov.task_1.facultyes;

import java.util.List;

public class Faculty {
    private final String AVIATION = "aviation";
    private final String AIR_DEFENSE = "air defense";
    private String facultyName;
    private List<Student> groupList;

    public Faculty(String facultyName, Groups group) {
        this.facultyName = facultyName;
        if (facultyName.equals(AVIATION)) {
            this.groupList = group.getStudentListGroupOfAviationFaculty();
        } else {
            this.groupList = group.getStudentListGroupOfAirDefenseFaculty();
        }
    }

    public void averageSubjectGradeInGroup(int groupId, String subjectName, String facultyName) {
        float averageSubjectMarkInFaculty = 0;
        switch (facultyName) {
            case AVIATION: {
                averageSubjectMarkInFaculty = averageScoreForSubjectInFaculty(groupList, groupId, subjectName);
            }
            break;
            case AIR_DEFENSE: {
                averageSubjectMarkInFaculty = averageScoreForSubjectInFaculty(groupList, groupId, subjectName);
            }
            break;
        }
        System.out.println("Average grade in " + groupId + " group in " + subjectName + ": " + averageSubjectMarkInFaculty);
    }

    private float averageScoreForSubjectInFaculty(List<Student> students, int groupId, String subjectName) {
        int groupCounter = 0;
        float averageSubjectMarkInFaculty = 0;
        for (Student student : students) {
            if (student.getIdGroup() == groupId) {
                groupCounter++;
                for (Subject subject : student.getSubjectList()) {
                    if (subject.getSubjectName().equals(subjectName)) {
                        float averageSubjectMarkForStudent = subject.averageSubjectMark();
                        averageSubjectMarkInFaculty += averageSubjectMarkForStudent;
                    }
                }
            }
        }
        return averageSubjectMarkInFaculty / groupCounter;
    }

    public List<Student> getGroupList() {
        return groupList;
    }

    @Override
    public String toString() {
        return "Faculty " + facultyName + " group list " + groupList;
    }
}
