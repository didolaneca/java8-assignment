package com.drclb.assignment.level2;

import com.drclb.assignment.common.Student;
import com.drclb.assignment.common.Teacher;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Assignment use case: Objective is to retrieve list of students belongs to a teacher.
 * @see Teacher#getEnrolledStudents() to retrieve lis of student rollNumber associated with a teacher
 */
public class GetStudentsFromTeachers {

    public List<Student> process(Teacher teacher, List<Student> allStudentsInSchool){
        List<Student> studentsAssociatedWithTeacher = Collections.emptyList();
        // TODO - add your logic here and return proper students list who associate with given teacher
        // HINT - use teacher.getEnrolledStudents() to retrieve list of students rollNumber associated
        // with a teacher
        return studentsAssociatedWithTeacher;
    }
}
