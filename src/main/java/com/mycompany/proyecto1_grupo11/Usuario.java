/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_grupo11;
import java.util.Scanner;
/**
 *
 * @author ROBERTO
 */
public class Usuario {
    private String nombre;
    private String contrasenia;
    
    public Usuario(String nombre, String contrasenia){
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }
    public void iniciarSesion(){
        System.out.print("Ingrese nombre de usuario:");
        Scanner nUsuario = new Scanner(System.in);
        System.out.print("Ingrese contraseña:");
        Scanner contrasenia = new Scanner(System.in);
    }
}
