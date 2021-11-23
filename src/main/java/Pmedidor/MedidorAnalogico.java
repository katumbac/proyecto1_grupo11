/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pmedidor;

import Pmedidor.Medidor;
import P_info.Plan;

/**
 *
 * @author Kevin Vargas
 */
public class MedidorAnalogico extends Medidor {
    private double CargoBasePlan;
    private double PrecioKwPlan;
    private double KilovatiosConsumidos;

    public MedidorAnalogico(String codigo, String provincia, double costoKwh, Plan planContratado,double CargoBasePlan, double PrecioKwPlan, double KilovatiosConsumidos) {
        super(codigo,provincia,costoKwh,planContratado);
        this.CargoBasePlan = CargoBasePlan;
        this.PrecioKwPlan = PrecioKwPlan;
        this.KilovatiosConsumidos = KilovatiosConsumidos;
    }
    
    public double calcularConsumo(double CargoBasePlan, double PrecioKwPlan, double KilovatiosConsumidos){
        double totalPagar = CargoBasePlan + (PrecioKwPlan*KilovatiosConsumidos);
        return totalPagar;
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
