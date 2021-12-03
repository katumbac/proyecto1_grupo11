/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medidores;

import P_info.Lectura;
import P_info.Plan;
import P_info.Provincias;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ROBERTO
 */
public abstract class Medidor {
    private String codigo;
    private String direccion;
    private double costoKwh;
    private Plan planContratado;
    private ArrayList<Lectura> lecturas;
    private LocalDate ultimaFechaCobrada;
    private LocalDate consumoUltimaFactura;

    public Medidor(String codigo, String direccion, double costoKwh, Plan planContratado, ArrayList<Lectura> lecturas, LocalDate ultimaFechaCobrada, LocalDate consumoUltimaFactura) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.costoKwh = costoKwh;
        this.planContratado = planContratado;
        this.lecturas = lecturas;
        this.ultimaFechaCobrada = ultimaFechaCobrada;
        this.consumoUltimaFactura = consumoUltimaFactura;
    }
    

    

    public abstract double calcularValorPagar(LocalDate FechaAccion);

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Lectura> getLecturas() {
        return this.lecturas;
    }

    public void setLecturas(ArrayList<Lectura> lecturas) {
        this.lecturas = lecturas;
    }

    public LocalDate getUltimaFechaCobrada() {
        return ultimaFechaCobrada;
    }

    public void setUltimaFechaCobrada(LocalDate ultimaFechaCobrada) {
        this.ultimaFechaCobrada = ultimaFechaCobrada;
    }

    public LocalDate getConsumoUltimaFactura() {
        return consumoUltimaFactura;
    }

    public void setConsumoUltimaFactura(LocalDate consumoUltimaFactura) {
        this.consumoUltimaFactura = consumoUltimaFactura;
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
        return "Código: " + codigo + "\n"+ "Provincias: " + planContratado.getProvincias() + "\n"+ "Direccion: " + direccion + "\n"+ "Costo Kwh: " + costoKwh + "\n"+ "Plan contratado: " + planContratado.getNombre() + "\n"+ "Lecturas:" + lecturas + "\n"+ "Última fecha cobrada: " + ultimaFechaCobrada + "\n"+ "Consumo última factura: " + consumoUltimaFactura+"\n";
    }

    
    
    
}
