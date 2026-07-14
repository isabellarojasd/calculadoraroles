package estudiar2;

import javax.swing.*;
import java.awt.*;

public class Cuadrado implements Runnable {
    int x;
    int y;
    int velocidad;
    Color color;
    JPanel  panel;

    public Cuadrado(int x, int velocidad, Color color, JPanel panel) {
        this.x = x;
        this.y = 0;
        this.velocidad = velocidad;
        this.color = color;
        this.panel = panel;
    }

    @Override
    public void run() {
        while (true) {
            x += velocidad;
            if (x>600){
                x = 0;
            }
            try {
                Thread.sleep(30);
            }catch (Exception e){}
            panel.repaint();
    }}
}
