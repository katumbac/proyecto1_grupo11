/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;
import Usuarios.usuarioAbonado;
import Usuarios.Usuario;
import P_info.Plan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Burgos
 */
public class usuarioAdministrador extends Usuario {
    public ArrayList<Plan> planes = new ArrayList<>();
    public ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public usuarioAdministrador(String nombre, String contrasenia) {
        super(nombre, contrasenia);
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
        for(Usuario Us: usuarios){
            if (Us instanceof usuarioAbonado && Us != null){
                usuarioAbonado Ua = (usuarioAbonado) Us;
                if (Ua.getCedula().equals(cedula)){
                    System.out.print("Ingrese la dirección donde se instalará el medidor: ");
                    String direccion = sc.nextLine();
                    
                    System.out.print("Tipo de medidor: ");
                    String tipoMedidor = sc.nextLine();
                    
                    System.out.print("Tipo de plan: ");
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
    
    public void simularMediciones () {
    }
    
    public void realizarFacturacion() {
    } 
}
