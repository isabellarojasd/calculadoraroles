package hilos.ejercicio1;

import javax.swing.*;
import java.awt.*;

public class VentanaCarga extends JPanel {

    private ProcesoCarga barracarga1;
    private ProcesoCarga barracarga2;
    private ProcesoCarga barracarga3;

    public VentanaCarga() {
        barracarga1 = new ProcesoCarga(()-> repaint());
        barracarga2 = new ProcesoCarga(()-> repaint());
        barracarga3 = new ProcesoCarga(()-> repaint());

        new Thread(barracarga1).start();
        new Thread(barracarga2).start();
        new Thread(barracarga3).start();
    }

    @Override
    protected void paintComponent(Graphics graficador){
        super.paintComponent(graficador);

        //Para dibujar las barras de carga
        graficador.setColor(Color.RED);
        graficador.fillRect(50,0, barracarga1.getProgreso()*2,50);
        graficador.setColor(Color.GREEN);
        graficador.fillRect(50,50, barracarga2.getProgreso()*2,50);
        graficador.setColor(Color.BLUE);
        graficador.fillRect(50,100, barracarga2.getProgreso()*2,50);
       // graficador.drawString("");
        

    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("VentanaCarga");
        ventana.add(new VentanaCarga());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400,250);
        ventana.setVisible(true);
    }
}
