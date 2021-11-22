/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_grupo11;

import java.util.Scanner;

/**
 *
 * @author Kevin Vargas
 */
public class usuarioOperario extends Usuario {
    private String codigoMedidor;
    private double lecturaAnterior;
    private double lecturaActual;
    private double kilovatiosConsumidos;

    public usuarioOperario(String codigoMedidor, double lecturaAnterior, double lecturaActual, double kilovatiosConsumidos, String nombre, String contrasenia, int opciones) {
        super(nombre, contrasenia, opciones);
        this.codigoMedidor = codigoMedidor;
        this.lecturaAnterior = lecturaAnterior;
        this.lecturaActual = lecturaActual;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
    }
    
    public void registrarMedicion(String codigoMedidor, double lecturaActual){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese Codigo del medidor: ");
        codigoMedidor = entrada.nextLine();
        System.out.println(lecturaAnterior);
        System.out.println(lecturaActual);
        System.out.println(kilovatiosConsumidos);    
    }
    
   
}
