import estudiar.Dibujo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame(" Mi paisaje");
        Dibujo panelDibujo = new Dibujo();

        ventana.add(panelDibujo);
        ventana.setSize(800,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

}
