/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pmedidor;

import P_info.Lectura;
import Pmedidor.Medidor;
import P_info.Plan;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Kevin Vargas
 */
public class MedidorAnalogico extends Medidor {
    private double CargoBasePlan;
    private double PrecioKwPlan;
    private double KilovatiosConsumidos;

    public MedidorAnalogico(double CargoBasePlan, double PrecioKwPlan, double KilovatiosConsumidos, String codigo, String provincia, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDateTime ultimaFechaCobrada, LocalDateTime consumoUltimaFactura) {
        super(codigo, provincia, direccion, costoKwh, planContratado, lecturas, ultimaFechaCobrada, consumoUltimaFactura);
        this.CargoBasePlan = CargoBasePlan;
        this.PrecioKwPlan = PrecioKwPlan;
        this.KilovatiosConsumidos = KilovatiosConsumidos;
    }

    
    
    public double calcularValorPagar(LocalDateTime fechaAccion){
        return 0;
    }

    public double getCargoBasePlan() {
        return CargoBasePlan;
    }

    public void setCargoBasePlan(double CargoBasePlan) {
        this.CargoBasePlan = CargoBasePlan;
    }

    public double getPrecioKwPlan() {
        return PrecioKwPlan;
    }

    public void setPrecioKwPlan(double PrecioKwPlan) {
        this.PrecioKwPlan = PrecioKwPlan;
    }

    public double getKilovatiosConsumidos() {
        return KilovatiosConsumidos;
    }

    public void setKilovatiosConsumidos(double KilovatiosConsumidos) {
        this.KilovatiosConsumidos = KilovatiosConsumidos;
    }
    
    
    
    
}
