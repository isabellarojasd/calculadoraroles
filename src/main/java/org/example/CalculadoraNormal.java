package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Al heredar de JFrame, la clase "CalculadoraNormal" YA ES la ventana en sí misma
public class CalculadoraNormal extends JFrame {

    private JPanel panelCalculadora;
    private JTextField txtPantalla;
    private JButton btnRegresar;

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn0;

    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnMulti;
    private JButton btnDiv;
    private JButton btnIgual;
    private JButton btnBorrar;

    // Variables para realizar las operaciones
    private double num1;
    private double num2;
    private double resultado;
    private String operador = "";

    public CalculadoraNormal() {
        // Configuramos los atributos de la ventana directamente
        setTitle("Calculadora Normal");
        setContentPane(panelCalculadora);

        // DISPOSE_ON_CLOSE evita que se cierre todo el programa si el usuario cierra la calculadora
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 450);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        asignarEventos();
    }

    // Agrega un número al JTextField
    private void agregarNumero(String numero) {
        txtPantalla.setText(txtPantalla.getText() + numero);
    }

    // Guarda el primer número y el operador
    private void guardarOperacion(String signo) {
        if (!txtPantalla.getText().isEmpty()) {
            num1 = Double.parseDouble(txtPantalla.getText());
            operador = signo;
            txtPantalla.setText("");
        }
    }

    private void asignarEventos() {

        // ================= BOTONES NUMÉRICOS =================

        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("0");
            }
        });

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("1");
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("2");
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("3");
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("4");
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("5");
            }
        });

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("6");
            }
        });

        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("7");
            }
        });

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("8");
            }
        });

        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarNumero("9");
            }
        });

        // ================= OPERADORES =================

        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarOperacion("+");
            }
        });

        btnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarOperacion("-");
            }
        });

        btnMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarOperacion("*");
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarOperacion("/");
            }
        });

        // ================= BOTÓN BORRAR =================

        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText("");
                num1 = 0;
                num2 = 0;
                resultado = 0;
                operador = "";
            }
        });

        // ================= BOTÓN IGUAL =================

        btnIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!txtPantalla.getText().isEmpty()) {
                    num2 = Double.parseDouble(txtPantalla.getText());

                    switch (operador) {
                        case "+":
                            resultado = num1 + num2;
                            break;
                        case "-":
                            resultado = num1 - num2;
                            break;
                        case "*":
                            resultado = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
                                txtPantalla.setText("");
                                return;
                            }
                            resultado = num1 / num2;
                            break;
                    }
                    // Mostrar el resultado
                    txtPantalla.setText(String.valueOf(resultado));
                }
            }
        });

        // ================= BOTÓN REGRESAR =================

        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Volvemos a mostrar la ventana de inicio
                Inicio inicio = new Inicio();
                inicio.setVisible(true);

                // Cerramos la ventana actual de la calculadora de forma limpia
                dispose();
            }
        });
    }
}