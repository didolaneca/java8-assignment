package com.drclb.assignment;

import com.drclb.assignment.common.Teacher;
import com.drclb.assignment.level2.FindTeacherWithMostStudents;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

@Test
public class FindTeacherWithMostStudentsTest {

    @Test
    public void testTeacherFinderWithMostStudents(){
        List<Teacher> teachers = Arrays.asList(
          generateTeacher1(),
          generateTeacher2(),
          generateTeacher3()
        );
       Teacher actualTeacherWithMostStudents =  new FindTeacherWithMostStudents().process(teachers);
        Assert.assertEquals(actualTeacherWithMostStudents, generateTeacher3());
    }

    private Teacher generateTeacher1(){
        return new Teacher().setName("teacher-1").setEnrolledStudents(
                Arrays.asList(1,2,3)
        );
    }

    private Teacher generateTeacher2(){
        return new Teacher().setName("Teacher-2").setEnrolledStudents(
                Arrays.asList(4,10)
        );
    }

    private Teacher generateTeacher3(){
        return new Teacher().setName("Teacher-3").setEnrolledStudents(
                Arrays.asList(5,6,7,8)
        );
    }
}
