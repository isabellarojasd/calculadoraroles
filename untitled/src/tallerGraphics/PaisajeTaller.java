package tallerGraphics;

import javax.swing.*;
import java.awt.*;

public class PaisajeTaller extends JPanel {

    int segundos = 0;

    Timer timer;

    boolean show = false;

    Image wait = new ImageIcon("src/tallerGraphic/wait.png").getImage();

    @Override
    protected void paintComponent(Graphics grafica) {
        super.paintComponent(grafica);

        Font fuente = new Font(Font.MONOSPACED, Font.BOLD, 30);

        grafica.setFont(fuente);

        grafica.setColor(Color.BLACK);

        grafica.drawImage(wait, 0, 0, 800, 600, this);

        grafica.drawString(segundos + "s / 10s", 350, 50);

        if (show) {

            //Atardecer
            Color c1 = new Color(45, 30, 90);    // Morado oscuro
            Color c2 = new Color(70, 40, 110);   // Morado
            Color c3 = new Color(110, 50, 120);  // Morado rojizo
            Color c4 = new Color(150, 60, 120);  // Rosa oscuro
            Color c5 = new Color(190, 70, 110);  // Rojo rosado
            Color c6 = new Color(220, 90, 90);   // Rojo naranja
            Color c7 = new Color(240, 120, 70);  // Naranja fuerte
            Color c8 = new Color(255, 150, 80);  // Naranja claro
            Color c9 = new Color(255, 180, 100); // Naranja amarillo
            Color c10 = new Color(255, 210, 140);// Amarillo suave

            grafica.setColor(c1);
            grafica.fillRect(0, 0, 800, 30);
            grafica.setColor(c2);
            grafica.fillRect(0, 30, 800, 30);
            grafica.setColor(c3);
            grafica.fillRect(0, 60, 800, 30);
            grafica.setColor(c4);
            grafica.fillRect(0, 90, 800, 30);
            grafica.setColor(c5);
            grafica.fillRect(0, 120, 800, 30);
            grafica.setColor(c6);
            grafica.fillRect(0, 150, 800, 30);
            grafica.setColor(c7);
            grafica.fillRect(0, 180, 800, 30);
            grafica.setColor(c8);
            grafica.fillRect(0, 210, 800, 30);
            grafica.setColor(c9);
            grafica.fillRect(0, 240, 800, 30);
            grafica.setColor(c10);
            grafica.fillRect(0, 270, 800, 30);

            /// //////////////////////////////////////////////////////


            /// //////////////////////////////////////////////////////


            //Sol
            Color sol = new Color(255, 220, 100);
            grafica.setColor(sol);
            grafica.fillOval(420, 260, 120, 80);

            grafica.setColor(Color.BLACK);
            grafica.drawOval(420, 260, 120, 80);

            //Rayos de sol
            grafica.setColor(sol);

            grafica.drawLine(350, 280, 400, 280);

            grafica.drawLine(390, 210, 420, 260);

            grafica.drawLine(440, 200, 450, 250);

            grafica.drawLine(490, 200, 480, 250);

            grafica.drawLine(530, 200, 510, 250);


            /// //////////////////////////////////////////////////////

            //Cesped
            Color cesped = new Color(61, 151, 61);
            grafica.setColor(cesped);
            grafica.fillRect(0, 300, 800, 300);

            /// //////////////////////////////////////////////////////

            //Edificio Rojo

            Color profundidad = new Color(96, 50, 50);

            Color edificio1 = new Color(159, 54, 54);
            grafica.setColor(edificio1);
            grafica.fillRect(0, 140, 90, 200);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(0, 140, 90, 200);

            grafica.setColor(profundidad);
            grafica.fillPolygon(new int[]{0, 100, 90, 0}, new int[]{130, 130, 140, 140}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{0, 100, 90, 0}, new int[]{130, 130, 140, 140}, 4);

            grafica.setColor(profundidad);
            grafica.fillPolygon(new int[]{90, 100, 100, 90}, new int[]{140, 130, 320, 340}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{90, 100, 100, 90}, new int[]{140, 130, 320, 340}, 4);

            //Ventanas edificio 1
            grafica.setColor(profundidad);
            grafica.fillRect(0, 150, 30, 30);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(0, 150, 30, 30);

            grafica.setColor(profundidad);
            grafica.fillRect(50, 150, 30, 30);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(50, 150, 30, 30);

            grafica.setColor(profundidad);
            grafica.fillRect(0, 190, 30, 30);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(0, 190, 30, 30);

            grafica.setColor(profundidad);
            grafica.fillRect(50, 190, 30, 30);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(50, 190, 30, 30);

            grafica.setColor(profundidad);
            grafica.fillRect(50, 230, 30, 30);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(50, 230, 30, 30);

            grafica.setColor(profundidad);
            grafica.fillRect(50, 230, 30, 30);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(50, 230, 30, 30);

            grafica.setColor(profundidad);
            grafica.fillRect(0, 230, 30, 30);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(0, 230, 30, 30);

            grafica.setColor(profundidad);
            grafica.fillRect(0, 230, 30, 30);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(0, 230, 30, 30);

            //Puerta
            grafica.setColor(profundidad);
            grafica.fillRect(27, 300, 30, 40);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(27, 300, 30, 40);


            /// //////////////////////////////////////////////////////

            //Edificio azul
            Color edificio2 = new Color(166, 225, 213);
            grafica.setColor(edificio2);
            grafica.fillRect(95, 180, 80, 150);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(95, 180, 80, 150);

            Color techo2 = new Color(72, 170, 155);
            grafica.setColor(techo2);
            grafica.fillPolygon(new int[]{95, 105, 185, 175}, new int[]{180, 170, 170, 180}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{95, 105, 185, 175}, new int[]{180, 170, 170, 180}, 4);

            grafica.setColor(techo2);
            grafica.fillPolygon(new int[]{175, 185, 185, 175}, new int[]{180, 170, 320, 330}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{175, 185, 185, 175}, new int[]{180, 170, 320, 330}, 4);

            //Ventanales

            grafica.setColor(techo2);
            grafica.fillRect(105, 200, 20, 20);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(105, 200, 20, 20);

            grafica.setColor(techo2);
            grafica.fillRect(140, 200, 20, 20);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(140, 200, 20, 20);

            grafica.setColor(techo2);
            grafica.fillRect(105, 230, 20, 20);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(105, 230, 20, 20);

            grafica.setColor(techo2);
            grafica.fillRect(140, 230, 20, 20);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(140, 230, 20, 20);

            grafica.setColor(techo2);
            grafica.fillRect(105, 260, 20, 20);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(105, 260, 20, 20);

            grafica.setColor(techo2);
            grafica.fillRect(140, 260, 20, 20);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(140, 260, 20, 20);

            //Puerta
            grafica.setColor(techo2);
            grafica.fillRect(120, 290, 30, 40);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(120, 290, 30, 40);

            /// //////////////////////////////////////////////////////

            //Edificio blanco
            grafica.setColor(Color.WHITE);
            grafica.fillRect(180, 200, 70, 120);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(180, 200, 70, 120);

            Color techo3 = new Color(200, 195, 195);
            grafica.setColor(techo3);
            grafica.fillPolygon(new int[]{180, 190, 260, 250}, new int[]{200, 190, 190, 200}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{180, 190, 260, 250}, new int[]{200, 190, 190, 200}, 4);

            grafica.setColor(techo3);
            grafica.fillPolygon(new int[]{250, 260, 260, 250}, new int[]{200, 190, 310, 320}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{250, 260, 260, 250}, new int[]{200, 190, 310, 320}, 4);

            //Ventanales
            grafica.setColor(techo3);
            grafica.fillRect(190, 220, 20, 20);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(190, 220, 20, 20);

            grafica.setColor(techo3);
            grafica.fillRect(220, 220, 20, 20);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(220, 220, 20, 20);

            grafica.setColor(techo3);
            grafica.fillRect(190, 250, 20, 20);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(190, 250, 20, 20);

            grafica.setColor(techo3);
            grafica.fillRect(220, 250, 20, 20);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(220, 250, 20, 20);

            //Puerta
            grafica.setColor(techo3);
            grafica.fillRect(200, 280, 30, 40);
            grafica.setColor(Color.BLACK);
            grafica.drawRect(200, 280, 30, 40);

            /// //////////////////////////////////////////////////////

            //Carretera
            Color carretera = new Color(119, 119, 119);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{0, 460, 500, 800}, new int[]{600, 300, 300, 600}, 4);
            grafica.setColor(carretera);
            grafica.fillPolygon(new int[]{0, 460, 500, 800}, new int[]{600, 300, 300, 600}, 4);

            /// //////////////////////////////////////////////////////

            //Separación de carriles
            grafica.setColor(Color.WHITE);
            grafica.fillPolygon(new int[]{475, 488, 485, 465}, new int[]{305, 305, 330, 330}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{475, 488, 485, 465}, new int[]{305, 305, 330, 330}, 4);

            grafica.setColor(Color.WHITE);
            grafica.fillPolygon(new int[]{460, 488, 485, 450}, new int[]{340, 340, 370, 370}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{460, 488, 485, 450}, new int[]{340, 340, 370, 370}, 4);

            grafica.setColor(Color.WHITE);
            grafica.fillPolygon(new int[]{440, 485, 480, 420}, new int[]{390, 390, 450, 450}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{440, 485, 480, 420}, new int[]{390, 390, 450, 450}, 4);

            grafica.setColor(Color.WHITE);
            grafica.fillPolygon(new int[]{410, 485, 480, 370}, new int[]{480, 480, 600, 600}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{410, 485, 480, 370}, new int[]{480, 480, 600, 600}, 4);

            /// //////////////////////////////////////////////////////

            //Árboles Izquierda

            Color arboles = new Color(34, 62, 34);
            Color tallo = new Color(112, 45, 45);

            grafica.setColor(tallo);
            grafica.fillPolygon(new int[]{315, 335, 335, 340, 310, 315}, new int[]{350, 350, 360, 365, 365, 360}, 6);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{315, 335, 335, 340, 310, 315}, new int[]{350, 350, 360, 365, 365, 360}, 6);

