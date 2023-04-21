package map;

public class Exec414 {
    public static void main(String[] args) {

    }
}

class Cobalt {
    private int id;
    private int source;
    private double code;

    public Cobalt(int id, int source, double code) {
        this.id = id;
        this.source = source;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public int getSource() {
        return source;
    }

    public double getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Cobalt - " +
                "id: " + id +
                ", source: " + source +
                ", code: " + code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cobalt cobalt)) return false;

        if (getId() != cobalt.getId()) return false;
        if (getSource() != cobalt.getSource()) return false;
        return Double.compare(cobalt.getCode(), getCode()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + getSource();
        temp = Double.doubleToLongBits(getCode());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
