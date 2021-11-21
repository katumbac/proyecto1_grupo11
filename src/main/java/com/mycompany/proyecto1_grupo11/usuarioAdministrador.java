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
public class usuarioAdministrador extends Usuario {
<<<<<<< HEAD
    
=======
    public ArrayList<Plan> planes=new ArrayList<>();
>>>>>>> 6a76c179f38c928edd59f552a44abfe328e32037
    public usuarioAdministrador(String nombre, String contrasenia) {
    super(nombre, contrasenia);}
    /**
     * Registrar Plan
     * En esta opción el administrador ingresa el nombre del plan, el costo de kilovatio
     * hora, los nombres de las provincias en las que el plan estaría disponible, el cargo
     * base y las horas pico. No puede haber dos planes con el mismo nombre.
     **/
    public void registrarPlan(String nombre, double costoKwh, ArrayList provincias, double cargoBase, String horaPico) {
        Plan p= new Plan(nombre,costoKwh,provincias,cargoBase,horaPico);
        boolean ingresar=true;
        if(planes == null || planes.size() == 0) {
          ingresar=true;
          } else {
        for(Plan i:planes) {
          String n=i.getNombre();
          if(n.equals(nombre)==true) {
            ingresar=false;
          } else {
            ingresar=true;
          }
        }
          }
          if(ingresar==true) {
            planes.add(p);
          } else {
            System.out.println("Se debe ingresar un Plan con otro nombre.");
          }
    }
    
    public void registrarMedidor() {
    }
    
    public void simularMediciones () {
    }
    
    public void realizarFacturacion() {
    } 
}
