package lambda;

import java.util.ArrayList;

public class Exec61 {
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

//        System.out.println("-------------------------------------------------------");
//        students.forEach(System.out::println);
//        System.out.println("-------------------------------------------------------");

//        printStudentsUnderAge(students, 30);
//        System.out.println("-------------------------------------------------------");
//        printStudentsOverGrade(students, 5.0);
//        System.out.println("-------------------------------------------------------");
//        printStudentsMixCondition(students, 25, 9, 'f');
//        System.out.println("-------------------------------------------------------");

//        testStudents(students, new CheckOverGrade());
//        System.out.println("-------------------------------------------------------");
//        testStudents(students, new StudentsChecks() {
//            @Override
//            public boolean check(Student st) {
//                return st.getSex() == 'm';
//            }
//        });
        System.out.println("-------------------------------------------------------");

        testStudents(students, st -> st.getCourse() > 2);

    }

//    static void printStudentsOverGrade(ArrayList<Student> students, double grade) {
//        for (Student st : students) {
//            if (st.getAvgGrade() > grade) {
//                System.out.println(st);
//            }
//        }
//    }
//
//    static void printStudentsUnderAge(ArrayList<Student> students, int age) {
//        for (Student st : students) {
//            if (st.getAge() < age) {
//                System.out.println(st);
//            }
//        }
//    }
//
//    static void printStudentsMixCondition(ArrayList<Student> students, int age, double grade, char sex) {
//        for (Student st : students) {
//            if (st.getAge() > age && st.getAvgGrade() < grade && st.getSex() == sex) {
//                System.out.println(st);
//            }
//        }
//    }

    static void testStudents(ArrayList<Student> students, StudentsChecks ch) {
        for (Student st : students) {
            if (ch.check(st)) {
                System.out.println(st);
            }
        }
        System.out.println("-------------------------------------------------------");
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student: (");
        sb.append("name: '").append(name).append('\'');
        sb.append(", sex: ").append(sex);
        sb.append(", age: ").append(age);
        sb.append(", course: ").append(course);
        sb.append(", avgGrade: ").append(avgGrade);
        sb.append(')');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (getSex() != student.getSex()) return false;
        if (getAge() != student.getAge()) return false;
        if (getCourse() != student.getCourse()) return false;
        if (Double.compare(student.getAvgGrade(), getAvgGrade()) != 0) return false;
        return getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        result = 31 * result + (int) getSex();
        result = 31 * result + getAge();
        result = 31 * result + getCourse();
        temp = Double.doubleToLongBits(getAvgGrade());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

@FunctionalInterface
interface StudentsChecks {
    boolean check(Student st);
}

//class CheckOverGrade implements StudentsChecks {
//    @Override
//    public boolean check(Student st) {
//        return st.getAvgGrade() > 5;
//    }
//}
