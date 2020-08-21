/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;
import java.io.*;

/**
 *
 * @author PERENÉ
 */
public class SerializacionExtra {
    public static void main(String[] args){
        String objeto="Ejercicio extra ";
        File file=new File ("pregunta");
        try{
            FileOutputStream pre=new FileOutputStream(file);
            ObjectOutputStream gun=new ObjectOutputStream (pre);
            gun.writeObject(objeto);
            gun.close();
            pre.close();
              System.out.println("Archivo generado con exito ");
        }catch (FileNotFoundException e)
    { 
       System.out.println("Algo malo ocurrio  "+e.getMessage());
    }
    catch (IOException e)
    {
     System.out.println("Algo malo ocurrio "+e.getMessage());
    }
    
    }
    
}
