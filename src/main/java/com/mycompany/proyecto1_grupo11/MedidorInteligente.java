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
    public int horaspico;
    public String provincia;
    public double telemetría;
    public double totalpagar;
    private String codigo;
    private double PrecioKwPlan;
    private double KilovatiosConsumidosNoPico;
    private double KilovatiosConsumidosPico;
    private Plan planContratado;
    
    
    public MedidorInteligente(double telemetría, String horaspico){
        //Costo varia en las horas pico
    }
    /**
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
