/*
 * This program illustrate the java 8 features for training purpose
 *     Copyright (c) 2019. Ravi Bhushan (ravi-bhushan@hotmail.com)
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.capgemini.assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

@Test
public class FindStudentsByLocationTest {
    private static final String STUDENT_LOC_TO_SEARCH = "canada";

    @Test
    public void testLocationStudentExtractorByLocation() {
        List<Student> students = Arrays.asList(
                new Student(1, "student1", null, STUDENT_LOC_TO_SEARCH),
                new Student(2, "student2", null, "Usa"),
                new Student(3, "student3", null, "India"),
                new Student(4, "student4", null, STUDENT_LOC_TO_SEARCH),
                new Student(5, "student5", null, STUDENT_LOC_TO_SEARCH),
                new Student(6, "student6", null, STUDENT_LOC_TO_SEARCH)
        );
        List<Student> actualResult = new FindStudentsByLocation().getNumberOfStudentsByLocation(STUDENT_LOC_TO_SEARCH, students);
        Assert.assertEquals(actualResult.size(), 4);
        Assert.assertFalse(actualResult.contains( new Student(2, "student2", null, "Usa")));
        Assert.assertTrue(actualResult.contains(new Student(1, "student1", null, STUDENT_LOC_TO_SEARCH)));
    }
}
