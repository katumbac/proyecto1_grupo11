/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Medidores.Medidor;
import Medidores.MedidorAnalogico;
import Medidores.MedidorInteligente;
import P_info.DatosCreadosInternamente;
import P_info.Lectura;
import Usuarios.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Kevin Vargas
 */
public class usuarioOperario extends Usuario {
    
    public ArrayList<Medidor> medidores;
    public ArrayList<Lectura> lecturas;
    public DatosCreadosInternamente datos;
    
    public usuarioOperario(String nombre, String contrasenia) {
        super(nombre, contrasenia);
    }

    public void registrarMedicion(String codigo){
        Scanner sc = new Scanner(System.in);
        String cod = codigo.toUpperCase();
    
        DatosCreadosInternamente datos = new DatosCreadosInternamente();
        medidores = datos.getMedidores();
        lecturas = datos.getLecturas();    
        for(Medidor x: medidores){
            System.out.println();
            if(x instanceof MedidorAnalogico && x.getCodigo().equals(cod)){
                System.out.println(x.getLecturas());//[Fecha: 2023-03-04 Valor actual:5.0]
                for (Lectura s: x.getLecturas()){
                    ArrayList<Lectura> a = new ArrayList<>();
                    
                    System.out.println(s);
                }
                
                System.out.println("Medidor analogico a nombre de : " );
                System.out.println("Última lectura realizada: " );
                System.out.println("Lectura Anterior ");
                System.out.println("Lectura Actual: ");
                double lecactu = sc.nextDouble();
                double klconsumidos = lecactu ;//- x.getLecturaAnt()
                System.out.print("Kilovatios consumidos: "+klconsumidos);
                
            }
            else if  (x instanceof MedidorInteligente && x.getCodigo().equals(cod)){
                MedidorInteligente y = (MedidorInteligente) x;
                System.out.print("Medidor Inteligente a nombre de : " );
                System.out.print("Última lectura realizada: " );
                System.out.print("Lectura Anterior: ");
                System.out.print("Lectura Actual");
                String lecactu = sc.nextLine();
                
            }
     
        }
        
       
    }   

   @Override
   public String toString(){
       return "Usuario Operario:\n" + super.toString();
   }
}
