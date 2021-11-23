/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medidores;

import P_info.Lectura;
import P_info.Plan;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author ROBERTO
 */
public abstract class Medidor {
    private String codigo;
    private String provincia;
    private String direccion;
    private double costoKwh;
    private Plan planContratado;
    private ArrayList<Lectura> lecturas;
    private LocalDateTime ultimaFechaCobrada;
    private LocalDateTime consumoUltimaFactura;

    public Medidor(String codigo, String provincia, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDateTime ultimaFechaCobrada, LocalDateTime consumoUltimaFactura) {
        this.codigo = codigo;
        this.provincia = provincia;
        this.direccion = direccion;
        this.costoKwh = costoKwh;
        this.planContratado = planContratado;
        this.lecturas = lecturas;
        this.ultimaFechaCobrada = ultimaFechaCobrada;
        this.consumoUltimaFactura = consumoUltimaFactura;
    }
    

    

    public abstract double calcularValorPagar(LocalDateTime FechaAccion);

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getCostoKwh() {
        return costoKwh;
    }

    public void setCostoKwh(double costoKwh) {
        this.costoKwh = costoKwh;
    }

    public Plan getPlanContratado() {
        return planContratado;
    }

    public void setPlanContratado(Plan planContratado) {
        this.planContratado = planContratado;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\n"+ "Provincias: " + provincia + "\n"+ "Direccion: " + direccion + "\n"+ "Costo Kwh: " + costoKwh + "\n"+ "Plan contratado: " + planContratado + "\n"+ "Lecturas:" + lecturas + "\n"+ "Última fecha cobrada: " + ultimaFechaCobrada + "\n"+ "Consumo última factura: " + consumoUltimaFactura+"\n";
    }
    
    
}
