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

import java.util.Map;
import java.util.Objects;

public class Student {
    int _rollNumber;
    String _name;
    Map<String, Integer> _examScore; // Map<subject_name,grade>
    String _location;


    public Student() {
    }

    public Student(int rollNumber, String name, Map<String, Integer> examsAndScores, String location) {
        _rollNumber = rollNumber;
        _name = name;
        _examScore = examsAndScores;
        _location = location;
    }


    public String getLocation() {
        return _location;
    }

    public void setLocation(String location) {
        this._location = location;
    }

    public int getRollNumber() {
        return _rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this._rollNumber = rollNumber;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public Map<String, Integer> getExamScore() {
        return _examScore;
    }

    public void setExamScore(Map<String, Integer> examScore) {
        this._examScore = examScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return _rollNumber == student._rollNumber &&
                Objects.equals(_name, student._name) &&
                Objects.equals(_examScore, student._examScore) &&
                Objects.equals(getLocation(), student.getLocation());
    }

    @Override
    public int hashCode() {

        return Objects.hash(_rollNumber, _name, _examScore, getLocation());
    }
}


// total exam score ---
// group by location --
// filter by location and count ---
// get list of subjects
//
