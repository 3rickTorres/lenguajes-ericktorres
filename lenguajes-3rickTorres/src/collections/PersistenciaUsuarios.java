/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.*;

/**
 *
 * @author T-107
 */
public class PersistenciaUsuarios {
    public ArrayList<Usuario> obtenerUsuario(){
       ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
       
       //Empezamos a llenar el Arraylist generico a Usuario
       Direccion d1=new Direccion();
       
       d1.setCalle("Av. México");
       d1.setColinia("Ejidos Tultepec");
       d1.setCp(55130);
       d1.setMunicipio("Ecatepec");
       
       Usuario u1=new Usuario();
       u1.setDireccion(d1);
       u1.setLogin("Juan");
       u1.setPassword("algo");
       
       usuarios.add(u1);
       
       Direccion d2=new Direccion();
       d2.setCalle("Calle La Viga");
       d2.setColinia("Jalapa");
       d2.setCp(55200);
       d2.setMunicipio("Ecatepec");
       
       Usuario u2=new Usuario();
       u2.setDireccion(d2);
       u2.setLogin("Ana");
       u2.setPassword("bien");
       usuarios.add(u2);
       
       Direccion d3=new Direccion();
       d3.setCalle("Sur 44");
       d3.setColinia("Vincent villada");
       d3.setCp(50090);
       d3.setMunicipio("Neza");
       
       Usuario u3=new Usuario();
       u2.setDireccion(d3);
       u2.setLogin("Pedro");
       u2.setPassword("nose");
       usuarios.add(u3);
       
       
                     
       return usuarios;
       
    }
}
