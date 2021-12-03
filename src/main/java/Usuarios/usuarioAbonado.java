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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
    
    public usuarioAbonado(String nombre, String cedula, String correoElectronico, ArrayList<Medidor> medidores, ArrayList<Factura> facturas, String nombreUsuario, String contrasenia) {
        super(nombreUsuario, contrasenia);
        this.nombre = nombre;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        this.medidores = medidores;
        this.facturas = facturas;
    }
      
    public String getNombreAbonado(){
        return nombre;
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
        Scanner sc = new Scanner(System.in);
        int m=0;
        /** 
         Al ingresar esta opción aparece una lista
         * de las facturas generadas a nombre del abonado 
         * y a continuación se pide el número de la factura
         * a consultar y se muestran los detalles de las facturas */
        System.out.println("Facturas Asociadas");
        System.out.println("Número de Factura         Fecha Emisión       Código Medidor");
        
        for(Factura f: facturas){
            System.out.println("HO");
            System.out.println("\t"+f.getNumeroFactura()+"           "+ f.getFechaEmision()+"             "+f.getCodigoMedidor());
        }
        System.out.println("Ingrese número de factura: ");
        int cod = sc.nextInt();
        sc.nextLine();
        //mostrar detalles de la factura
        for (Factura f:facturas) {
            if (f.getNumeroFactura()==cod) {
                System.out.println(f.toString());
                m=1;
            }
        }
        
        if (m==0) {
            System.out.println("La factura no está ingresada.");
        }
    }
    
    public void consultarHistoricoFacturado() {
        int n=0;
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
        
        System.out.println("Consumo de los últimos 3 medidas");
        System.out.println("Número Factura       Kwh consumidos       Total a pagar");
        for (Factura f:facturas) {
            if (f.getCodigoMedidor().equals(cod)) {
                if (n<3){
                    System.out.println("       "+f.getNumeroFactura()+"                          "+f.getConsumo()+"                                             "+f.getTotalPagar());
                }
                n++;
            }
        }
    }
    
    public void consultarConsumoHora() {
        
        
        System.out.println("Medidores Inteligentes Asociados");
        System.out.println("Código Medidor         Tipo Medidor       Nombre Del Plan");
        
        for(Medidor m: medidores){
            if(m instanceof MedidorInteligente){
                System.out.println(m.getCodigo()+"                  Inteligente    "+"        "+m.getPlanContratado().getNombre()); 
            }
        }
        
        System.out.println("Ingrese el código del medidor a consultar");
        String cod = sc.nextLine();
   
        System.out.println("Ingrese Fecha Inicio: ");
        String f_ini = sc.nextLine();
        
        
        System.out.println("Ingrese Fecha Fin: ");
        String f_fin = sc.nextLine();
        
        System.out.println("Hora              Promedio Consumo");
        for(Medidor m: medidores){
            if(m instanceof MedidorInteligente && m.getCodigo().equals(cod)){
                for  (LocalDateTime date = LocalDateTime.parse(f_ini+"T00:00:00") ; date.isBefore(LocalDateTime.parse(f_fin+"T00:00:00")) ; date = date.plusMinutes(60) ) {
                        Double aleatorio=Math.random()*100;
                        int com=aleatorio.intValue();
                        System.out.println(date.getHour()+":00"+" - " +date.getHour()+":"+date.minusMinutes(1).getMinute()+"              "+com);
                }
            }
        }
    }
        
    
    public String toString(){
        return "Usuario Abonado:\n" + super.toString() + "Cédula: "+cedula+"\n"+"Correo: "+ this.correoElectronico + "\n"+"Medidores: "+ this.medidores+"\n";
    }

}
