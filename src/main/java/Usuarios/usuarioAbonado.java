/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;
import Usuarios.Usuario;
import P_info.Factura;
import Medidores.Medidor;
import P_info.Plan;
import java.util.ArrayList;

/**
 *
 * @author Luis Burgos
 */
public class usuarioAbonado extends Usuario {

    private String nombre;
    private String cedula;
    private String correoElectronico;
    private ArrayList<Medidor> medidores;
    private ArrayList<Factura> facturas;
    
    
    public usuarioAbonado(String nombreUsuario, String cedula, String correoElectronico, ArrayList<Medidor> medidores, ArrayList<Factura> facturas, String nombre, String contrasenia) {
        super(nombreUsuario, contrasenia);
        this.nombre = nombre;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
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
    }
 
    
    public void consultarFactura(String Codigo) {
    }
    
    public void consultarHistoricoFacturado(String Codigo, Plan plan) {
    }
    
    public void consultarConsumoHora(String Codigo) {
    }

}
