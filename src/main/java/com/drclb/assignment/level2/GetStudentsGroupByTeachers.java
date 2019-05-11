package com.drclb.assignment.level2;

import com.drclb.assignment.common.Student;
import com.drclb.assignment.common.Teacher;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Assignment use case: In this class, requirement is to combine teachers and students in a map using a
 * foreign key concepts ({@link Teacher#getEnrolledStudents()} getEnrolledStudents() contains the list of student roll number and
 * act as foreign key of student and mapped with {@link Student#getRollNumber()}
 */
public class GetStudentsGroupByTeachers {

    public Map<Teacher, List<Student>> transform(List<Teacher> teachersInWholeSchool,
                                                 List<Student> studentsInWholeSchool) {
        Map<Teacher, List<Student>> teachersWithAssociatedStudents = Collections.EMPTY_MAP;

        // TODO -  add your logic here and return proper <teacher, student> mapped values
        // HINT - use teacher.getEnrolledStudents() to retrieve list of students rollNumber associated
        // with a teacher
        return teachersWithAssociatedStudents;

    }
}
