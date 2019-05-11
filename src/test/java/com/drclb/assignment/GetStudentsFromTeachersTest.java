package com.drclb.assignment;

import com.drclb.assignment.common.Student;
import com.drclb.assignment.common.Teacher;
import com.drclb.assignment.helper.TestTeacherCreator;
import com.drclb.assignment.level2.GetStudentsFromTeachers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static com.drclb.assignment.helper.TestStudentCreator.*;

@Test
public class GetStudentsFromTeachersTest {

    @Test
    public void testGetStudentsForATeacher() {
        List<Student> actualStudentsBelongsToTeacher =
                new GetStudentsFromTeachers()
                        .process(generateATeacherObj(), generateListOfStudentsInWholeCollege());
        Assert.assertTrue(actualStudentsBelongsToTeacher.contains(STUDENT_1));
        Assert.assertTrue(actualStudentsBelongsToTeacher.contains(STUDENT_2));
        Assert.assertTrue(actualStudentsBelongsToTeacher.contains(STUDENT_3));
        Assert.assertTrue(actualStudentsBelongsToTeacher.contains(STUDENT_7));
        Assert.assertTrue(actualStudentsBelongsToTeacher.size() == 4);
        Assert.assertFalse(actualStudentsBelongsToTeacher.contains(STUDENT_9));

    }

    private List<Student> generateListOfStudentsInWholeCollege() {
        return Arrays.asList(
                STUDENT_1, STUDENT_2, STUDENT_3, STUDENT_4, STUDENT_5, STUDENT_6,
                STUDENT_7, STUDENT_8, STUDENT_9, STUDENT_10, STUDENT_11, STUDENT_12
        );
    }

    private Teacher generateATeacherObj() {
        return TestTeacherCreator.TEACHER_1;
    }
}
