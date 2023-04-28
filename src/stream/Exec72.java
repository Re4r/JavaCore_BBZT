package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exec72 {
    public static void main(String[] args) {

        ArrayList<EmptyBot> emptyBots = emptyBotFactory(10);

        emptyBots.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");

        List<EmptyBot> filteredBots = emptyBots.stream().filter(eb ->
                eb.getId() > 50 &&
                        eb.getName().length() > 5 &&
                eb.getCode() > 200).toList();

        filteredBots.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");

    }

    private static ArrayList<EmptyBot> emptyBotFactory(int quantity) {
        ArrayList<EmptyBot> list = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            Random r = new Random();
            list.add(new EmptyBot(r.nextInt(100),
                    String.valueOf(r.nextLong(1000000)),
                    r.nextInt(1000)));
        }
        return list;
    }
}

class EmptyBot {
    private int id;
    private String name;
    private int code;

    public EmptyBot(int id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Module > " +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", code: " + code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmptyBot emptyBot)) return false;

        if (getId() != emptyBot.getId()) return false;
        if (getCode() != emptyBot.getCode()) return false;
        return getName().equals(emptyBot.getName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getCode();
        return result;
    }
}