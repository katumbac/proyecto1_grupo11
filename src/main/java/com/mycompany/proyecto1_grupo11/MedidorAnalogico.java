/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_grupo11;

/**
 *
 * @author Kevin Vargas
 */
public class MedidorAnalogico {
    private double CargoBasePlan;
    private double PrecioKwPlan;
    private double KilovatiosConsumidos;

    public MedidorAnalogico(double CargoBasePlan, double PrecioKwPlan, double KilovatiosConsumidos) {
        this.CargoBasePlan = CargoBasePlan;
        this.PrecioKwPlan = PrecioKwPlan;
        this.KilovatiosConsumidos = KilovatiosConsumidos;
    }
    
    public double calcularConsumo(double CargoBasePlan, double PrecioKwPlan, double KilovatiosConsumidos){
        double totalPagar = CargoBasePlan + (PrecioKwPlan*KilovatiosConsumidos);
        return totalPagar;
    }
    
    
    
    
}
