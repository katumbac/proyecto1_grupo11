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
    private double cargoBase;
    private ArrayList<Provincias> provincias;
    private ArrayList<HorasPico> horaPico;
    
    
    public Plan(String nombre, double costoKwh, ArrayList<Provincias> provincias, double cargoBase, ArrayList<HorasPico> horasPico){
        this.nombre = nombre;
        this.costoKwh = costoKwh;
        this.provincias = provincias;
        this.cargoBase = cargoBase;
        this.horaPico = horasPico;
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

    public ArrayList<Provincias> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincias> provincias) {
        this.provincias = provincias;
    }

    public double getCargoBase() {
        return cargoBase;
    }

    public void setCargoBase(double cargoBase) {
        this.cargoBase = cargoBase;
    }

    public ArrayList<HorasPico> getHoraPico() {
        return horaPico;
    }

    public void setHoraPico(ArrayList<HorasPico> horaPico) {
        this.horaPico = horaPico;
    }

    @Override
    public String toString() {
        return "Plan\n" + "Nombre: " + nombre + "\n"+ "Costo Kwh:" + costoKwh + "\n"+ "Provincias: " + provincias + "\n"+ "Cargo base:" + cargoBase +"\n"+ "Hora pico:" + horaPico +"\n";
    }
    
    
}