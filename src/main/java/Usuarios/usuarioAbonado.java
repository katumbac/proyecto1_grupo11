/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;
import Usuarios.Usuario;
import P_info.Factura;
import Medidores.Medidor;
import Medidores.MedidorAnalogico;
import Medidores.MedidorInteligente;
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
 
    
    public void consultarFactura() {
        
        /** 
         Al ingresar esta opción aparece una lista
         * de las facturas generadas a nombre del abonado 
         * y a continuación se pide el número de la factura
         * a consultar y se muestran los detalles de las facturas */
        System.out.println("Facturas Asociadas");
        System.out.println("Número de Factura         Fecha Emisión       Código Medidor");
        
        for(Factura f: facturas){
            System.out.println("HO");
            System.out.println("\t"+f.getNumeroFactura()+" "+ f.getFechaEmision()+" "+f.getCodigoMedidor());
        }
                
        System.out.print("Ingrese código factura");
        int cod = sc.nextInt();
        
        //mostrar detalles de la factura
        if (facturas.contains(cod)){
            System.out.print(facturas.toString());
        } else {
            System.out.print("Codigo de factura no existente");
        }
    }
    
    public void consultarHistoricoFacturado() {
        
        System.out.println("Medidores Asociados\n");
        System.out.println("Código Medidor         Tipo Medidor       Nombre Del Plan");
        for(Medidor m: medidores){
            if(m instanceof MedidorInteligente){
                System.out.println("      "+m.getCodigo()+"               Inteligente    "+"    "+m.getPlanContratado().getNombre());
            }else if (m instanceof MedidorAnalogico){
                System.out.println("      "+m.getCodigo()+"                Analógico    "+"    "+m.getPlanContratado().getNombre());
            }   
        }
        
        System.out.println("Ingrese el código del medidor a consultar");
        String cod = sc.nextLine().toUpperCase();
        sc.nextLine();
        System.out.println("Consumo de los últimos 3 medidas");
        System.out.println("Número Factura       Nombre del Plan       Código Medidor");
        
    }
    
    public void consultarConsumoHora() {
        
        
        System.out.print("Medidores Inteligentes Asociados");
        System.out.print("Código Medidor         Tipo Medidor       Nombre Del Plan");
        for(Medidor m: medidores){
            if(m instanceof MedidorInteligente){
                System.out.println("      "+m.getCodigo()+"               Inteligente    "+"    "+m.getPlanContratado().getNombre()); 
            }
        }
        
        System.out.print("Ingrese el código del medidor a consultar");
        String cod = sc.nextLine();
   
        System.out.print("Ingrese Fecha Inicio: ");
        String f_ini = sc.nextLine();
        
        System.out.print("Ingrese Fecha Fin: ");
        String f_fin = sc.nextLine();
        
        System.out.print("Hora              Promedio Consumo");
        for(Medidor m: medidores){
            if(m instanceof MedidorInteligente && m.getCodigo().equals(cod)){
                //System.out.println("      "+m.+"               Inteligente    "+"    "+m.getPlanContratado().getNombre()); 
            }
        }
    }
    public String toString(){
        return "Usuario Abonado:\n" + super.toString() + "Cédula: "+cedula+"\n"+"Correo: "+ this.correoElectronico + "\n"+"Medidores: "+ this.medidores+"\n";
    }

}
