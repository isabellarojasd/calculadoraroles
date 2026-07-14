package graphics;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    //2. Paso: Hacer u constructor de Main

    public Main() {
        setTitle("Mi primera ventana - Graphics");

        setSize(800, 600);

        setLocationRelativeTo(null);

        //Cerra programa a partir de la mitad
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Paso 3.1 Agregar el panel al Jframe

/**        Panel panel= new Panel();
        add(panel);
*/
//        panel.setBackground(Color.BLACK);


        PanelReloj reloj = new PanelReloj();
        add(reloj);

        reloj.setBackground(Color.BLACK);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}

