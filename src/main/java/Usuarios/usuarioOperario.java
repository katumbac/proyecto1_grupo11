/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Medidores.Medidor;
import Usuarios.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin Vargas
 */
public class usuarioOperario extends Usuario {
    
    private ArrayList<Medidor> medidores;

    public usuarioOperario(String nombre, String contrasenia) {
        super(nombre, contrasenia);
    }

    
    public void registrarMedicion(String codigo){
        
        for (Medidor m: medidores){
            if(m.getCodigo().equals(codigo)){
                System.out.println(m);
            }
        }
        /**if(codigo instanceof medidores){
         System.out.print("Medidor analogico a nombre de ");
         System.out.print("Última lectura realizada ");
         System.out.print("Lectura Anterior");
         System.out.print("Lectura Actual");
         System.out.print("Kilovatios consumidos");
        }*/
        
        
    }
    
   
}
