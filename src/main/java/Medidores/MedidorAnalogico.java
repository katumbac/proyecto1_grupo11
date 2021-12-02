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
 * @author Kevin Vargas
 */
public class MedidorAnalogico extends Medidor {
    private double KilovatiosConsumidos;

    public MedidorAnalogico(String codigo, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDate ultimaFechaCobrada, LocalDate consumoUltimaFactura,double KilovatiosConsumidos) {
        super(codigo, direccion, costoKwh, planContratado, lecturas, ultimaFechaCobrada, consumoUltimaFactura);
        this.KilovatiosConsumidos = KilovatiosConsumidos;
    }

    public double calcularValorPagar(LocalDate fechaAccion){
        Plan p = super.getPlanContratado();
        double total= p.getCargoBase()+  (p.getCostoKwh()*this.KilovatiosConsumidos);
        return total;
    }

    @Override
    public String toString() {
        return "Medidor Analógico\n" + super.toString() + "Kilovatios consumidos: " + KilovatiosConsumidos+"\n";
    }

    public double getKilovatiosConsumidos() {
        return KilovatiosConsumidos;
    }

    public void setKilovatiosConsumidos(double KilovatiosConsumidos) {
        this.KilovatiosConsumidos = KilovatiosConsumidos;
    }
    
    
}
