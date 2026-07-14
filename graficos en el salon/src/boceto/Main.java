package boceto;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {

        setTitle("El paisajito lindo");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Paisaje paisaje = new Paisaje();
        add(paisaje);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
