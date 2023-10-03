import java.awt.Color;

import javax.swing.*;

public class AnimatedSmiley {
  public static void main(String[] args) {
    Window window = new Window();
    window.setTitle("Animated Smiley");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(300, 300);
    Design design = new Design();
    window.setContentPane(design);
    window.afficher();
    Smiley smiley1 = new Smiley();
    Smiley smiley2 = new Smiley(150, 50, 100, 100, Color.white);
    design.ajouterObjet(smiley1);
    design.ajouterObjet(smiley2);
    design.ajouterObjet(new Smiley(250, 150, 50, 100, Color.white));
    design.draw(null);
  }
}

class Window extends JFrame {
  void afficher() {
    setVisible(true);
  }
}
