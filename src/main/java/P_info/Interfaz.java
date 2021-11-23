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
        
        System.out.print("Ingrese su nombre:");
        String nombre = sc.nextLine(); // ingreso de string
        
        System.out.print("Ingrese su edad:");
        int edad = sc.nextInt(); // ingreso de numero entero
        
        System.out.print("Ingrese su salario:");
        double salario = sc.nextDouble(); // ingreso de double
        
        sc.close();//como ya no vamos a leer mas datos de consola
                   //cerramos la conexion
        
        //mostsrar datos ingresados por el usuario
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        
    }

}
