/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pmedidor;

import P_info.Plan;

/**
 *
 * @author ROBERTO
 */
public class Medidor {
    private String codigo;
    private String provincia;
    private double costoKwh;
    private Plan planContratado;
    
    public void calcularConsumo(){}

    public Medidor(String codigo, String provincia, double costoKwh, Plan planContratado) {
        this.codigo = codigo;
        this.provincia = provincia;
        this.costoKwh = costoKwh;
        this.planContratado = planContratado;
    }

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
    
}
