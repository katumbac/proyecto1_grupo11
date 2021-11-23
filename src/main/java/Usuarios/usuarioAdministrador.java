/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;
import Usuarios.usuarioAbonado;
import Usuarios.Usuario;
import P_info.Plan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Burgos
 */
public class usuarioAdministrador extends Usuario {
<<<<<<< HEAD
    
=======
    public ArrayList<Plan> planes=new ArrayList<>();
<<<<<<< HEAD
    public ArrayList<Usuario> usuarios=new ArrayList<>();
    
=======
>>>>>>> 6a76c179f38c928edd59f552a44abfe328e32037
>>>>>>> 868896194818f810e22b94534865dadb9cc3d742
    public usuarioAdministrador(String nombre, String contrasenia) {
        super(nombre, contrasenia);
    }
    /**
     * Registrar Plan
     * En esta opción el administrador ingresa el nombre del plan, el costo de kilovatio
     * hora, los nombres de las provincias en las que el plan estaría disponible, el cargo
     * base y las horas pico. No puede haber dos planes con el mismo nombre.
     **/
    public void registrarPlan(String nombre, double costoKwh, ArrayList provincias, double cargoBase, String horaPico) {
        Plan p = new Plan(nombre,costoKwh,provincias,cargoBase,horaPico);
        boolean ingresar=true;
        if(planes == null || planes.size() == 0) {
          ingresar=true;
          } else {
        for(Plan i:planes) {
          String n=i.getNombre();
          if(n.equals(nombre)) {
            ingresar=false;
          } else {
            ingresar=true;
          }
        }
          }
          if(ingresar) {
            planes.add(p);
          } else {
            System.out.println("Se debe ingresar un Plan con otro nombre.");
          }
    }
    /**El sistema pide el número de cédula del abonado. Si no existe un abonado con el
     * número de cédula ingresado se procede a pedir el nombre de este y su correo y a
     * registrarlo en el sistema (el nombre de usuario será la cédula del abonado y la
     * contraseña es un valor al azar que contengan 8 caracteres al menos una letra
     * mayúscula y un dígito). A continuación, se pide ingresar la dirección donde se
     * instalará el medidor, el tipo de medidor (analógico o inteligente) y el tipo de plan que
     * se aplica para el medidor. Si los datos son válidos se procede a registrar el medidor el
     * cual tendrá un código único. Al final se debe enviar un correo al abonado con los
     * datos del medidor y en caso se registrará un nuevo abonado se debe enviar el
     * usuario y contraseña de este.**/
    public void registrarMedidor(String cedula) {
        boolean nuevo=true;
      String alfa="abcdefghijklmnopqrstuvwxyz";
      for (Usuario u:usuarios){
        if (u instanceof usuarioAbonado) {
          usuarioAbonado ab=(usuarioAbonado)u;
          String id=ab.getCedula();
          if (id.equals(cedula)){
          nuevo=false;
          }
        }
      }


      if (nuevo==true){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su correo eléctronico: ");
        String correo = sc.nextLine();

        String contrasenia="";
        for(int i=0;i<8;i++){
          Double a = Math.random()*8;
          int ind=a.intValue();
          Double tipo=Math.random()*3;
          int t=tipo.intValue();
          switch(t) {
            case 1: contrasenia+=alfa.charAt(ind);
            break;
            case 2: contrasenia+=ind;
            break;
            default: contrasenia+=alfa.toUpperCase().charAt(ind);
            break;
      }
      }
    }
    }
    
    public void simularMediciones () {
    }
    
    public void realizarFacturacion() {
    } 
}
