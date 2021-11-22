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
    private String cedula;
    private String correoElectronico;
    ArrayList<Medidor> Medidores= new ArrayList<Medidor>();
    
    public usuarioAbonado(String nombre, String contrasenia,String cedula, String correoElectronico) {
      super(nombre,contrasenia);
      this.cedula=cedula;
      this.correoElectronico=correoElectronico;
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
