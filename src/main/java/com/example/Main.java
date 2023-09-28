package com.example;

import javax.swing.JOptionPane;
import com.example.registroPlanta;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;

        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "Menu Vivero\n"
                            + "1.Registro nueva planta\n"
                            + "2.Planta\n"
                            + "3.Registro cliente\n"
                            + "4.Cliente\n"
                            + "5.Salir\n"
                            + "ELIJA SU OPCION"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Registrar nueva planta");
                    registroPlanta ver = new registroPlanta();
                    ver.registro();
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Planta");
                    cuidadosPlanta ver2 = new cuidadosPlanta();
                    ver2.seguimientoPlanta();

                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Registrar nuevo cliente");
                    registroCliente imprimir = new registroCliente();
                    imprimir.registro();
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Cliente");
                    break;

                case 5:
                    opcion = 4;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;

            }
        } while (opcion != 5);

    }
}
