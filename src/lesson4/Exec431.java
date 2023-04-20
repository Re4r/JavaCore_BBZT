package lesson4;

import java.util.ArrayList;

public class Exec431 {
    public static void main(String[] args) {

        Student student = new Student("AAA", 'F', 33);
        Student student1 = new Student("BBB", 'M', 29);
        Student student2 = new Student("CCC", 'F', 39);

        ArrayList<Student> students = new ArrayList<>(3);
        students.add(student);
        students.add(student1);
        students.add(student2);

        for (Student st : students) {
            System.out.println(st);
        }

    }
}

class Student {
    private String name;
    private char sex;
    private int age;

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student - " +
                "name: '" + name + '\'' +
                ", sex: " + sex +
                ", age: " + age;
    }
}