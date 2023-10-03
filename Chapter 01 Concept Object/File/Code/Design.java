import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Design extends JPanel {
  List<Smiley> smileys = new ArrayList<Smiley>();

  void erase() {
  }

  void draw(Graphics g) {
    for (int i = 0; i < smileys.size(); i++) {
      smileys.get(i).draw(g);
    }
  }

  void ajouterObjet(Smiley smiley) {
    smileys.add(smiley);

  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    draw(g);
  }

}
