/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medidores;

import P_info.Lectura;
import Medidores.Medidor;
import P_info.Plan;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Kevin Vargas
 */
public class MedidorAnalogico extends Medidor {
    private double KilovatiosConsumidos;

    public MedidorAnalogico(double KilovatiosConsumidos, String codigo, String provincia, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDateTime ultimaFechaCobrada, LocalDateTime consumoUltimaFactura) {
        super(codigo, provincia, direccion, costoKwh, planContratado, lecturas, ultimaFechaCobrada, consumoUltimaFactura);
        this.KilovatiosConsumidos = KilovatiosConsumidos;
    }

    public double calcularValorPagar(LocalDateTime fechaAccion){
        Plan p = super.getPlanContratado();
        double total= p.getCargoBase()+  (p.getCostoKwh()*this.KilovatiosConsumidos);
        return total;
    }
    
    
}
