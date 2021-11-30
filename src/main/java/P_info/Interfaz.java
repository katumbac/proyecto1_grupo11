/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import Medidores.Medidor;
import Usuarios.Usuario;

import Usuarios.usuarioAdministrador;
import P_info.Factura;
import Usuarios.usuarioAbonado;
import Usuarios.usuarioAdministrador;
import Usuarios.usuarioOperario;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Interfaz {
    private ArrayList<Plan> planes;
    private ArrayList<Medidor> medidores;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Factura> facturas;
    public Scanner sc;
    
    public Interfaz(){
        //iniciamos la variable sc de tipo scanner que usaremos para leer los 
        //valores ingresados por el usuario
        sc = new Scanner(System.in);
        //iniciamos la variable sc de tipo scanner que usaremos para leer los 
        //valores ingresados por el usuario
        sc = new Scanner(System.in);
        usuarios.add(new Usuario("katumbac","0405"));
        usuarios.add(new usuarioAdministrador(planes, usuarios, medidores, "admin", "superadmin"));
        
        //Dos Operarios
        usuarios.add(new usuarioOperario("operario1","1234"));
        usuarios.add(new usuarioOperario("operario2","4321"));
        
        //Dos planes
        //PLAN 1
        ArrayList<Provincias> ProvinciasSector1  = new ArrayList();
        ProvinciasSector1.add(Provincias.El_Oro);
        ArrayList<HorasPico> horapico1 = new ArrayList<>();
        LocalTime ini1= LocalTime.parse("08:00:00");
        LocalTime fin1= LocalTime.parse("10:00:00");
        LocalTime ini2= LocalTime.parse("07:00:00");
        LocalTime fin2= LocalTime.parse("09:00:00");
        horapico1.addAll(Arrays.asList(new HorasPico(ini1, fin1) ,new HorasPico(ini2,fin2)));
        //Plan(String nombre, double costoKwh, ArrayList<Provincias> provincias, double cargoBase, ArrayList<HorasPico> horasPico)
        Plan plan1 = new Plan("Plan1", 5.00, ProvinciasSector1, 6.00, horapico1);
        planes.add(plan1);
        
        
        //PLAN 2
        ArrayList<Provincias> ProvinciasSector2  = new ArrayList();      
        ProvinciasSector2.addAll(Arrays.asList(Provincias.Loja,Provincias.Imbabura,Provincias.Guayas,Provincias.Pastaza));
        ArrayList<HorasPico> horapico2 = new ArrayList<>();
        LocalTime tini1= LocalTime.parse("07:00:00");
        LocalTime tfin1= LocalTime.parse("08:00:00");
        LocalTime tini2= LocalTime.parse("08:00:00");
        LocalTime tfin2= LocalTime.parse("10:00:00");
        horapico1.addAll(Arrays.asList(new HorasPico(tini1, tfin1) ,new HorasPico(tini2,tfin2)));
        Plan plan2 = new Plan("Plan1", 5.00, ProvinciasSector1, 6.00, horapico1);
        planes.add(plan2);
        

        
        //Dos Abonados
        //Uno de los abonados debe tener dos medidores: uno de tipo analógico y uno de tipo residencial
	//El otro abonado debe tener un medidor analógico
        //usuarioAbonado(String nombreUsuario, String cedula, String correoElectronico, ArrayList<Medidor> medidores, ArrayList<Factura> facturas, String nombre, String contrasenia)
        ArrayList<Medidor> medidor1 = new ArrayList<>();
        //MedidorAnalogico(double KilovatiosConsumidos, String codigo, String provincia, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDateTime ultimaFechaCobrada, LocalDateTime consumoUltimaFactura)
        ArrayList<Lectura> lecturas1 = new ArrayList<>();
        LocalDate fecha= LocalDate.of(2024,03,04);
        Lectura lect1 = new Lectura(fecha, 5.00);      
        lecturas1.add(lect1);
        
        //Dos abonados
        //Uno de los abonados debe tener dos medidores: uno de tipo analógico y uno de tipo residencial
        //El otro abonado debe tener un medidor analógico

        //medidor1.add(new MedidorAnalogico(5.00, "COD1", "El_Oro","Portete",3.00, plan1 ,lecturas, ini1,tini1));
        ArrayList<Factura> facturas1 = new ArrayList<>();
        //
        
        //Anlogico
        usuarios.add(new usuarioAbonado("Abonado1", "0909123456", "ktumbaco2002@gmail.com", medidor1, facturas1, "operario1","1234"));
        //analogico y residencial
        ArrayList<Medidor> medidor2 = new ArrayList<>();
        //medidor2.add(new MedidorAnalogico(5.00, "COD2", "Guayas","Argentina",3.00, plan2 ,lecturas, ini1,tini1))
        //MedidorInteligente(int horaspico, double telemetria, double KilovatiosConsumidosNoPico, double KilovatiosConsumidosPico, String codigo, String provincia, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDate ultimaFechaCobrada, LocalDate consumoUltimaFactura)
        //medidor2.add(new MedidorInteligente(5.00,3.00,6.00,8.00 "COD1", "El_Oro","Portete",3.00, plan1 ,lecturas, ini1,tini1));
        
        //Factura(int numeroFactura, usuarioAbonado nombreAbonado, Medidor codigoMedidor, Plan nombrePlan, LocalDate fechaEmision, LocalDate fechaLecturaAnt, LocalDate fechaLecturaAct, int diasFacturados, Lectura lecturaAnt, double consumo, double cargoPlan, double totalPagar)  
        LocalDate fecha1= LocalDate.of(2024,03,04);
        Lectura lecturas2 = new Lectura(fecha1, 5.00);
        LocalDate fechaemi = LocalDate.of(2020,03,04);
        LocalDate fechaLecturaAnt = LocalDate.of(2024,02,04);
        
        //Factura fact = new Factura(001, "Abonado1", "COD1", plan1, fechaemi,fechaLecturaAnt,5,lecturas2, 5.00, 3.00, 5.00);
        
        usuarios.add(new usuarioAbonado("Abonado2", "0909654321", "ktumbaco2002@gmail.com", medidor2, facturas, "operario2","4321"));
    
        //registrar dos  mediciones
        String codp = "COD2";
        String codp1 = "COD3";
        //registrarMedicion(codp);
        //registrarMedicion(codp1);
        
    }
    
    public void menuPrincipal(){
        String op = "";
        System.out.println("Bienvenido");
        do{            
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Salir");
            
            System.out.println("Opción:");
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


        Usuario usu = new Usuario(CUsuario,contra);
        //Vendedor vene;
        //si tipo es empleado cree une instancia de Empleado con los datos 
        //si tipo es vendedor cree una instancia de Vendedor con los datos 
        //agregue al empleado a la nomina
     // Empleado emp =  new TecnoHogar();
        if (usu instanceof usuarioAbonado){
           //si el usuario es Usuario abonado
           String op1;
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
        
        // si el usuario es Usuario Administrador
        else if(usu instanceof usuarioAdministrador){
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
        // Si usuario es operario
        else if (usu instanceof usuarioOperario){  
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
                        System.out.print("Ingrese codigo del medidor: ");
                        String cod = sc.nextLine();
                        //registrarMedicion(cod);
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
         
        } else {
          System.out.println("No existe usuario");
        }
           
    }          
}




