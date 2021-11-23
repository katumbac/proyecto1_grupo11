/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Interfaz {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su Usuario:");
        String usuario = sc.nextLine();
        
        System.out.print("Ingrese su contraseñña:");
        int contra = sc.nextInt(); 

        
        sc.close();
        
        //mostsrar datos ingresados por el usuario
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + contra);

        
    }

}
