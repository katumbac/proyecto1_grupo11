/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_grupo11;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ROBERTO
 */
public class Usuario {
    private String nombre;
    private String contrasenia;
    private int opciones;

    public Usuario(String nombre, String contrasenia, int opciones) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.opciones = opciones;
    }
    
    public int menu(){
        opciones = Integer.parseInt(JOptionPane.showInputDialog("1.- iniciar Sesion, 2.-salir"));
        return opciones;
    }
    
    public void iniciarSesion(){
        if(opciones == 1){
            System.out.print("Ingrese nombre de usuario:");
            Scanner nUsuario = new Scanner(System.in);
            System.out.print("Ingrese contraseña:");
            Scanner contrasenia = new Scanner(System.in);
        }
        
    }
    public void cerrarSesion(){
        if(opciones == 2){
            System.out.println("Sesion cerrada exisotasmente");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getOpciones() {
        return opciones;
    }

    public void setOpciones(int opciones) {
        this.opciones = opciones;
    }
    
}
