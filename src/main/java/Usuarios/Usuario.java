/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;
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

    public Usuario(String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }
    
    
    public void iniciarSesion(){
            System.out.print("Ingrese nombre de usuario:");
            Scanner nUsuario = new Scanner(System.in);
            System.out.print("Ingrese contraseña:");
            Scanner contrasenia = new Scanner(System.in);
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
