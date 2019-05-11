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

package com.drclb.assignment;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

@Test
public class FindTotalSubjectsTest {

    @Test
    public void testTotalSubjectsForASpecificStudent(){
        Map<String, Integer> subjects = new HashMap<>();
        subjects.put("subject-1",10);
        subjects.put("subject-2",10);
        subjects.put("subject-3",10);
        subjects.put("subject-4",10);
        subjects.put("subject-5",10);
        subjects.put("subject-6",10);
        subjects.put("subject-7",10);
        subjects.put("subject-8",10);
        subjects.put("subject-9",10);

        Student student = new Student(1,"Student-1", subjects, "canada");
        assertEquals(new FindTotalSubjects().calculateTotalSubjects(student),9);
    }
}
