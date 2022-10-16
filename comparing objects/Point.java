
import java.lang.Object;
import java.util.Objects;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object)
      return true;
    if (!(object instanceof Point))
      return false;

    // Downcasting
    var obj = (Point) object;
    return obj.x == x && obj.y == y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
