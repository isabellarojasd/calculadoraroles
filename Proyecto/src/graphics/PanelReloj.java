package graphics;

import javax.swing.*;
import java.awt.*;

public class PanelReloj extends JPanel {

    int segundos = 0;
    Timer timer;
    String texto = "El contador ha llegado a 10s.";
    boolean ten = false;


    @Override protected void paintComponent (Graphics grafica) {
        super.paintComponent(grafica);

        grafica.setColor(Color.GREEN);

        grafica.drawString("Tiempo del contador " + segundos, 100, 100);

        if(ten){

            grafica.setColor(Color.RED);
            grafica.drawString(texto, 20, 20);

        }

    }

    public PanelReloj(){

        timer = new Timer(1000, e ->{

            segundos ++;

            if (segundos == 10){

                ten = true;

                timer.stop();

            }


            repaint();

    });

        timer.start();

}}