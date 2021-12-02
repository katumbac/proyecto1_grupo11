/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import Medidores.Medidor;
import Usuarios.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    private ArrayList<Medidor> medidores;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        DatosCreadosInternamente datos = new DatosCreadosInternamente();
        System.out.println(datos.getMedidores());
        //System.out.println(datos.getUsuarios());
       
       Interfaz uit = new Interfaz();
        uit.menuPrincipal();
        //System.out.println(datos.getPlanes());
        System.out.println(datos.getMedidores());

    }
}
