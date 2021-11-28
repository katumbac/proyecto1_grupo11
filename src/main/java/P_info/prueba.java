/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class prueba {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Fecha inicio: ");
        System.out.print("Fecha inicio: ");
        String fechIni = sc.nextLine();
        sc.nextLine();
        /**
         * 
        System.out.print("Fecha Fin: ");
        String fechFin = sc.nextLine();
        LocalDate date2 = LocalDate.parse(fechIni,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.print(date2);*/

        //fecha
        //hora
        sc.nextLine();
        LocalTime time2= LocalTime.parse("08:20:16");
        System.out.print(time2);

        LocalTime timeActual= LocalTime.now();
        System.out.print(timeActual);

        //obtenerinfo

        int horaActual= timeActual.getHour();
        System.out.println(horaActual);

        //operaciones
        LocalTime timeDespues= timeActual.plusHours(2).plusMinutes(40);
        System.out.print(timeDespues);
    }
}
