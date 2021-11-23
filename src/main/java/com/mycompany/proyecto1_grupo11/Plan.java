/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_grupo11;
import java.util.ArrayList;
/**
 *
 * @author ROBERTO
 */
public class Plan {
    
    private String nombre;
    private double costoKwh;
    private ArrayList provincias;
    private double cargoBase;
    private String horaPico;
    
    public Plan(String nombre, double costoKwh, ArrayList provincias){
        this.nombre = nombre;
        this.costoKwh = costoKwh;
        this.provincias = provincias;
        this.cargoBase = 0;
    }
    public Plan(String nombre, double costoKwh, ArrayList provincias, double cargoBase, String horaPico){
        this.nombre = nombre;
        this.costoKwh = costoKwh;
        this.provincias = provincias;
        this.cargoBase = cargoBase;
        this.horaPico = horaPico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoKwh() {
        return costoKwh;
    }

    public void setCostoKwh(double costoKwh) {
        this.costoKwh = costoKwh;
    }

    public ArrayList getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList provincias) {
        this.provincias = provincias;
    }

    public double getCargoBase() {
        return cargoBase;
    }

    public void setCargoBase(double cargoBase) {
        this.cargoBase = cargoBase;
    }

    public String getHoraPico() {
        return horaPico;
    }

    public void setHoraPico(String horaPico) {
        this.horaPico = horaPico;
    }
}