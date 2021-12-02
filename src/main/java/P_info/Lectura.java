/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import java.time.LocalDate;

/**
 *
 * @author ROBERTO
 */
public class Lectura {
    private LocalDate fecha;
    private double valorActual;
    
    public Lectura(LocalDate fecha, double valorActual){
        this.fecha = fecha;
        this.valorActual = valorActual;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    @Override
    public String toString() {
        return "\nFecha: " + fecha +"\n"+  "Valor actual:" + valorActual;
    }
    
    
}
