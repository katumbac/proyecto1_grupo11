/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import Usuarios.Usuario;

/**
 *
 * @author user
 */
public class Main {
   
    public static void main(String[] args){
        String mensajes = "kevin vargas";
        
        System.out.println(mensajes);
        
        Usuario n = new Usuario("rocaenca","12345");
        n.iniciarSesion();
                
    }
}
