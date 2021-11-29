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
import java.util.Scanner;

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
    Scanner sc  = new Scanner(System.in);
    
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
        
        /** 
         Al ingresar esta opción aparece una lista
         * de las facturas generadas a nombre del abonado 
         * y a continuación se pide el número de la factura
         * a consultar y se muestran los detalles de las facturas */
        System.out.print("Facturas Asociadas");
        System.out.print("Número de Factura         Fecha Emisión       Código Medidor");
        //for(Factura f: ){
        //}
        
        System.out.print("Ingrese código factura");
        int cod = sc.nextInt();
        
        /**mostrar detalles de la factura
         *  System.out.print("Medidor: ");
            System.out.print("Nombre del Plan: ");
            System.out.print("Desde: ");
            System.out.print("Hasta: ");
            System.out.print("Días Facturados: ");
            System.out.print("Lectura Anterior: ");
            System.out.print("Lectural Actual: ");
            System.out.print("Consumo: ");
            System.out.print("Cargo Fijo: ");
            System.out.print("Total a Pagar: ");
         */
    }
    
    public void consultarHistoricoFacturado(String Codigo, Plan plan) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Medidores Asociados");
        System.out.print("Código Medidor         Tipo Medidor       Nombre Del Plan");
        
        
        System.out.print("Ingrese el código del medidor a consultar");
        int cod = sc.nextInt();
        
        System.out.print("Número Factura       Nombre del Plan       Código Medidor");
    }
    
    public void consultarConsumoHora(String Codigo) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Medidores Inteligentes Asociados");
        System.out.print("Código Medidor         Tipo Medidor       Nombre Del Plan");
        
        
        System.out.print("Ingrese el código del medidor a consultar");
        int cod = sc.nextInt();
        
        System.out.print("Ingrese Fecha Inicio: ");
        String f_ini = sc.nextLine();
        
        System.out.print("Ingrese Fecha Fin: ");
        String f_fin = sc.nextLine();
        
        System.out.print("Hora              Promedio Consumo");

    }

}
