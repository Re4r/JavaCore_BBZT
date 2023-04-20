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

        ArrayList<Student> students1 = new ArrayList<>(students);

        System.out.println("--------------------------------------");

        showList(students);

        students.remove(student3);
        students1.remove(student1);

        showList(students);
        showList(students1);

        for (int i = 0; i < students.size(); i++) {
            boolean result = students.get(i).equals(students1.get(i));
            System.out.println(result);
        }
        System.out.println("--------------------------------------");

        ArrayList<Student> students2 = new ArrayList<>();

        students2.addAll(students);
        students2.addAll(0, students1);

        showList(students2);

        students2.remove(student2);

        showList(students2);

        System.out.println(students2.indexOf(student3));
        System.out.println(students2.lastIndexOf(student3));
        System.out.println(students2.isEmpty());
        System.out.println(students2.size());
        students2.clear();
        students2.trimToSize();
        System.out.println(students2.isEmpty());
        System.out.println(students2.size());

        System.out.println(students.contains(student));
        System.out.println(students.containsAll(students1));


    }

    public static void showList(ArrayList<Student> list) {
        for (Student st : list) {
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