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
    public ArrayList<Usuario> usuarios;
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
                String fecha= "";
                String lectant="";
                for (Lectura s: x.getLecturas()){
                    ArrayList<Lectura> a = new ArrayList<>();                   
                    fecha+= s.getFecha();
                    lectant+=s.getValorActual();
                }
               
            if(x instanceof MedidorAnalogico && x.getCodigo().equals(cod)){
                System.out.println("\nMedidor analogico a nombre de : " +cod);
                System.out.println("\nÚltima lectura realizada: " +fecha);
                System.out.println("\nLectura Anterior : "+lectant);
                System.out.println("\nLectura Actual: ");
                double lecactu = sc.nextDouble();
                double kwhconsumidos = lecactu - Double.parseDouble(lectant);
                System.out.print("\nKilovatios consumidos: "+kwhconsumidos);
                
            }
            else if  (x instanceof MedidorInteligente && x.getCodigo().equals(cod)){
                MedidorInteligente y = (MedidorInteligente) x;
                System.out.println("\nMedidor Inteligente a nombre de : "+cod);
                System.out.println("\nÚltima lectura realizada: " );
                System.out.println("\nLectura Anterior: ");
                System.out.println("\nLectura Actual: ");
                double lecactu = sc.nextDouble();
                double kwhconsumidos = lecactu - Double.parseDouble(lectant);
                System.out.print("\nKilovatios consumidos: "+kwhconsumidos);
                
            }
        }     
    }   

   @Override
   public String toString(){
       return "Usuario Operario:\n" + super.toString();
   }
}
