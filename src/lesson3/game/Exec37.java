package lesson3.game;

public class Exec37 {
    public static void main(String[] args) {

        Scholar scholar1 = new Scholar("Qawer", 12);
        Scholar scholar2 = new Scholar("Yrtew", 13);

        Student student1 = new Student("Ubrter", 22);
        Student student2 = new Student("Opqazsd", 19);

        Employee employee1 = new Employee("Meryb", 35);
        Employee employee2 = new Employee("Hertop", 28);

        Team<Scholar> schoolars = new Team("Dragons");
        Team<Student> students = new Team("Robots");
        Team<Employee> employees = new Team("Fishes");

        schoolars.newAddPlayer(scholar1);
        schoolars.newAddPlayer(scholar2);

        students.newAddPlayer(student1);
        students.newAddPlayer(student2);

        employees.newAddPlayer(employee1);
        employees.newAddPlayer(employee2);





    }
}
