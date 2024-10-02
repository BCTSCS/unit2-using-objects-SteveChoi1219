import greenfoot.*;
public class Rectangle extends Actor {
  private int width;
  private int height;
  public Rectangle(int w, int h) {
    width = w;
    height = h;
    getImage().scale(width*10, height*10);
  }
  public Rectangle(int size) {
    width = size;
    height = size;
    getImage().scale(width*10, height*10);
  }
  public Rectangle() {
    getImage().scale(width*10, height*10);
  }
  public static void main(String args[]) {
    Rectangle r = null;
    System.out.println(r);
    r = new Rectangle(12, 10);
    System.out.println(r);
  }
  public String toString() {
      return "Rectangle" + System.identityHashCode(this) + "width " +width+ " height " + height;

  }
 }
