package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Exec65 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student st1 = new Student("AAA", 'f', 27, 1, 9.68);
        Student st2 = new Student("BBB", 'f', 35, 2, 7.69);
        Student st3 = new Student("CCC", 'm', 54, 3, 3.54);
        Student st4 = new Student("DDD", 'f', 25, 4, 5.12);
        Student st5 = new Student("EEE", 'm', 39, 5, 4.92);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        double avgAge = avgOfSmth(students, student -> (double) student.getAge());
        System.out.println(avgAge);
        double avgCourse = avgOfSmth(students, student -> (double) student.getCourse());
        System.out.println(avgCourse);
        double avgGrade = avgOfSmth(students, Student::getAvgGrade);
        System.out.println(avgGrade);


        Function<Student, Double> function = student -> student.setAvgGrade(student.getAvgGrade() + 100);
        Function<Student, Integer> function2 = student -> student.setAge(new Random().nextInt());

        students.forEach(function::apply);
        students.forEach(function2::apply);
        System.out.println("--------------------------------------------------------------------------------------");
        students.forEach(System.out::println);
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> function) {
        double result = 0;
        for (var s : list) {
            result += function.apply(s);
        }
        return result / list.size();
    }
}
