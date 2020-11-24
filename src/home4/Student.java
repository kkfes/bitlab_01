package home4;


import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    String name;
    String surname;
    ArrayList<Subject> subjects = new ArrayList<Subject>();


    public Student() {
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public void addSub(Subject subject){
        subjects.add(subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ",       subjects=" + subjects.toString() +
                "}\n";
    }
}
