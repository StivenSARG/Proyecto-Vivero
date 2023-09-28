package com.example;

import javax.swing.JOptionPane;

public class registroPlanta {

    private String nombreComun;
    private String nombreCientifico;
    private String tipo;
    private String requerimientos;
    private String cuidadosEspecificos;
    private String eliminarRegistro;

    // Getters para acceder a los campos

    public String getNombreComun() {
        return nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public String getCuidadosEspecificos() {
        return cuidadosEspecificos;
    }

    // Setters para establecer los campos

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }

    public void setCuidadosEspecificos(String cuidadosEspecificos) {
        this.cuidadosEspecificos = cuidadosEspecificos;
    }

    public void registro() {
        // constructor el get y el set

        nombreComun = JOptionPane.showInputDialog("Ingrese el nombre comun de la planta:");
        nombreCientifico = JOptionPane.showInputDialog("Ingrese el nombre Cientifico de la planta:");
        tipo = JOptionPane.showInputDialog("Ingrese el tipo de la planta:");
        requerimientos = JOptionPane.showInputDialog("Ingrese los requerimientos de la de la planta:");
        cuidadosEspecificos = JOptionPane.showInputDialog("Ingrese los cuidados especificos de la planta:");
        JOptionPane.showMessageDialog(null, "El nombre de la panta es:" + nombreComun + "\n" +
                "El nombre cientifico de la panta es:" + nombreCientifico + "\n" + "El tipo de la panta es:" + tipo
                + "\n"
                + "Los requerimientos de la planta son:" + requerimientos + "\n"
                + "Los Cuidados especificos de la planta son:" + "\n" + cuidadosEspecificos
                + "\n" + "se elimino:" + eliminarRegistro);

        JOptionPane.showMessageDialog(null, "El nombre de la panta es:" + nombreComun + "\n" +
                "El nombre cientifico de la panta es:" + nombreCientifico + "\n" + "El tipo de la panta es:" + tipo
                + "\n"
                + "Los requerimientos de la planta son:" + requerimientos + "\n"
                + "Los Cuidados especificos de la planta son:" + "\n" + cuidadosEspecificos);

    }

}
