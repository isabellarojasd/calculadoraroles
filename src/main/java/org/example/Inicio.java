package org.example;

import javax.swing.*;
import java.awt.event.*;

public class Inicio extends JFrame {

    private JPanel panelPrincipal;
    private JComboBox cbTipoCalculadora;
    private JRadioButton rbEstudiante;
    private JRadioButton rbProfesor;
    private JButton btnIngresar;

    public Inicio() {
        setContentPane(panelPrincipal);
        setTitle("Acceso al Sistema");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        btnIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String seleccion = cbTipoCalculadora.getSelectedItem().toString();

                if (rbEstudiante.isSelected()) {

                    if (seleccion.equals("Calculadora Normal")) {

                        CalculadoraNormal calculadora = new CalculadoraNormal();
                        calculadora.setVisible(true);

                    } else {

                        JOptionPane.showMessageDialog(null,
                                "La calculadora de promedio es solo para profesores.");

                    }

                } else if (rbProfesor.isSelected()) {

                    if (seleccion.equals("Calculadora Normal")) {

                        JOptionPane.showMessageDialog(null,
                                "Los profesores solo usan la calculadora de promedio.");

                    } else {

                        JOptionPane.showMessageDialog(null,
                                "Calculadora de promedio en desarrollo.");

                    }

                } else {

                    JOptionPane.showMessageDialog(null,
                            "Seleccione si es estudiante o profesor.");

                }
            }
        });
    }
}