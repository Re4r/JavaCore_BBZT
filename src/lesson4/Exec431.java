package lesson4;

import java.util.ArrayList;
import java.util.Objects;

public class Exec431 {
    public static void main(String[] args) {

        Student student = new Student("AAA", 'F', 33);
        Student student1 = new Student("BBB", 'M', 29);
        Student student2 = new Student("CCC", 'F', 39);
        Student student3 = new Student("CCC", 'F', 39);


        ArrayList<Student> students = new ArrayList<>();

        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("--------------------------------------");
        for (Student st : students) {
            System.out.println(st);
        }
        System.out.println("--------------------------------------");

        students.remove(student3);

        for (Student st : students) {
            System.out.println(st);
        }
        System.out.println("--------------------------------------");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (sex != student.sex) return false;
        if (age != student.age) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (int) sex;
        result = 31 * result + age;
        return result;
    }
}