            grafica.setColor(arboles);
            grafica.fillOval(300, 310, 50, 50);
            grafica.setColor(Color.BLACK);
            grafica.drawOval(300, 310, 50, 50);

            grafica.setColor(tallo);
            grafica.fillPolygon(new int[]{215, 235, 235, 240, 210, 215}, new int[]{410, 410, 420, 425, 425, 420}, 6);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{215, 235, 235, 240, 210, 215}, new int[]{410, 410, 420, 425, 425, 420}, 6);

            grafica.setColor(arboles);
            grafica.fillOval(195, 355, 60, 60);
            grafica.setColor(Color.BLACK);
            grafica.drawOval(195, 355, 60, 60);

            grafica.setColor(tallo);
            grafica.fillPolygon(new int[]{115, 125, 125, 130, 110, 115}, new int[]{480, 480, 490, 495, 495, 490}, 6);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{115, 125, 125, 130, 110, 115}, new int[]{480, 480, 490, 495, 495, 490}, 6);

            grafica.setColor(arboles);
            grafica.fillOval(90, 400, 60, 80);
            grafica.setColor(Color.BLACK);
            grafica.drawOval(90, 400, 60, 80);


            /// //////////////////////////////////////////////////////

            //Árboles derecha

            grafica.setColor(tallo);
            grafica.fillPolygon(new int[]{615, 635, 635, 640, 610, 615}, new int[]{350, 350, 360, 365, 365, 360}, 6);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{615, 635, 635, 640, 610, 615}, new int[]{350, 350, 360, 365, 365, 360}, 6);

            grafica.setColor(arboles);
            grafica.fillOval(600, 310, 50, 50);
            grafica.setColor(Color.BLACK);
            grafica.drawOval(600, 310, 50, 50);

            grafica.setColor(tallo);
            grafica.fillPolygon(new int[]{660, 690, 690, 695, 655, 660}, new int[]{400, 400, 405, 415, 415, 410}, 6);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{660, 690, 690, 695, 655, 660}, new int[]{400, 400, 405, 415, 415, 410}, 6);

            grafica.setColor(arboles);
            grafica.fillOval(645, 345, 60, 60);
            grafica.setColor(Color.BLACK);
            grafica.drawOval(645, 345, 60, 60);

            grafica.setColor(tallo);
            grafica.fillPolygon(new int[]{720, 735, 735, 740, 715, 720}, new int[]{450, 450, 470, 475, 475, 470}, 6);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{720, 735, 735, 740, 715, 720}, new int[]{450, 450, 470, 475, 475, 470}, 6);

            grafica.setColor(arboles);
            grafica.fillOval(700, 400, 55, 65);
            grafica.setColor(Color.BLACK);
            grafica.drawOval(700, 400, 55, 65);


            /// //////////////////////////////////////////////////////

            //Montaña Atrás 4

            grafica.setColor(arboles);
            grafica.fillPolygon(new int[]{650, 780, 800, 800}, new int[]{300, 50, 50, 300}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{650, 780, 800, 800}, new int[]{300, 50, 50, 300}, 4);

            /// //////////////////////////////////////////////////////

            //Montaña Atrás 3

            grafica.setColor(arboles);
            grafica.fillPolygon(new int[]{580, 700, 705, 820}, new int[]{300, 100, 100, 300}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{580, 700, 705, 820}, new int[]{300, 100, 100, 300}, 4);

            /// //////////////////////////////////////////////////////

            //Montaña Atrás

            grafica.setColor(arboles);
            grafica.fillPolygon(new int[]{610, 670, 675, 750}, new int[]{300, 210, 210, 300}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{610, 670, 675, 750}, new int[]{300, 210, 210, 300}, 4);

            /// //////////////////////////////////////////////////////
            //Montaña Atrás 2

            grafica.setColor(arboles);
            grafica.fillPolygon(new int[]{700, 760, 765, 850}, new int[]{300, 150, 150, 300}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{700, 760, 765, 850}, new int[]{300, 150, 150, 300}, 4);

            /// //////////////////////////////////////////////////////

            //Montaña 1

            grafica.setColor(arboles);
            grafica.fillPolygon(new int[]{500, 600, 605, 700}, new int[]{300, 200, 200, 300}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{500, 600, 605, 700}, new int[]{300, 200, 200, 300}, 4);

            /// //////////////////////////////////////////////////////

            //Montaña 2
            grafica.setColor(arboles);
            grafica.fillPolygon(new int[]{650, 730, 735, 810}, new int[]{300, 180, 180, 300}, 4);
            grafica.setColor(Color.BLACK);
            grafica.drawPolygon(new int[]{650, 730, 735, 810}, new int[]{300, 180, 180, 300}, 4);

            /// //////////////////////////////////////////////////////

            /// //////////////////////////////////////////////////////
            /// //////////////////////////////////////////////////////
            /// //////////////////////////////////////////////////////


        }

    }

    public PaisajeTaller() {

        //Cada 1000ms = 1seg
        timer = new Timer(1000, e -> {

            //Va sumando segundo a segundo
            segundos++;

            if (segundos == 10) {

                show = true;

                timer.stop();

            }

            //Redibuja el valor del contador
            repaint();

        });

        //Inicializa el timer
        timer.start();

    }

}