/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import Medidores.Medidor;
import Usuarios.usuarioAbonado;
import java.time.LocalDateTime;

/**
 *
 * @author ROBERTO
 */
public class Factura {
    private int numeroFactura;
    private String nombreAbonado;
    private String codigoMedidor;
    private String nombrePlan;
    private LocalDateTime fechaEmision;
    private LocalDateTime fechaLecturaAnt;
    private LocalDateTime fechaLecturaAct;
    private int diasFacturados;
    private Lectura lecturaAnt;
    private double consumo;
    private double cargoPlan;
    private double totalPagar;

    public Factura(int numeroFactura, usuarioAbonado nombreAbonado, Medidor codigoMedidor, Plan nombrePlan, LocalDateTime fechaEmision, LocalDateTime fechaLecturaAnt, LocalDateTime fechaLecturaAct, int diasFacturados, Lectura lecturaAnt, double consumo, double cargoPlan, double totalPagar) {
        this.numeroFactura = numeroFactura;
        this.nombreAbonado = nombreAbonado.getNombre();
        this.codigoMedidor = codigoMedidor.getCodigo();
        this.nombrePlan = nombrePlan.getNombre();
        this.fechaEmision = fechaEmision;
        this.fechaLecturaAnt = fechaLecturaAnt;
        this.fechaLecturaAct = fechaLecturaAct;
        this.diasFacturados = diasFacturados;
        this.lecturaAnt = lecturaAnt;
        this.consumo = consumo;
        this.cargoPlan = cargoPlan;
        this.totalPagar = totalPagar;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public String getNombreAbonado() {
        return nombreAbonado;
    }

    public String getCodigoMedidor() {
        return codigoMedidor;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public LocalDateTime getFechaLecturaAnt() {
        return fechaLecturaAnt;
    }

    public LocalDateTime getFechaLecturaAct() {
        return fechaLecturaAct;
    }

    public int getDiasFacturados() {
        return diasFacturados;
    }

    public Lectura getLecturaAnt() {
        return lecturaAnt;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getCargoPlan() {
        return cargoPlan;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    


    @Override
    public String toString() {
        return "Factura\n" + "\n"+ "Número de factura: " + numeroFactura + "\n"+ "Nombre del Abonado: " + nombreAbonado + "\n"+ "Código del Medidor: " + codigoMedidor + "\n"+ "Nombre del plan: " + nombrePlan + "\n"+ "Fecha de emisión: " + fechaEmision + "\n"+ "Fecha de lectura anterior: " + fechaLecturaAnt + "\n"+ "Fecha de lectura actual: " + fechaLecturaAct + "\n"+ "Días Facturados: " + diasFacturados + "\n"+ "Lectura anterior: " + lecturaAnt + "\n"+ "Consumo: " + consumo + "\n"+ "Cargo del plan: " + cargoPlan + "\n"+ "Total a pagar: " + totalPagar+"\n";
    }
    
    

 
}
