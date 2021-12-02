/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import Medidores.Medidor;
import Medidores.MedidorAnalogico;
import Medidores.MedidorInteligente;
import Usuarios.Usuario;
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
public class DatosCreadosInternamente {
    private ArrayList<Plan> planes;
    private ArrayList<Medidor> medidores;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Lectura> lecturas;
    public Scanner sc;

    public DatosCreadosInternamente(){

        usuarios = new ArrayList<Usuario>();
        planes=new ArrayList<Plan>();
        medidores = new ArrayList<Medidor>();
        lecturas = new ArrayList<Lectura>();
        
        //Dos Operarios
        usuarios.add(new usuarioOperario("op","1234"));
        usuarios.add(new usuarioOperario("operario2","4321"));
        
        //Dos planes
        
        //PLAN 1
        ArrayList<Provincias> ProvinciasSector1  = new ArrayList();
        ArrayList<HorasPico> horapico1 = new ArrayList<>();

        ProvinciasSector1.add(Provincias.El_Oro);
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
        horapico2.addAll(Arrays.asList(new HorasPico(tini1, tfin1) ,new HorasPico(tini2,tfin2)));
        Plan plan2 = new Plan("Plan2", 5.00, ProvinciasSector2, 6.00, horapico2);
        planes.add(plan2);
        

        
        //Dos Abonados
        //Uno de los abonados debe tener dos medidores: uno de tipo analógico y uno de tipo inteligente
	//El otro abonado debe tener un medidor analógico 
        //usuarioAbonado(String nombreUsuario, String cedula, String correoElectronico, ArrayList<Medidor> medidores, ArrayList<Factura> facturas, String nombre, String contrasenia)
        ArrayList<Lectura> lecturas1 = new ArrayList<>();
        ArrayList<Factura> facturas1 = new ArrayList<>();
        ArrayList<Medidor> medidores1 = new ArrayList<>();
               
        LocalDate fechaini= LocalDate.of(2023,03,04);
        LocalDate fechafin= LocalDate.of(2024,03,04);
        Lectura lect1 = new Lectura(fechaini, 5.00);      
        lecturas1.add(lect1);
        lecturas.add(lect1);
        //MedidorAnalogico(double KilovatiosConsumidos, String codigo, String provincia, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDateTime ultimaFechaCobrada, LocalDateTime consumoUltimaFactura)
        medidores1.add(new MedidorAnalogico("COD1","Portete",3.00, plan1 ,lecturas1, fechaini,fechafin,5.00));
        
        
        //Analogico
        usuarios.add(new usuarioAbonado("Abonado1", "0909123456", "ktumbaco2002@gmail.com", medidores1, facturas1, "operario1","1234"));
        

        //analogico e inteligente
        ArrayList<Medidor> medidores2 = new ArrayList<>();
        
        medidores2.add(new MedidorAnalogico("COD2","Argentina",3.00, plan2 ,lecturas1, fechaini,fechafin,5.00));
        
        //MedidorInteligente(double telemetria, double KilovatiosConsumidosNoPico, double KilovatiosConsumidosPico, String codigo, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDate ultimaFechaCobrada, LocalDate consumoUltimaFactura)
        medidores2.add(new MedidorInteligente(5.40,50,60,"COD12","Portete",5.00,plan2,lecturas1,fechaini,fechafin));
        LocalDate fechafin2= LocalDate.of(2024,03,04);
        //medidor2.add(new MedidorInteligente(5.00,3.00,6.00,8.00 "COD2", "El_Oro","Portete",3.00, plan1 ,lecturas1, fechaini, fechafin2));
        
        
        LocalDate fecha1= LocalDate.of(2024,03,04);
        //Lectura lecturas2 = new Lectura(fecha1, 5.00);
        LocalDate fechaemi = LocalDate.of(2020,03,04);
        LocalDate fechaLecturaAct = LocalDate.now();
        LocalDate fechaLecturaAnt = LocalDate.of(2020,02,04);
        //Factura(int numeroFactura, usuarioAbonado nombreAbonado, Medidor codigoMedidor, Plan nombrePlan, LocalDate fechaEmision, LocalDate fechaLecturaAnt, LocalDate fechaLecturaAct, int diasFacturados, Lectura lecturaAnt, double consumo, double cargoPlan, double totalPagar)
        ArrayList<Factura> facturas2 = new ArrayList<>();
        Lectura lectAnt = new Lectura(fechaLecturaAnt, 5);
        //Factura fact = new Factura(001, "Abonado2", "COD1", plan1, fechaemi, fechaLecturaAnt, fechaLecturaAct,5,lectAnt, 5.00, 3.00, 1);
        //facturas2.add(fact);
        usuarios.add(new usuarioAbonado("Abonado2", "0909654321", "ktumbaco2002@gmail.com", medidores2, facturas2, "operario2","4321"));
        
        medidores.addAll(medidores1);
        medidores.addAll(medidores2);


        
        //registrar dos  mediciones
        String codp = "COD2";
        String codp1 = "COD3";
        //usuarioOperario op = null;
        //op.registrarMedicion(codp);
        //op.registrarMedicion(codp1);
        usuarios.add(new usuarioAdministrador(planes, usuarios, medidores, "admin", "superadmin"));

    }

    public ArrayList<Lectura> getLecturas() {
        return lecturas;
    }

    public void setLecturas(ArrayList<Lectura> lecturas) {
        this.lecturas = lecturas;
    }

    public ArrayList<Plan> getPlanes() {
        return planes;
    }

    public ArrayList<Medidor> getMedidores() {
        return medidores;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
}
