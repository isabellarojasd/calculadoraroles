import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class PanelDibujo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Fondo cielo
        g2.setColor(Color.decode("#8BC8E0"));
        g2.fillRect(0, 0, 800, 300);

        // Sol
        g2.setColor(Color.decode("#FFD700"));
        g2.fillOval(500, 20, 80, 80); // centro (540,60) radio 40

        // Nubes blancas (elipses)
        g2.setColor(Color.WHITE);
        int[][] nubes = {
                {270, 110, 55, 28},
                {295, 98, 72, 42},
                {338, 110, 52, 28},
                {630, 88, 52, 26},
                {654, 76, 68, 38},
                {696, 88, 50, 26}
        };
        for (int[] n : nubes) {
            g2.fillOval(n[0], n[1], n[2], n[3]);
        }

        // Colinas verdes (polígonos)
        // Primera colina
        g2.setColor(Color.decode("#6E8C69"));
        Polygon p1 = new Polygon();
        p1.addPoint(560, 300);
        p1.addPoint(650, 185);
        p1.addPoint(740, 245);
        p1.addPoint(800, 215);
        p1.addPoint(800, 300);
        g2.fillPolygon(p1);

        // Segunda colina
        g2.setColor(Color.decode("#8AA685"));
        Polygon p2 = new Polygon();
        p2.addPoint(648, 300);
        p2.addPoint(748, 228);
        p2.addPoint(800, 262);
        p2.addPoint(800, 300);
        g2.fillPolygon(p2);

        // Reflejo blanco en colina
        g2.setColor(Color.WHITE);
        Polygon p3 = new Polygon();
        p3.addPoint(646, 185);
        p3.addPoint(658, 210);
        p3.addPoint(670, 197);
        g2.fillPolygon(p3);

        // Césped
        g2.setColor(Color.decode("#69B95F"));
        g2.fillRect(0, 300, 800, 300);

        // EDIFICIO CAFE
        // Cuerpo principal
        g2.setColor(Color.decode("#C38040"));
        g2.fillRect(118, 178, 55, 160);
        // Lado derecho
        g2.setColor(Color.decode("#8C501C"));
        Polygon pc1 = new Polygon();
        pc1.addPoint(173, 178);
        pc1.addPoint(181, 173);
        pc1.addPoint(181, 338);
        pc1.addPoint(173, 338);
        g2.fillPolygon(pc1);
        // Techo
        g2.setColor(Color.decode("#A86830"));
        Polygon pc2 = new Polygon();
        pc2.addPoint(118, 178);
        pc2.addPoint(173, 178);
        pc2.addPoint(181, 173);
        pc2.addPoint(126, 173);
        g2.fillPolygon(pc2);
        // Ventanas
        g2.setColor(Color.decode("#FCEAA5"));
        int[][] ventanasCafe = {
                {124,190,13,11}, {143,190,13,11},
                {124,210,13,11}, {143,210,13,11},
                {124,230,13,11}, {143,230,13,11},
                {124,250,13,11}, {143,250,13,11},
                {124,270,13,11}, {143,270,13,11},
                {124,290,13,11}, {143,290,13,11},
                {124,310,13,11}, {143,310,13,11}
        };
        for (int[] v : ventanasCafe) {
            g2.fillRect(v[0], v[1], v[2], v[3]);
        }

        // EDIFICIO AZUL
        // Cuerpo principal
        g2.setColor(Color.decode("#6482B4"));
        g2.fillRect(-20, 140, 120, 270);
        // Lado derecho
        g2.setColor(Color.decode("#3C5582"));
        Polygon pa1 = new Polygon();
        pa1.addPoint(100, 140);
        pa1.addPoint(116, 130);
        pa1.addPoint(116, 410);
        pa1.addPoint(100, 410);
        g2.fillPolygon(pa1);
        // Techo
        g2.setColor(Color.decode("#4E6C9E"));
        Polygon pa2 = new Polygon();
        pa2.addPoint(-20, 140);
        pa2.addPoint(100, 140);
        pa2.addPoint(116, 130);
        pa2.addPoint(-4, 130);
        g2.fillPolygon(pa2);
        // Ventanas
        g2.setColor(Color.decode("#C3DEFF"));
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 3; c++) {
                g2.fillRect(-10 + c * 36, 154 + r * 28, 20, 16);
            }
        }

        // CARRETERA
        // Base triangular
        g2.setColor(Color.decode("#414141"));
        Polygon road = new Polygon();
        road.addPoint(0, 600);
        road.addPoint(500, 300);
        road.addPoint(800, 600);
        g2.fillPolygon(road);
        // Líneas blancas (stroke 2)
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(500, 300, 0, 600);
        g2.drawLine(500, 300, 800, 600);
        // Rectángulos blancos (dashes)
        g2.setStroke(new BasicStroke(1)); // reset para rectángulos
        int[][] dash = {
                {498,308,4,18}, {496,338,8,24}, {493,374,14,32},
                {488,420,24,42}, {480,478,40,52}, {465,548,70,48}
        };
        for (int[] d : dash) {
            g2.fillRect(d[0], d[1], d[2], d[3]);
        }

        // ÁRBOLES IZQUIERDA
        int[][] arbolesIzq = {{430,44}, {355,58}, {270,74}, {168,92}};
        for (int[] a : arbolesIzq) {
            int tx = a[0];
            int cr = a[1];
            int tw = Math.max(6, cr / 4);
            // Tronco
            g2.setColor(Color.decode("#643E1E"));
            g2.fillRect(tx - tw / 2, 300, tw, (int)(cr * 0.9));
            // Copa
            g2.setColor(Color.decode("#1E9B1E"));
            int radio = cr / 2;
            g2.fillOval(tx - radio, 300 - (int)(cr * 0.42) - radio, radio * 2, radio * 2);
        }

        // ÁRBOLES DERECHA
        int[][] arbolesDer = {{570,44}, {635,58}, {700,74}, {762,92}};
        for (int[] a : arbolesDer) {
            int tx = a[0];
            int cr = a[1];
            int tw = Math.max(6, cr / 4);
            g2.setColor(Color.decode("#643E1E"));
            g2.fillRect(tx - tw / 2, 300, tw, (int)(cr * 0.9));
            g2.setColor(Color.decode("#1E9B1E"));
            int radio = cr / 2;
            g2.fillOval(tx - radio, 300 - (int)(cr * 0.42) - radio, radio * 2, radio * 2);
        }

        // CARRO
        // Carrocería roja
        g2.setColor(Color.RED);
        g2.fillRect(300, 450, 80, 40);
        // Techo rojo
        Polygon techo = new Polygon();
        techo.addPoint(312, 450);
        techo.addPoint(322, 428);
        techo.addPoint(368, 428);
        techo.addPoint(378, 450);
        g2.fillPolygon(techo);
        // Ventanas azules
        g2.setColor(Color.decode("#B4DAFF"));
        Polygon ventana1 = new Polygon();
        ventana1.addPoint(355, 430);
        ventana1.addPoint(376, 430);
        ventana1.addPoint(378, 450);
        ventana1.addPoint(358, 450);
        g2.fillPolygon(ventana1);
        Polygon ventana2 = new Polygon();
        ventana2.addPoint(312, 450);
        ventana2.addPoint(327, 450);
        ventana2.addPoint(324, 430);
        ventana2.addPoint(312, 431);
        g2.fillPolygon(ventana2);
        // Faros
        g2.setColor(Color.decode("#FFFF88"));
        g2.fillRect(377, 455, 10, 7);
        g2.setColor(Color.decode("#FF3030"));
        g2.fillRect(293, 455, 9, 7);
        // Ruedas negras
        g2.setColor(Color.BLACK);
        g2.fillOval(308, 481, 26, 26);  // centro (321,494) radio 13
        g2.fillOval(354, 481, 26, 26);  // centro (367,494)
        // Ruedas interiores grises
        g2.setColor(Color.LIGHT_GRAY);
        g2.fillOval(315, 488, 12, 12);  // centro (321,494) radio 6
        g2.fillOval(361, 488, 12, 12);  // centro (367,494)
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }
}