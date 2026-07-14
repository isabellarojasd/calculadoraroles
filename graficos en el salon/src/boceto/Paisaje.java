package boceto;

import javax.swing.*;
import java.awt.*;

public class Paisaje extends JPanel {

    @Override protected void paintComponent (Graphics grafica){
        super.paintComponent(grafica);

        //cielo
        Color miColor = new Color(55, 151, 198);
        grafica.setColor(miColor);
        grafica.fillRect(0,0,800,450);


        //sol
        grafica.setColor(Color.YELLOW);
        grafica.fillOval(630,20,150,150);

        //nube1
        Color nuColor = new Color(152, 209, 218);
        grafica.setColor(nuColor);
        grafica.fillOval(20,20,100,100);
        grafica.fillOval(90,20,100,100);
        grafica.fillOval(150,20,100,100);

        //nube2
        grafica.setColor(nuColor);
        grafica.fillOval(280,20,100,100);
        grafica.fillOval(350,20,100,100);
        grafica.fillOval(410,20,100,100);

        //suelo
        Color sucolor = new Color(52, 158, 41);
        grafica.setColor(sucolor);
        grafica.fillRect(0,300,800,600);

        //casa
        Color hocolor = new Color(197, 51, 3);
        grafica.setColor(hocolor);
        grafica.fillRect(50,270,200,200);
        //puerta
        grafica.setColor(Color.BLACK);
        grafica.fillRect(50,290,190,200);


    }

}
