/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import java.time.LocalDateTime;

/**
 *
 * @author ROBERTO
 */
public class Lectura {
    private LocalDateTime fecha;
    private double valorActual;
    
    public Lectura(LocalDateTime fecha, double valorActual){
        this.fecha = fecha;
        this.valorActual = valorActual;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
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
        return "Lectura\n" + "Fecha: " + fecha +"\n"+  "Valor actual:" + valorActual + "\n";
    }
    
    
}
