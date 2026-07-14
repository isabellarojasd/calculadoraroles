package tallerGraphic;

import tallerGraphics.PaisajeTaller;

import javax.swing.*;

public class Main extends JFrame {

    public Main() {

        PaisajeTaller taller = new PaisajeTaller();
        add(taller);

        //Titulo
        setTitle("Paisaje Graphic");

        //Tamaño pixeles ancho y alto
        setSize(800, 600);

        //Centre
        setLocationRelativeTo(null);

        //Para cerrar el programa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Mostrar Ventana
        setVisible(true);


    }

    public static void main(String[] args) {

        //Crear ventana
        new Main();

    }

}
