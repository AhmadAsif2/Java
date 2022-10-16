
public class Utils {

    // Java generics methods
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0 ? second : first);
    }

    // Multiple genric parameters
    public static <K, V> void print(K key, V value) {
        System.out.println(key + " = " + value);
    }
}