/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pmedidor;

import P_info.Lectura;
import Pmedidor.Medidor;
import Pmedidor.MedidorInteligente;
import P_info.Plan;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author user
 */

//import com.mycompany.proyecto1_grupo11.Medidor;
public class MedidorInteligente extends Medidor {
    private int horaspico;
    private double telemetría;
    private double totalpagar;
    private double PrecioKwPlan;
    private double KilovatiosConsumidosNoPico;
    private double KilovatiosConsumidosPico;

    public MedidorInteligente(int horaspico, double telemetría, double totalpagar, double PrecioKwPlan, double KilovatiosConsumidosNoPico, double KilovatiosConsumidosPico, String codigo, String provincia, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDateTime ultimaFechaCobrada, LocalDateTime consumoUltimaFactura) {
        super(codigo, provincia, direccion, costoKwh, planContratado, lecturas, ultimaFechaCobrada, consumoUltimaFactura);
        this.horaspico = horaspico;
        this.telemetría = telemetría;
        this.totalpagar = totalpagar;
        this.PrecioKwPlan = PrecioKwPlan;
        this.KilovatiosConsumidosNoPico = KilovatiosConsumidosNoPico;
        this.KilovatiosConsumidosPico = KilovatiosConsumidosPico;
    }

    public int getHoraspico() {
        return horaspico;
    }

    public double getTelemetría() {
        return telemetría;
    }

    public double getTotalpagar() {
        return totalpagar;
    }

    public double getPrecioKwPlan() {
        return PrecioKwPlan;
    }

    public double getKilovatiosConsumidosNoPico() {
        return KilovatiosConsumidosNoPico;
    }

    public double getKilovatiosConsumidosPico() {
        return KilovatiosConsumidosPico;
    }
    
    public double calcularValorPagar(LocalDateTime fechaAccion){
        double total =  getPrecioKwPlan()* getKilovatiosConsumidosNoPico();
        return 0;
    }
}
