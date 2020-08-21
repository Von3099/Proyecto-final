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
public class SerializacionPregunta {
    public static void main(String[] args){
       File file=new File ("pregunta");
    try{
      
       //indicamos el sentido de la informacion en est caso es leer, es decir entrada
    FileInputStream fis=new FileInputStream (file);
      
      // Leemos el contenido
      ObjectInputStream ois=new ObjectInputStream (fis);
      //Ahora si leemos. Este renglon es muy complejo
      String recobrado = (String) ois.readObject();
      //Ya termino el renglon dificil, se ve el contenido
    
    System.out.println(recobrado);
      
    } catch (FileNotFoundException e)
    {
      System.out.println("Algo malo ocurrio "+e.getMessage());
    } catch (IOException e){
      System.out.println("Algo malo ocurrio "+e.getMessage());
      
    }catch (ClassNotFoundException e){
      
      System.out.println("Algo malo ocurrio "+e.getMessage());
    }
         System.out.println("Cuando comenzo la primera guerra mundial ");
         System.out.println("Ingrese respuesta correcta ");
         
        
         Respuestas [] respuestas =new Respuestas [4];
         Incisoa a= new Incisoa();
         a.getClass();
         Incisob b=new Incisob();
         b.getClass();
         Incisoc c=new Incisoc();
         c.getClass();
         Incisod d=new Incisod();
         d.getClass();
         respuestas [0]=a;
         respuestas [1]=b;
         respuestas [2]=c;
         respuestas [3]=d;
         
         for (Respuestas a: respuestas){
             System.out.println("Respuesta correcta : "+a.respuestas());
         }
         for (Respuestas r: respuestas ){
             System.out.println("Respuesta incorrecta: "+r.respuestas());
         }
               
                 
                 
         
                    
         
         
  
      
        
    }
    
}
