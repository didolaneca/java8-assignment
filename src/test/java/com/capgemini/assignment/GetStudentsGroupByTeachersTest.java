package com.capgemini.assignment;

import com.capgemini.assignment.common.Student;
import com.capgemini.assignment.common.Teacher;
import com.capgemini.assignment.level2.GetStudentsGroupByTeachers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.capgemini.assignment.helper.TestStudentCreator.*;
import static com.capgemini.assignment.helper.TestTeacherCreator.TEACHER_1;
import static com.capgemini.assignment.helper.TestTeacherCreator.TEACHER_2;

@Test
public class GetStudentsGroupByTeachersTest {

    @Test
    public void testStudentGrouper(){
        List<Teacher> listOfTeachersInSchool = Arrays.asList(TEACHER_1, TEACHER_2);
        List<Student> listOfAllStudentsInSchool = Arrays.asList(
                STUDENT_1,STUDENT_2,STUDENT_3,STUDENT_4,STUDENT_5,STUDENT_6,
                STUDENT_7,STUDENT_8,STUDENT_9,STUDENT_10,STUDENT_11,STUDENT_12
        );

        Map<Teacher, List<Student>> actualResult =new GetStudentsGroupByTeachers().transform(listOfTeachersInSchool,listOfAllStudentsInSchool);

        Assert.assertEquals(actualResult.get(TEACHER_1), Arrays.asList(
                STUDENT_1,STUDENT_2,STUDENT_3,STUDENT_7
        ));
    }
}
