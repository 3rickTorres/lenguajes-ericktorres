/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivaldo;

/**
 *
 * @author T-107
 */

import java.io.*;
public class InterfazDeUsuario {
    public static void main(String[] args)throws FileNotFoundException, IOException{
        //primero generamos el archivo a guardar
        File file=new File("C:\\sucio.xxx");
        //Indicar si vamos a leer o guardad algo en ese archivo
        
        FileOutputStream fos=new FileOutputStream(file);
        //Ponemos algo en el archivaldo
        String mensajito="Este mensajito es muy básico";
        
    //Ahora si guardamos este mensajito serlizado
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //guardamos
        oos.writeObject(mensajito);
        System.out.println("Se guardo tu mensajito");
    }
}
