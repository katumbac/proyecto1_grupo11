/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import Pmedidor.Medidor;
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
    private double lecturaAnt;
    private double consumo;
    private double cargoPlan;
    private double totalPagar;

    public Factura(int numeroFactura, usuarioAbonado nombreAbonado, Medidor codigoMedidor, Plan nombrePlan, LocalDateTime fechaEmision, LocalDateTime fechaLecturaAnt, LocalDateTime fechaLecturaAct, int diasFacturados, double lecturaAnt, double consumo, double cargoPlan, double totalPagar) {
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
    
    

 
}
