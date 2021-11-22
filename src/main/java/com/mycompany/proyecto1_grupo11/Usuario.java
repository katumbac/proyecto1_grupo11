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
    private String opciones;

    public Usuario(String nombre, String contrasenia, int menuOpciones) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.opciones = opciones;
    }
    
    public int menu(){
        int opciones;
        opciones = Integer.parseInt(JOptionPane.showInputDialog("1.- iniciar Sesion, 2.-salir"));
        return opciones;
    }
    
    public void iniciarSesion(int opciones){
        if(opciones == 1){
            System.out.print("Ingrese nombre de usuario:");
            Scanner nUsuario = new Scanner(System.in);
            System.out.print("Ingrese contraseña:");
            Scanner contrasenia = new Scanner(System.in);
        }
        
    }
    public void cerrarSesion(int opciones){
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

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }
    
}
