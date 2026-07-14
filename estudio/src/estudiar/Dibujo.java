package estudiar;

import javax.swing.*;
import java.awt.*;


public class Dibujo extends JPanel {
    int x = 0;

    public Dibujo() {
        Timer timer = new Timer(30, e -> {
            x += 2;
            if (x > 800) x = -300;
            repaint();
        });
        timer.start();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.GREEN);
        int[] puntosx = {0, 300, 800};
        int[] puntosy = {600, 300, 800};
        int puntos = 3;
        g2.drawPolygon(puntosx, puntosy, puntos);
        g2.fillPolygon(puntosx, puntosy, puntos);

        g2.setColor(Color.YELLOW);
        g2.fillOval(600, 100, 100, 100);

        g2.setColor(Color.BLUE);
        g2.fillOval(100, 100, 100, 100);
        g2.fillOval(170, 100, 100, 100);
        g2.fillOval(240, 100, 100, 100);

        int[] puntosca1x = {500+x, 500+x, 570+x, 570+x};
        int[] puntosca2y = {450,350, 350, 450 };
        int puntosca1 = 4;
        g2.drawPolygon(puntosca1x, puntosca2y, puntosca1);

    }
}
