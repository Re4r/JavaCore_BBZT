package lesson4;

import java.util.LinkedList;
import java.util.List;

public class Exec47 {
    public static void main(String[] args) {

        Citizen citizen1 = new Citizen("AAA", 34);
        Citizen citizen2 = new Citizen("BBB", 45);
        Citizen citizen3 = new Citizen("CCC", 16);
        Citizen citizen4 = new Citizen("DDD", 27);
        Citizen citizen5 = new Citizen("EEE", 58);
        Citizen citizen6 = new Citizen("FFF", 43);
        Citizen citizen7 = new Citizen("GGG", 37);

        List<Citizen> citizenList = List.of(citizen1, citizen2, citizen3, citizen4, citizen5);

        LinkedList<Citizen> citizenLinkedList = new LinkedList<>();

        citizenLinkedList.addAll(citizenList);

        showCitizens(citizenLinkedList);
        System.out.println("------------------------------------");

        System.out.println(citizenLinkedList.get(2));
        System.out.println("------------------------------------");

        citizenLinkedList.add(citizen6);
        citizenLinkedList.add(citizen7);

        showCitizens(citizenLinkedList);
        System.out.println("------------------------------------");



    }
    static void showCitizens(List<Citizen> citizens) {
        for (Citizen c : citizens) {
            System.out.println(c);
        }
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
        return "Citizen - " +
                "name: '" + name + '\'' +
                ", course: " + course;
    }
}
