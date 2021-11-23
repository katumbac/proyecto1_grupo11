/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_grupo11;

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
    
    
    
        //Costo varia en las horas pico
<<<<<<< HEAD
    
    
    public MedidorInteligente(double CargoBasePlan, double PrecioKwPlan, double KilovatiosConsumidos, double KilovatiosConsumidosPico) {
        this.PrecioKwPlan = CargoBasePlan;
        this.PrecioKwPlan = PrecioKwPlan;
=======

    public MedidorInteligente(int horaspico, double telemetría, double totalpagar, double PrecioKwPlan, double KilovatiosConsumidosNoPico, double KilovatiosConsumidosPico, String codigo, String provincia, double costoKwh, Plan planContratado) {
        super(codigo, provincia, costoKwh, planContratado);
        this.horaspico = horaspico;
        this.telemetría = telemetría;
        this.totalpagar = totalpagar;
        this.PrecioKwPlan = PrecioKwPlan;
        this.KilovatiosConsumidosNoPico = KilovatiosConsumidosNoPico;
>>>>>>> 181706459d50788289a8ebee8ec7982dfb97ca77
        this.KilovatiosConsumidosPico = KilovatiosConsumidosPico;
    }
    /**
    public MedidorInteligente(double CargoBasePlan, double PrecioKwPlan, double KilovatiosConsumidos, double KilovatiosConsumidosNoPico) {
        this.PrecioKwPlan = CargoBasePlan;
        this.PrecioKwPlan = PrecioKwPlan;
        this.KilovatiosConsumidosNoPico = KilovatiosConsumidosNoPico;
    }
    
    public void setMedidorInteligente(){
      
      * 
    }

    public int getsetMedidorInteligente(){
      
    }*/
    
    public double total_pagar(double CargoBasePlan, double PrecioKwPlan, double KilovatiosConsumidosNoPico, double KilovatiosConsumidosPico ){
        this.totalpagar = CargoBasePlan + (PrecioKwPlan*KilovatiosConsumidosNoPico) +  2*PrecioKwPlan*KilovatiosConsumidosPico;
        return totalpagar;
    }
}
