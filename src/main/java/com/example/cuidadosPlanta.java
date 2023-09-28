package com.example;

import javax.swing.JOptionPane;

public class cuidadosPlanta {
    String fechaRiego;
    String fechaAbonado;
    String fechaTrasplante;
    String eventoRelevante;

    public void seguimientoPlanta() {
        fechaRiego = JOptionPane.showInputDialog("Ingrese la fecha de riego de la planta");
        fechaAbonado = JOptionPane.showInputDialog("Ingrese la fecha de abono");
        fechaTrasplante = JOptionPane.showInputDialog("Ingrese fechas de trasplantes");
        eventoRelevante = JOptionPane.showInputDialog("Ingrese un evevento importante");

        JOptionPane.showMessageDialog(null, "La fecha de riego de la planta es: " + fechaRiego + "\n"
                + "La fecha de abonado es: " + fechaAbonado + "\n" + "La fecha de trasplante es: " + fechaTrasplante
                + "\n" + "El evento importante es" + eventoRelevante);

    }

}
