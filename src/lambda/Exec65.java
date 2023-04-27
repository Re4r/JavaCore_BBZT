package lambda;

import java.util.ArrayList;
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


    }
}
