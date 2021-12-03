/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;
import Medidores.Medidor;
import Medidores.MedidorInteligente;
import Medidores.MedidorAnalogico;
import P_info.Correo;
import P_info.HorasPico;
import P_info.Lectura;
import Usuarios.usuarioAbonado;
import Usuarios.Usuario;
import P_info.Plan;
import P_info.Provincias;
import P_info.Factura;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Burgos
 */
public class usuarioAdministrador extends Usuario {


    public ArrayList<Plan> planes;
    public ArrayList<Usuario> usuarios;
    public ArrayList<Medidor> medidores;

    public usuarioAdministrador(ArrayList<Plan> planes, ArrayList<Usuario> usuarios, ArrayList<Medidor> medidores, String nombre, String contrasenia) {

        super(nombre, contrasenia);
        this.planes = planes;
        this.usuarios = usuarios;
        this.medidores = medidores;
    }

    public ArrayList<Plan> getPlanes() {
        return planes;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    
    
    public void registrarPlan(String nombre, double costoKwh, ArrayList<Provincias> provincias, double cargoBase, ArrayList<HorasPico> horasPico) {
        Plan p= new Plan(nombre,costoKwh,provincias,cargoBase,horasPico);
        boolean ingresar=true;
        if(planes.isEmpty()) {
            ingresar=true;
        } else {
            for(Plan i:planes) {//El java no permite agregar algo al mismo listado que estas iterando.
                String n=i.getNombre();
                if(n.equals(nombre)==true) {
                    ingresar=false;
                } else {
                    ingresar=true;
                }
            }
        }
        if(ingresar==true) {
            planes.add(p);
            System.out.println("Plan registrado correctamente.");
        } else {
            System.out.println("Se debe ingresar un Plan con otro nombre.");
        }
    }
    
    public void registrarMedidor(String cedula) {
        Scanner sc = new Scanner(System.in);
        Medidor m;
        ArrayList<Medidor> mUsuario=new ArrayList<>();
        String mensaje="";
        String correo="";
        
        boolean nuevo=true;
        String alfa="abcdefghijklmnopqrstuvwxyz";
        
        for (Usuario u:usuarios){
            if (u instanceof usuarioAbonado) {
                usuarioAbonado ab=(usuarioAbonado)u;
                String id=ab.getCedula();
                if (id.equals(cedula)){
                    nuevo=false;
                    mUsuario=ab.getMedidores();
                    correo=ab.getCorreoElectronico();
                }
            }
        }
        //Método incompleto, todavía falta.
        if (nuevo==false){
                    
                    System.out.println("Ingrese la dirección donde se instalará el medidor: ");
                    String direccion = sc.nextLine();
                    
                    System.out.println("Tipo de medidor:\n1. Analógico\n2. Inteligente\nIngresar su opción: ");
                    String tipoMedidor = sc.nextLine();
                    
                    System.out.println("Tipo de plan:");
                    System.out.println("Planes disponibles");
                    
                    int n = 1;
                    for(Plan p: planes){
                        System.out.println("Plan #"+n+"\n"+p);
                        n++;
                    }
                    
                    String tipoPlan = sc.nextLine();
                    int i_plan =0;
                    for(Plan p: planes){
                        if(p.getNombre().equals(tipoPlan))
                            i_plan += planes.indexOf(p);
                            
                    }
                    
                    Plan planElegido = planes.get(i_plan);
                    
                    String codigo="";

                    for(int i=0;i<6;i++){
                      Double a = Math.random()*8;
                      int ind=a.intValue();
                      Double tipo=Math.random()*3;
                      int t=tipo.intValue();
                      switch(t) {
                        case 1: codigo+=alfa.charAt(ind);
                        break;
                        case 2: codigo+=ind;
                        break;
                        default: codigo+=alfa.toUpperCase().charAt(ind);
                        break;
                        }
                    }
                    ArrayList<Lectura> lecturas = new ArrayList<>();
                    LocalDate ultimaFechaCobrada = LocalDate.now();
                    LocalDate consumoUltimaFactura = LocalDate.now();
                    switch(tipoMedidor){
                        case "1":
                            m=new MedidorAnalogico(codigo,direccion,planElegido.getCostoKwh(),planElegido,lecturas,ultimaFechaCobrada,consumoUltimaFactura,0);
                            medidores.add(m);
                            mUsuario.add(m);
                            mensaje+=m.toString();
                            break;
                        case "2":
                            System.out.print("Ingrese la telemetria: ");
                            double tel=sc.nextDouble();
                            sc.nextLine();
                            m=new MedidorInteligente(tel,0,0,codigo,direccion,planElegido.getCostoKwh(),planElegido,lecturas,ultimaFechaCobrada,consumoUltimaFactura);
                            medidores.add(m);
                            mUsuario.add(m);
                            mensaje+=m.toString();
                            break;
                    }
                    
                    
                    Correo.enviarCorreo(correo,"Medidor Registrado",mensaje);
                    
                }
                else{
                    System.out.println("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Ingrese su correo electrónico: ");
                    correo = sc.nextLine();
                    
                    String contrasenia="";
                    
                    for(int i=0;i<8;i++){
                      Double a = Math.random()*8;
                      int ind=a.intValue();
                      Double tipo=Math.random()*3;
                      int t=tipo.intValue();
                      switch(t) {
                        case 1: contrasenia+=alfa.charAt(ind);
                        break;
                        case 2: contrasenia+=ind;
                        break;
                        default: contrasenia+=alfa.toUpperCase().charAt(ind);
                        break;
                        }
                    }
                    //(String destinatario, String asunto, String contenido)
                    ArrayList<Medidor> medidores = new ArrayList<>();
                    ArrayList<Factura> facturas = new ArrayList<>();
                    
                    usuarios.add(new usuarioAbonado(cedula,cedula,correo,medidores,facturas,nombre,contrasenia));
                    mensaje+="Usuario: "+ cedula +"\nContraseña: "+contrasenia;
                    Correo.enviarCorreo(correo,"Registro en el sistema",mensaje);
                    
                }
    }
    
    public void simularMediciones (LocalDate fechaInicio, LocalDate fechaFin) {
        
    }
    
    public void realizarFacturacion() {
        for (Usuario u:usuarios) {
            if (u instanceof usuarioAbonado) {
                usuarioAbonado ab=(usuarioAbonado)u;
                ArrayList<Medidor> medidoresAb=ab.getMedidores();
                ArrayList<Factura> facturasAb=ab.getFacturas();
                String mensaje="";
                String correo=ab.getCorreoElectronico();
                for(Medidor m: medidoresAb){
                    Lectura LecAct;
                    LocalDate Act;
                    Lectura LecAnt;
                    LocalDate Ant;
                    
                    double total = m.calcularValorPagar(LocalDate.now());
                    Double azar=Math.random()*100000000;
                    int n=azar.intValue();
                    Plan p=m.getPlanContratado();
                    LocalDate emision=LocalDate.now();
                    ArrayList<Lectura> L=m.getLecturas();
                    int ind=L.size();
                    if (ind==1){
                        LecAct=L.get(0);
                        Act=LecAct.getFecha();
                        LecAnt=L.get(0);
                        Ant=LecAnt.getFecha();
                    } else {
                        LecAct=L.get(ind-1);
                        Act=LecAct.getFecha();
                        LecAnt=L.get(ind-2);
                        Ant=LecAnt.getFecha();
                    }
                    long lapso = ChronoUnit.DAYS.between(Act,Ant);
                    int dias=(int) lapso;
                    double consumo=LecAct.getValorActual()-LecAnt.getValorActual();
                    double cargoPlan=p.getCargoBase();
                    
                    Factura f= new Factura(n,ab,m,p,emision,Ant,Act,dias,LecAnt,consumo,cargoPlan,total);
                    facturasAb.add(f);
                    String texto=f.toString();
                    mensaje+=texto;
                            }
                Correo.enviarCorreo(correo,"Detalle Facturas",mensaje);
            }
        }
        

        
        
    } 
    public String toString(){
        return "Usuario Administrador:\n" + super.toString();
    }
}
