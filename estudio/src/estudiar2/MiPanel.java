package estudiar2;

import javax.swing.*;
import java.awt.*;

public class MiPanel extends JPanel {

    Cuadrado[]  cuadrados;

    public MiPanel() {
    cuadrados = new Cuadrado[] {
            new Cuadrado(0, 2, Color.BLUE, this),
            new Cuadrado(0,2, Color.black,this ),
           // new Cuadrado(0,2, Color.green, this),
            //new Cuadrado(0,2, Color.yellow, this),

    };
        for (int i = 0; i< cuadrados.length; i++){
            Thread thread = new Thread(cuadrados[i]);
            thread.setDaemon(true);
            thread.start();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i< cuadrados.length; i++){
            g.setColor(cuadrados[i].color);
            g.fillRect(cuadrados[i].x, 50+(i*80),50,50);
            g.drawRect(cuadrados[i].x, 50+(i*80),50,50);
            g.setColor(cuadrados[i].color);
        }
    }
}

