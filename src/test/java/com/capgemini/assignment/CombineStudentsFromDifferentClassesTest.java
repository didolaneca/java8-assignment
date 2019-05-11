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
public class CombineStudentsFromDifferentClassesTest {

    @Test
    public void testClassCombiner() {
        List<Student> class1 = Arrays.asList(
                new Student(1, "Student1-class1", null, null),
                new Student(2, "student-2-class1", null, null)
        );
        List<Student> class2 = Arrays.asList(
                new Student(1, "Student1-class1", null, null),
                new Student(2, "student-2-class1", null, null)
        );

        List<Student> actual = new CombineStudentsFromDifferentClasses().process(class1, class2);
        Assert.assertEquals(actual.size(), 4);
    }
}
