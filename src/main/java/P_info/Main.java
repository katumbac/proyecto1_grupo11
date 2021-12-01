/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import Usuarios.Usuario;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
   
    public static void main(String[] args){
        /**Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre de usuario: ");
        String nUsuario = sc.nextLine();
        sc.nextLine();
        
        * 
        System.out.print("Ingrese contraseña: ");
        String contrasenia = sc.nextLine();
        sc.nextLine();

                
        sc.close();*/
        
        //datoscreadorinternamente datos = new datoscreadorinternamente();
        /*Interfaz uit = new Interfaz();
        uit.menuPrincipal();*/
        
        Correo.enviarCorreo("lnburgos@espol.edu.ec", "Prueba Correo", "hola mundo");

    }
    
}
