package com.company;

import java.io.Serializable;
import java.io.StringReader;

/**
 * Created by moneg on 05.03.2016.
 */
public class Student implements Serializable {
    protected static String faculty;
    private String name;
    private int id;
    private transient String password;
    private static final long serialVersionUID = 1L;

    public Student(String nameOfFaculty, String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        faculty = nameOfFaculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
