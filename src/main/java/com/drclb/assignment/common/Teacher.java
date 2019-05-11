package com.drclb.assignment.common;

import java.util.List;
import java.util.Objects;

/**
 * This class represents teacher's name and associated e
 */
public class Teacher {

    private String _name;
    private List<Integer> _enrolledStudents; // associated students with this teacher


    public String getName() {
        return _name;
    }

    public Teacher setName(String _name) {
        this._name = _name;
        return this;
    }

    public List<Integer> getEnrolledStudents() {
        return _enrolledStudents;
    }

    public Teacher setEnrolledStudents(List<Integer> _enrolledStudents) {
        this._enrolledStudents = _enrolledStudents;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(_name, teacher._name) &&
                Objects.equals(_enrolledStudents, teacher._enrolledStudents);
    }

    @Override
    public int hashCode() {

        return Objects.hash(_name, _enrolledStudents);
    }
}
