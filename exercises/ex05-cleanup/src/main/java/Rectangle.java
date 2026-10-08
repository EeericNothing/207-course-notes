/**
 * A Rectangle.
 *
 * <p>an ordinary rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /** constructor. */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * returns the area.
   *
   * @return the area.
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor the scale at which the rectangle will change by.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * compares 2 rectangles.
   *
   * @param other the other rectangle being compared to.
   * @return True if self is larger than other.
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
