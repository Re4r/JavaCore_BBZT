package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Exec63 {
    public static void main(String[] args) {

        Student st1 = new Student("AAA", 'f', 27, 1, 9.68);
        Student st2 = new Student("BBB", 'f', 35, 2, 7.69);
        Student st3 = new Student("CCC", 'm', 54, 3, 3.54);
        Student st4 = new Student("DDD", 'f', 25, 4, 5.12);
        Student st5 = new Student("EEE", 'm', 39, 5, 4.92);

        ArrayList<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        students.forEach(System.out::println);
        System.out.println("_____________________________________________________");

        Predicate<Student> predicate = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getAge() > 40;
            }
        };

        Predicate<Student> predicate1 = student -> student.getSex() == 'm';

        checkStudents(students, predicate.negate());

//        checkStudents(students, student -> student.getAvgGrade() < 8);



    }

    static void checkStudents(ArrayList<Student> students, Predicate<Student> pr) {
        for (var st : students) {
            if (pr.test(st)) {
                System.out.println(st);
            }
        }
        System.out.println("_____________________________________________________");
    }
}
