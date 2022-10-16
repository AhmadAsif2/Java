
public class Generics<T> {
  private T[] items = (T[]) new Object[10];
  private int count;

  public void add(T element) {
    items[count++] = element;
  }

  public T get(int index) {
    return items[index];
  }
}
