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

    public void registrarMedicion(String codigo,ArrayList<Usuario> usuarios){
        int val=0;
        Scanner sc = new Scanner(System.in);
        String cod=codigo.toUpperCase();
        for (Usuario u:usuarios) {
            if (u instanceof usuarioAdministrador) {
                usuarioAdministrador ad=(usuarioAdministrador)u;
                ArrayList<Usuario> us=ad.getUsuarios();
                for (Usuario ing:us) {
                    if (ing instanceof usuarioAbonado) {
                        usuarioAbonado uA=(usuarioAbonado)ing;
                        medidores=uA.getMedidores();
                        for(Medidor x: medidores){
                            double lecactu=0;
                            String fecha= "";
                            double lectant=0;
                            for (Lectura s: x.getLecturas()){
                                fecha= "";
                                fecha+= s.getFecha();
                                lectant=s.getValorActual();
                            }
                            if(x instanceof MedidorAnalogico && x.getCodigo().equals(cod)){
                                System.out.println("\nMedidor analogico a nombre de : " +cod);
                                System.out.println("\nÚltima lectura realizada: " +fecha);
                                System.out.println("\nLectura Anterior : "+lectant);
                                System.out.println("\nLectura Actual: ");
                                lecactu = sc.nextDouble();
                                double kwhconsumidos = lecactu - lectant;
                                System.out.println("\nKilovatios consumidos: "+kwhconsumidos);
                                x.getLecturas().add(new Lectura(LocalDate.now(),lecactu));
                                //System.out.println(x);
                            }
                            else if  (x instanceof MedidorInteligente && x.getCodigo().equals(cod)){
                                MedidorInteligente y = (MedidorInteligente) x;
                                System.out.println("\nMedidor Inteligente a nombre de : "+cod);
                                System.out.println("\nÚltima lectura realizada: " );
                                System.out.println("\nLectura Anterior: ");
                                System.out.println("\nLectura Actual: ");
                                lecactu = sc.nextDouble();
                                double kwhconsumidos = lecactu - lectant;
                                System.out.println("\nKilovatios consumidos: "+kwhconsumidos);
                                x.getLecturas().add(new Lectura(LocalDate.now(),lecactu));
            } else {
                                val++;
                            }
        }
                    }
                }
            }
        }
        if (val>2) {
            System.out.println("Opción Inválida");
        }
            
    }   

   @Override
   public String toString(){
       return "Usuario Operario:\n" + super.toString();
   }
}
