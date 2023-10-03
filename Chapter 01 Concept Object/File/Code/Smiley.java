import java.awt.Color;
import java.awt.Graphics;

public class Smiley {
  // attributes or data
  Color color;
  int x, y;
  int width, height;
  boolean isSad = false;

  // methods/operations/functions
  Smiley() {
    x = y = 50;
    width = height = 25;
  }

  Smiley(int _x, int _y, int w, int h, Color c) {
    x = _x;
    y = _y;
    width = w;
    height = h;
    color = c;

  }

  void sad() {
    isSad = true;
  }

  void draw(Graphics g) {
    g.setColor(Color.black);
    g.drawOval(x, y, width, height);

  }
}
