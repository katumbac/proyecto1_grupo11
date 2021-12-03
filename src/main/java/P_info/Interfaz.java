/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import Medidores.Medidor;
import Medidores.MedidorAnalogico;
import Medidores.MedidorInteligente;
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

import P_info.DatosCreadosInternamente;
import java.time.LocalDateTime;

/**
 *
 * @author user
 */
public class Interfaz {

    private ArrayList<Plan> planes;
    private ArrayList<Medidor> medidores;
    private ArrayList<Usuario> usuarios;
    public Scanner sc;

    public DatosCreadosInternamente datos;

    public Interfaz() {
        //iniciamos la variable sc de tipo scanner que usaremos para leer los 
        //valores ingresados por el usuario
        sc = new Scanner(System.in);
        datos = new DatosCreadosInternamente();
        planes = datos.getPlanes();
        medidores = datos.getMedidores();
        usuarios = datos.getUsuarios();

    }

    public void menuPrincipal() {
        String op = "";
        System.out.println("Bienvenido");
        while (!op.equals("2")) {
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Salir");
            System.out.println("Opción:");
            op = sc.nextLine();

            switch (op) {
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
        }//while(!op.equals("2")); 
    }

    private void opcion1() {
        //ArrayList<Usuario> usuarios;
        System.out.println("Iniciar Sesion");
        System.out.println("Ingrese Usuario:");
        String CUsuario = sc.nextLine();
        System.out.println("Ingrese Contraseña:");
        String contra = sc.nextLine();

        for (Usuario us : usuarios) {
            if (us != null) {
                if (us.getNombre().equals(CUsuario) && us.getContrasenia().equals(contra)) {

                    if (us instanceof usuarioAbonado) {
                        //si el usuario es Usuario abonado
                        String op1;
                        usuarioAbonado uAb = (usuarioAbonado) us;
                        do {
                            System.out.println("Usuario Abonado");
                            System.out.println("1. Consultar Factura");
                            System.out.println("2. Consultar histórico facturado");
                            System.out.println("3. Consultar consumos por hora");
                            System.out.println("4. Salir");
                            System.out.println("Ingrese opcion:");
                            op1 = sc.nextLine();

                            switch (op1) {
                                case "1":
                                    System.out.println("1. Consultar Factura");
                                    uAb.consultarFactura();
                                    //Al ingresar esta opción aparece una lista 
                                    //de las facturas generadas a nombre del abonado
                                    //y a continuación se pide el número de la factura a consultar 
                                    //y se muestran los detalles de las facturas.
                                    break;
                                case "2":
                                    System.out.println("2. Consultar histórico facturado");
                                    
                                    uAb.consultarHistoricoFacturado();
                                    //Al ingresar esta opción aparece una lista con los medidores 
                                    //registrados a nombre del abonado (código y nombre del plan contratado)
                                    //a continuación se pide el código del medidor 
                                    //a consultar y se muestra el número de kilovatios consumidos 
                                    //y el valor a pagar de las últimas 3 facturas.
                                    break;
                                case "3":
                                    System.out.println("3. Consultar consumos por hora");
                                    uAb.consultarConsumoHora();
                                    break;
                                case "4":
                                    System.out.println("Adios");
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                        } while (!op1.equals("4"));
                    } // si el usuario es Usuario Administrador
                    else if (us instanceof usuarioAdministrador) {
                        String op2 = "";
                        usuarioAdministrador ua = (usuarioAdministrador) us;
                        do {
                            System.out.println("Opciones Administrador");
                            System.out.println("1. Registrar Plan");
                            System.out.println("2. Registrar Medidor");
                            System.out.println("3. Simular Mediciones");
                            System.out.println("4. Realizar Facturación");
                            System.out.println("5. Salir");
                            System.out.println("Ingrese opcion");
                            op2 = sc.nextLine();

                            switch (op2) {
                                case "1":

                                    System.out.println("Ingrese nombre del plan: ");
                                    String plan = sc.nextLine();

                                    System.out.println("Ingrese costo de kilovatio hora: ");
                                    double kilohora = sc.nextDouble();
                                    sc.nextLine();

                                    System.out.println("Ingrese nombres de las provincias en las que el plan estaría disponible separadas por coma: ");
                                    ArrayList<Provincias> provincias = new ArrayList<>();
                                    String nomprov = sc.nextLine();
                                    String[] prov = nomprov.split(",");
                                    for (String p : prov) {
                                        if (p != null) {
                                            provincias.add(Provincias.valueOf(p));
                                        }
                                    }

                                    System.out.println("Ingrese cargo base: ");
                                    double cargobase = sc.nextDouble();
                                    sc.nextLine();

                                    ArrayList<HorasPico> horasPico = new ArrayList<>();
                                    
                                    System.out.println("Ingrese Horas Pico (hh:mm) separadas por coma: ");
                                    String horaspico = sc.nextLine();
                                    String[] horas = horaspico.split(",");
                                    for(int i = 1; i<horas.length;i+=2){
                                        horasPico.add(new HorasPico(LocalTime.parse(horas[i-1]),LocalTime.parse(horas[i]))); 
                                    }

                                    ua.registrarPlan(plan, kilohora, provincias, cargobase, horasPico);
                                    break;

                                case "2":
                                    System.out.println("2. Registrar Medidor");
                                    System.out.println("Ingrese número de cédula del abonado: ");
                                    String numced = sc.nextLine();
                                    ua.registrarMedidor(numced);
                                    System.out.println(usuarios);
                                 
                                    //Si los datos son válidos se procede a registrar el medidor el cual tendrá un código único. Al final se debe enviar un correo al abonado con los datos del medidor y en caso se registrará un nuevo abonado se debe enviar el usuario y contraseña de este.
                                    break;
                                case "3":
                                    System.out.println("3. Simular Mediciones");
                                    //Opción el sistema pide el rango de fechas 
                                    System.out.println("Fecha Inicio: ");
                                    String fechaInicio= sc.nextLine();
                                    LocalDateTime fechaI= LocalDateTime.parse(fechaInicio+"T00:00:00");
                                    System.out.println("Fecha Fin: ");
                                    String fechaFin = sc.nextLine();
                                    LocalDateTime fechaF= LocalDateTime.parse(fechaFin+"T00:10:00");
                                    ua.simularMediciones (fechaI,fechaF);
                                    break;
                                case "4":
                                    System.out.println("4. Realizar Facturación");
                                    ua.realizarFacturacion();
                                    //Al ingresar esta opción se debe generar las facturas de todos los medidores que se encuentran registrados en el sistema. El total a pagar depende del plan contratado y el número de kilovatios consumidos. 
                                    break;
                                case "5":
                                    System.out.println("Adios");
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                        } while (!op2.equals("5"));
                    } // Si usuario es operario
                    else if (us instanceof usuarioOperario) {
                        String op3 = "";
                        usuarioOperario uo = (usuarioOperario) us;
                        do {
                            System.out.println("Usuario Operario");
                            System.out.println("1. Registrar Medición");
                            System.out.println("2. Salir");
                            System.out.println("Ingrese opcion");
                            op3 = sc.nextLine();

                            switch (op3) {
                                case "1":
                                    System.out.println("1. Registrar Medición");
                                    System.out.println("Ingrese codigo del medidor: ");
                                    String cod = sc.nextLine();
                                    uo.registrarMedicion(cod,usuarios);
                                    //Al ingresar esta opción se debe generar las facturas de todos los medidores que se encuentran registrados en el sistema. El total a pagar depende del plan contratado y el número de kilovatios consumidos. 
                                    break;
                                case "2":
                                    System.out.println("Adios");
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                        } while (!op3.equals("2"));
                    }
                } 
            }
        }
        System.out.println("Usuario no existente");
    }
}
