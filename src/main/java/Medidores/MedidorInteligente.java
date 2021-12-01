/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medidores;

import P_info.Lectura;
import Medidores.Medidor;
import P_info.Plan;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author user
 */

//import com.mycompany.proyecto1_grupo11.Medidor;
public class MedidorInteligente extends Medidor {
    private int horaspico;
    private double telemetria;
    private double KilovatiosConsumidosNoPico;
    private double KilovatiosConsumidosPico;

    public MedidorInteligente(int horaspico, double telemetria, double KilovatiosConsumidosNoPico, double KilovatiosConsumidosPico, String codigo, String provincia, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDate ultimaFechaCobrada, LocalDate consumoUltimaFactura) {
        
        super(codigo, provincia, direccion, costoKwh, planContratado, lecturas, ultimaFechaCobrada, consumoUltimaFactura);
        this.horaspico = horaspico;
        this.telemetria = telemetria;
        this.KilovatiosConsumidosNoPico = KilovatiosConsumidosNoPico;
        this.KilovatiosConsumidosPico = KilovatiosConsumidosPico;
    }

    

    public int getHoraspico() {
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
        return "Medidor Inteligente\n" + super.toString() + "Horas Pico: " + horaspico + "\n"+ "Telemetría: " + telemetria + "\n"+ "Kilovatios consumidos en horas no pico: " + KilovatiosConsumidosNoPico + "\n"+ "Kilovatios consumidos en horas pico: " + KilovatiosConsumidosPico;
    }
    
    
}
