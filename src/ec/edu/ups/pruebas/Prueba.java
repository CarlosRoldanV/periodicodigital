/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.RedSocial;

/**
 *
 * @author Estudiante
 */
public class Prueba {
    public static void  main (String [] args){
        RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("Fceboook");
        facebook.setUrl("www.facebook.com");
        
        int cod = facebook.getCodigo();
        System.out.println("Codigo: "+cod);
        
        String nom = facebook.getNombre();
        System.out.println("Nombre: "+nom);
        
        String url = facebook.getUrl();
        System.out.println("Url: "+url);
    }
}
