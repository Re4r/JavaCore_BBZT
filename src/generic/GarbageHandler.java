package generic;
@FunctionalInterface
public interface GarbageHandler<T, S> {
    void handle(T what, S how);
}
