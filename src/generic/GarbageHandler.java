package generic;

public interface GarbageHandler<T extends Garbage, S extends HandleMethod> {
    void handle(T what, S how);
    <E> void transfer(E dangerousWaste);
}
