package com.epam.borisov.task_1.facultyes;

import com.epam.borisov.task_1.exception.Absence;

import java.util.List;

public class Faculty {
    private final String AVIATION = "aviation";
    private final String AIR_DEFENSE = "air defense";
    private String facultyName;
    private List<Student> groupList;

    public Faculty(String facultyName, Groups group) {
        this.facultyName = facultyName;
        if (facultyName.equals(AVIATION)) {
            try {
                this.groupList = group.getStudentListGroupOfAviationFaculty();
            } catch (Absence e) {
                e.printStackTrace();
            }
        } else {
            try {
                this.groupList = group.getStudentListGroupOfAirDefenseFaculty();
            } catch (Absence e) {
                e.printStackTrace();
            }
        }
    }

    public void averageSubjectGradeInGroup(int groupId, String subjectName, String facultyName) throws Absence {
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

    private float averageScoreForSubjectInFaculty(List<Student> students, int groupId, String subjectName) throws Absence {
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

    public List<Student> getGroupList() throws Absence {
        if (groupList.isEmpty()) {
            throw new Absence("There are no groups in faculty!");
        }
        return groupList;
    }

    @Override
    public String toString() {
        return "Faculty " + facultyName + " group list " + groupList;
    }
}
