package lesson4;

public class Exec47 {
    public static void main(String[] args) {

        Citizen citizen1 = new Citizen("AAA", 34);
        Citizen citizen2 = new Citizen("BBB", 45);
        Citizen citizen3 = new Citizen("CCC", 16);
        Citizen citizen4 = new Citizen("DDD", 27);
        Citizen citizen5 = new Citizen("EEE", 58);


    }
}

class Citizen {
    private String name;
    private int course;

    public Citizen(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2 - " +
                "name: '" + name + '\'' +
                ", course: " + course;
    }
}
