/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Pmedidor.Medidor;
import Usuarios.Usuario;
import java.util.ArrayList;
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
    private ArrayList<Medidor> medidores;

    public usuarioOperario(String nombre, String contrasenia) {
        super(nombre, contrasenia);
    }

    
    public void registrarMedicion(String codigo){
        
    }
    
   
}
