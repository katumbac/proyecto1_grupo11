/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;
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
    private ArrayList horaPico;
    
    
    public Plan(String nombre, double costoKwh, ArrayList provincias, double cargoBase, ArrayList horaPico){
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

    public ArrayList getHoraPico() {
        return horaPico;
    }

    public void setHoraPico(ArrayList horaPico) {
        this.horaPico = horaPico;
    }
}