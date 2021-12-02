/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medidores;

import P_info.Lectura;
import Medidores.Medidor;
import P_info.HorasPico;
import P_info.Plan;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author user
 */

//import com.mycompany.proyecto1_grupo11.Medidor;
public class MedidorInteligente extends Medidor {
    private ArrayList<HorasPico> horaspico;
    private double telemetria;
    private double KilovatiosConsumidosNoPico;
    private double KilovatiosConsumidosPico;

    public MedidorInteligente(double telemetria, double KilovatiosConsumidosNoPico, double KilovatiosConsumidosPico, String codigo, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDate ultimaFechaCobrada, LocalDate consumoUltimaFactura) {
        
        super(codigo, direccion, costoKwh, planContratado, lecturas, ultimaFechaCobrada, consumoUltimaFactura);
        this.telemetria = telemetria;
        this.horaspico = planContratado.getHoraPico();
        this.KilovatiosConsumidosNoPico = KilovatiosConsumidosNoPico;
        this.KilovatiosConsumidosPico = KilovatiosConsumidosPico;
    }

    

    public ArrayList<HorasPico> getHoraspico() {
        return horaspico;
    }

    public double getTelemetria() {
        return telemetria;
    }


    public double getKilovatiosConsumidosNoPico() {
        return KilovatiosConsumidosNoPico;
    }

    public double getKilovatiosConsumidosPico() {
        return KilovatiosConsumidosPico;
    }
    
    public double calcularValorPagar(LocalDate fechaAccion){
        Plan p = super.getPlanContratado();
        
        double total =  p.getCargoBase() + p.getCostoKwh() * this.KilovatiosConsumidosNoPico + 2*p.getCostoKwh()*this.KilovatiosConsumidosPico;
        return total;
    }

    @Override
    public String toString() {
        return "Medidor Inteligente\n" + super.toString() + "Horas Pico: " + horaspico + "\n"+ "Telemetría: " + telemetria + "\n"+ "Kilovatios consumidos en horas no pico: " + KilovatiosConsumidosNoPico + "\n"+ "Kilovatios consumidos en horas pico: " + KilovatiosConsumidosPico+"\n";
    }
    
    
}
