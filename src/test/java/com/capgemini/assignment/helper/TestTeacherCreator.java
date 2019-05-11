package com.capgemini.assignment.helper;

import com.capgemini.assignment.common.Teacher;

import java.util.Arrays;

import static com.capgemini.assignment.helper.TestStudentCreator.*;

public class TestTeacherCreator {
    public static final Teacher TEACHER_1 = new Teacher().setName("TEACHER_1").setEnrolledStudents(
            Arrays.asList(STUDENT_1.getRollNumber(), STUDENT_2.getRollNumber(), STUDENT_3.getRollNumber(),
                    STUDENT_7.getRollNumber()));

    public static final Teacher TEACHER_2 = new Teacher().setName("TEACHER_2").setEnrolledStudents(
            Arrays.asList(STUDENT_4.getRollNumber(),STUDENT_5.getRollNumber(),STUDENT_6.getRollNumber(),
                    STUDENT_8.getRollNumber())
    );
}
