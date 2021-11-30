/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;
import Medidores.Medidor;
import Medidores.MedidorInteligente;
import Usuarios.usuarioAbonado;
import Usuarios.Usuario;
import P_info.Plan;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Burgos
 */
public class usuarioAdministrador extends Usuario {


    public ArrayList<Plan> planes;
    public ArrayList<Usuario> usuarios;
    public ArrayList<Medidor> medidores;

    public usuarioAdministrador(ArrayList<Plan> planes, ArrayList<Usuario> usuarios, ArrayList<Medidor> medidores, String nombre, String contrasenia) {

        super(nombre, contrasenia);
        this.planes = planes;
        this.usuarios = usuarios;
        this.medidores = medidores;
    }

    public ArrayList<Plan> getPlanes() {
        return planes;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    
    
    public void registrarPlan(String nombre, double costoKwh, ArrayList provincias, double cargoBase, ArrayList horasPico) {
        
        if(planes.isEmpty()){
            planes.add(new Plan(nombre,costoKwh,provincias,cargoBase, horasPico));
        }
        else{
            for(Plan p: planes){
                if (p.getNombre().equals(nombre)){
                   System.out.println("Plan ya existente");
                }
                else {
                    Plan p1 = new Plan(nombre,costoKwh,provincias,cargoBase, horasPico);
                    planes.add(p1);
                }
            }
        }
    }
    
    public void registrarMedidor(String cedula) {
        Scanner sc = new Scanner(System.in);
        
        //Método incompleto, todavía falta.
        for(Usuario Us: usuarios){
            if (Us instanceof usuarioAbonado && Us != null){
                usuarioAbonado Ua = (usuarioAbonado) Us;
                if (Ua.getCedula().equals(cedula)){
                    System.out.print("Ingrese la dirección donde se instalará el medidor: ");
                    String direccion = sc.nextLine();
                    
                    System.out.print("Tipo de medidor: ");
                    String tipoMedidor = sc.nextLine();
                    
                    System.out.print("Tipo de plan:");
                    int n = 0;
                    for(Plan p: planes){
                        n++;
                        System.out.println(n+".- "+p.getNombre());
                    }
                    int tipoPlan = sc.nextInt();
                    sc.nextLine();
                    }
                else{
                    System.out.print("Ingrese su correo electrónico: ");
                    String correo = sc.nextLine();
                    
                    String alfa="abcdefghijklmnopqrstuvwxyz";
                    String contrasenia="";
                    
                    for(int i=0;i<8;i++){
                      Double a = Math.random()*8;
                      int ind=a.intValue();
                      Double tipo=Math.random()*3;
                      int t=tipo.intValue();
                      switch(t) {
                        case 1: contrasenia+=alfa.charAt(ind);
                        break;
                        case 2: contrasenia+=ind;
                        break;
                        default: contrasenia+=alfa.toUpperCase().charAt(ind);
                        break;
                        }
                    }
                    
                    usuarios.add(new Usuario(cedula,contrasenia));
                    
                }
            }
        }
    }
    
    public void simularMediciones (LocalDate fechaInicio, LocalDate fechaFin) {
        
    }
    
    public void realizarFacturacion() {
        int total = 0;
        for(Medidor m: medidores){
            total += m.calcularValorPagar(LocalDate.now());
        System.out.print("******FACTURA*****");
        System.out.print("Fecha de emision: ");
        System.out.print("Codigo del medidor: ");
        System.out.print("Nombre del Plan: ");
        System.out.print("Fecha lectura anterior: ");
        System.out.print("Fecha lectura actual: ");
        System.out.print("Números de días: ");
        System.out.print("Lectura Anterior: ");
        System.out.print("Lectura Actual: ");
        System.out.print("Consumo en Kilovatios: ");
        System.out.print("Cargi Fijo del Plan: ");
        System.out.print("Total a pagar: "+ total);    
        }
        
     /**   
        Código del Medidor
Nombre del Plan
Fecha lectura anterior: el valor en el campo fecha de lectura actual de la última factura.
Fecha lectura actual: la fecha de la última lectura encontrada para este medidor
Número de días Facturados
Lectura Anterior: el total en kilovatios en el medidor en la última factura
Lectura Actual: el total en kilovatios que marca el medidor según la última lectura registrada.
Consumo en kilovatios
Cargo Fijo del Plan
Total a Pagar (según la formula de arriba)*/

        
        
    } 
}
