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
public class Interfaz {

    public Scanner sc;

    public Interfaz(){
        //iniciamos la variable sc de tipo scanner que usaremos para leer los 
        //valores ingresados por el usuario
        sc = new Scanner(System.in);
        //iniciamos la variable TecnoHogar
        //que es la que tienen la informacion de la empresa

    }
    
    public void menuPrincipal(){
        String op = "";
        System.out.println("Bienvenido");
        do{
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Salir");
            System.out.println("Ingrese opcion");
            op = sc.nextLine();
            
            switch(op){
                case "1":
                    opcion1();            
                    break;
                case "2":
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(!op.equals("2")); 
    }
    

    private void opcion1(){
        System.out.println("\n Iniciar Sesion");
        System.out.println("Ingrese Usuario");
        String usuario = sc.nextLine();
        System.out.println("Ingrese Contraseña");
        String contra = sc.nextLine();
        sc.nextLine();//limpio el buffer

        
        Usuario usu;
        //Vendedor vene;
        //si tipo es empleado cree une instancia de Empleado con los datos 
        //si tipo es vendedor cree una instancia de Vendedor con los datos 
        //agregue al empleado a la nomina
     // Empleado emp =  new TecnoHogar();
        /**if (usuario instanceof uusuarioAbonado)){
          
            
        } else {
          System.out.println("No existe usuario");
        }*/
        
        /* si el usuario es Usuario abonado
        do{
            System.out.println("Usuario Abonado");
            System.out.println("1. Consultar Factura");
            System.out.println("2. Consultar histórico facturado");
            System.out.println("3. Consultar consumos por hora");
            System.out.println("Ingrese opcion");
            op = sc.nextLine();
            
            switch(op){
                case "1":
                    opcion1();            
                    break;
                case "2":
                    System.out.println("Adios");
                    break;
                case "3":
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(!op.equals("3"));
        
        */
        
        /* si el usuario es Usuario Administrador
            do{
            System.out.println("Opciones Administrador");
            System.out.println("1. Registrar Plan");
            System.out.println("2. Registrar Medidor");
            System.out.println("3. Simular Mediciones");
            System.out.println("4. Realizar Facturación");
            System.out.println("Ingrese opcion");
            op = sc.nextLine();
            
            switch(op){
                case "1":
                    opcion1();            
                    break;
                case "2":
                    System.out.println("Adios");
                    break;
                case "3":
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(!op.equals("3"));
        */
     
        /* Si usuario es operario
            
        do{
            System.out.println("Usuario Operario");

            System.out.println("1. Registrar Medición");
            System.out.println("2. Salir");
            System.out.println("Ingrese opcion");
            op = sc.nextLine();
            
            switch(op){
                case "1":
                    opcion1();            
                    break;
                case "2":
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(!op.equals("2"));
        
        */
       
                
    }
    
    /**
     * Realiza la opcion 2 del menu que es registrar una nueva venta
     
    private void opcion2(){
        System.out.println("Opcion Registrar Venta");
        
        
        System.out.println("Ingrese dni vendedor");
        String cedula = sc.nextLine();
        System.out.println("numero de articulos vendidos");
        int cant = sc.nextInt();
        sc.nextLine();//limpio el buffer
        Vendedor vende = th.consultarVendedor(cedula);
        if(vende!=null){
            th.registrarVenta(vende, cant);
        }else {
            System.out.println("No esta registrado vendedor \n");
        }
        
    
    }*/
    
    /**
     * Realiza la opcion 3 del menu que es mostrar la nomina
     
    private void opcion3(){
        System.out.println("Opcion Mostrar Nomina");
        th.mostrarNomina();
    }*/
    
}



