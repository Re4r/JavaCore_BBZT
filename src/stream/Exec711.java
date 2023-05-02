package stream;

import java.util.ArrayList;
import java.util.List;

public class Exec711 {
    public static void main(String[] args) {

    }
}

class Node {
    private int id;
    private double number;

    public Node(int id, double number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public Node setId(int id) {
        this.id = id;
        return this;
    }

    public double getNumber() {
        return number;
    }

    public Node setNumber(double number) {
        this.number = number;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node node)) return false;

        if (getId() != node.getId()) return false;
        return Double.compare(node.getNumber(), getNumber()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        temp = Double.doubleToLongBits(getNumber());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id: " + id +
                ", number: " + number +
                '}';
    }
}

class Pool {
    private String name;
    private List<Node> nodeList;

    public Pool(String name) {
        this.name = name;
        this.nodeList = new ArrayList<>();
    }
}
