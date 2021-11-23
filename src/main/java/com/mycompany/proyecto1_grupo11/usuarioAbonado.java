/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_grupo11;
import java.util.ArrayList;

/**
 *
 * @author Luis Burgos
 */
public class usuarioAbonado extends Usuario {
<<<<<<< HEAD
=======
    private String nombre;
>>>>>>> 868896194818f810e22b94534865dadb9cc3d742
    private String cedula;
    private String correoElectronico;
    private ArrayList<Medidor> medidores;
    private ArrayList<Factura> facturas;
    
<<<<<<< HEAD
    public usuarioAbonado(String nombre, String contrasenia,String cedula, String correoElectronico) {
      super(nombre,contrasenia);
      this.cedula=cedula;
      this.correoElectronico=correoElectronico;
=======
    public usuarioAbonado(String nombreUsuario, String contrasenia, String nombre, String cedula, String Correo, ArrayList<Medidor> medidores,        ArrayList<Factura> facturas) {
    super(nombreUsuario, contrasenia);
    this.cedula = cedula;
    this.correoElectronico = Correo;
    this.medidores = medidores;
    this.facturas = facturas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<Medidor> getMedidores() {
        return medidores;
    }

    public void setMedidores(ArrayList<Medidor> medidores) {
        this.medidores = medidores;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
>>>>>>> 868896194818f810e22b94534865dadb9cc3d742
    }
 
    
    
    public void consultarFactura(String Codigo) {
    }
    
    public void consultarHistoricoFacturado(String Codigo, Plan plan) {
    }
    
    public void consultarConsumoHora(String Codigo) {
    }
    
    public String getCedula() {
      return cedula;
      }
}
