/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import Medidores.Medidor;
import Usuarios.Usuario;
import Usuarios.usuarioAbonado;
import Usuarios.usuarioAdministrador;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class datoscreadorinternamente {
    public datoscreadorinternamente(){
        
        Usuario usu = new Usuario("katumbac","0405");
        usuarioAdministrador usuadmi = new usuarioAdministrador("admin", "superadmin");
        //usuarioAbonado usuabo = new usuarioAbonado("Roberto", "090909", "robet@gmail.com", ArrayList<Medidor>, ArrayList<Factura> facturas, "re", "1234");
        //emp1.incrementarItemsVendidos(4);//este metodo no esta disponible en emp1
        System.out.println(usu); //llama al metodo toString() en Empleado

    }
}
