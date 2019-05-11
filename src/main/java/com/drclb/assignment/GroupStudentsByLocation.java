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

import com.drclb.assignment.common.Student;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This assignment test the java 8 skills using below use case.
 *
 * Use case: A school, would like to group all students by their location to check region diversity and
 * prepare a marketing campaign
 */
public class GroupStudentsByLocation {

    public Map<String, List<Student>> process(List<Student> students) {
        Map<String, List<Student>> studentsGroupedByLocation = Collections.EMPTY_MAP;
        // TODO - add your logic here and return appropriate map object
        return studentsGroupedByLocation; // TODO - assignment task
    }
}
