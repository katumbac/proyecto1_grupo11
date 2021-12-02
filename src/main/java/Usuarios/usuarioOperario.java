/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Medidores.Medidor;
import Medidores.MedidorAnalogico;
import Medidores.MedidorInteligente;
import Usuarios.Usuario;
import java.time.LocalDate;
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
        
        Scanner sc = new Scanner(System.in);
        for (Medidor m: medidores){
            if(m.getCodigo().equals(codigo)){
                System.out.println(m);
                if (!(m instanceof MedidorInteligente)){
                    MedidorAnalogico ma = (MedidorAnalogico) m;
                    System.out.print("Ingrese la lectura actual: ");
                    double l_Actual = sc.nextDouble();
                    ma.setKilovatiosConsumidos(l_Actual);
                    LocalDate fechaToma = LocalDate.now();
                    
        }
        
            }
        }
        
        
        
        /**if(codigo instanceof medidores){
         System.out.print("Medidor analogico a nombre de ");
         System.out.print("Última lectura realizada ");
         System.out.print("Lectura Anterior");
         System.out.print("Lectura Actual");
         String lecactu = sc.nextLine();
         System.out.print("Kilovatios consumidos");
        }*/
        
        
    }
    
    
   public String toString(){
       return "Usuario Operario:\n" + super.toString();
   }
}
