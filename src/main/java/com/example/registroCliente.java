package com.example;

import javax.swing.JOptionPane;

public class registroCliente {

    private String nombre;
    private String documento;
    private String correo;
    private String celular;
    private String preferencias;

    // Getters para acceder a los campos
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }

    public String getPreferencias() {
        return preferencias;
    }

    // Setters para establecer los campos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public void registro() {

        nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        documento = JOptionPane.showInputDialog("Ingrese el documento del cliente:");
        correo = JOptionPane.showInputDialog("Ingrese el correo del cliente:");
        celular = JOptionPane.showInputDialog("Ingrese el celular del cliente:");
        preferencias = JOptionPane.showInputDialog("Ingrese las preferencias del cliente:");

        JOptionPane.showMessageDialog(null, "El nombre del cliente es:" + nombre + "\n" +
                "El documento del cliente es:" + documento + "\n" + "El correo del cliente es:" + correo + "\n" +
                "El celular del cliente es:" + celular + "\n" + "Las preferencias del cliente son:" + preferencias);
    }

}
