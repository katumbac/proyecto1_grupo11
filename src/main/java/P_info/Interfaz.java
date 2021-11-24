/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import Usuarios.Usuario;
import Usuarios.usuarioAdministrador;
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
        Usuario usu = new Usuario("katumbac","0405");
        usuarioAdministrador usuadmi = new usuarioAdministrador("admin", "superadmin");
        
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
        String CUsuario = sc.nextLine();
        System.out.println("Ingrese Contraseña");
        String contra = sc.nextLine();
        sc.nextLine();//limpio el buffer

        String op1 = "";
        if(CUsuario.equals("abonado")){
            do{
                System.out.println("Usuario Abonado");
                System.out.println("1. Consultar Factura");
                System.out.println("2. Consultar histórico facturado");
                System.out.println("3. Consultar consumos por hora");
                System.out.println("4. Salir");
                System.out.println("Ingrese opcion");
                op1 = sc.nextLine();
            
                switch(op1){
                    case "1":
                        System.out.println("1. Consultar Factura"); 
                        //Al ingresar esta opción aparece una lista 
                        //de las facturas generadas a nombre del abonado
                        //y a continuación se pide el número de la factura a consultar 
                        //y se muestran los detalles de las facturas.
                        break;
                    case "2":
                        System.out.println("2. Consultar histórico facturado");
                        //Al ingresar esta opción aparece una lista con los medidores 
                        //registrados a nombre del abonado (código y nombre del plan contratado)
                        //a continuación se pide el código del medidor 
                        //a consultar y se muestra el número de kilovatios consumidos 
                        //y el valor a pagar de las últimas 3 facturas.
                        break;
                    case "3":
                        System.out.println("3. Consultar consumos por hora");
                        break;
                    case "4":
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }while(!op1.equals("4"));
            
        }
        
        else if(CUsuario.equals("admi")){
            String op2 = "";
            do{
                System.out.println("Opciones Administrador");
                System.out.println("1. Registrar Plan");
                System.out.println("2. Registrar Medidor");
                System.out.println("3. Simular Mediciones");
                System.out.println("4. Realizar Facturación");
                System.out.println("5. Salir");
                System.out.println("Ingrese opcion");
                op2 = sc.nextLine();
            
                switch(op2){
                    case "1":
                        System.out.println("1. Registrar Plan");
                        System.out.println("Ingrese nombre del plan: ");
                        String plan = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Ingrese costo de kilovatio hora: ");
                        String kilohora = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Ingrese nombres de las pronvicioas en las que el plan estaría disponible: ");
                        String nomprov = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Ingrese cargo base: ");
                        int cargobase = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese Horas Pico: ");
                        String horaspico = sc.nextLine();
                        sc.nextLine();         
                        break;
                        
                    case "2":
                        System.out.println("2. Registrar Medidor");
                        System.out.println("Ingrese número de cédula del abonado: ");
                        String numced = sc.nextLine();
                        sc.nextLine();
                        //Si no existe un abonado con el número de cédula ingresado 
                        // se procede a pedir el nombre de este y su correo 
                        //y a registrarlo en el sistema (el nombre de usuario será la cédula del abonado y la contraseña es un valor al azar que contengan 8 caracteres al menos una letra mayúscula y un dígito). 

                        System.out.println("Ingrese la dirección donde se instalará el medidor : ");
                        //String numced = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Ingrese tipo de medidor : ");
                        //String numced = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Ingrese tipo de plan que se aplica : ");
                        //String numced = sc.nextLine();
                        sc.nextLine();
                        
                        //Si los datos son válidos se procede a registrar el medidor el cual tendrá un código único. Al final se debe enviar un correo al abonado con los datos del medidor y en caso se registrará un nuevo abonado se debe enviar el usuario y contraseña de este.
                        break;
                    case "3":
                        System.out.println("3. Simular Mediciones");
                        //Opción el sistema pide el rango de fechas 
                        System.out.println("Fecha Inicio: ");
                        //LocalTime finicio= sc.nextLocalTime();
                        System.out.println("Fecha Fin: ");
                        //LocalTime ffin = sc.nextLocalTime();            
                        break;
                    case "4":
                        System.out.println("4. Realizar Facturación"); 
                        //Al ingresar esta opción se debe generar las facturas de todos los medidores que se encuentran registrados en el sistema. El total a pagar depende del plan contratado y el número de kilovatios consumidos. 
                        break;
                    case "5":      
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }while(!op2.equals("5"));
        
        
        }

        else if(CUsuario.equals("ope")){
            String op3 = "";
            do{
                System.out.println("Usuario Operario");

                System.out.println("1. Registrar Medición");
                System.out.println("2. Salir");
                System.out.println("Ingrese opcion");
                op3 = sc.nextLine();

                switch(op3){
                    case "1":
                        System.out.println("1. Registrar Medición");
                        System.out.println("Ingrese codigo del medidor: ");
                        //Al ingresar esta opción se debe generar las facturas de todos los medidores que se encuentran registrados en el sistema. El total a pagar depende del plan contratado y el número de kilovatios consumidos. 
                       
                        break;
                    case "2":
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }while(!op3.equals("2"));
        
        
        }
            
    }
}



