/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivaldo;

import java.io.File;

/**
 *
 * @author T-107
 */
import java.io.*;
public class LeerMensajito {
    public static void main(String[] args) throws Exception{
        
        
        //Ahora vamos a leerlo ESTA ES OTRA CLASE
        //el primer paso es obtener el archivo que se guardo
          File file=new File("C:\\sucio.xxx");
          //El segudno pase es establacer la ruta de la información
          FileInputStream fis=new FileInputStream(file);
          
         //Creamos el objeto que leera
          ObjectInputStream ois=new ObjectInputStream(fis);
          //AHORA sí, a leer el archivo
          String algodon=(String) ois.readObject();
          System.out.println("algodon");
    }
}
