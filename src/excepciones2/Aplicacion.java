/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;
import cuestionario.*;
import java.util.*;

/**
 *
 * @author PERENÉ
 */
public class Aplicacion {
    public static void main (String[] args ){
        // Con el modelo construido debemos representar nuestra pregunta
        //y mostrarla
        //primero creamos las opciones
        Opcion op1=new Opcion ();
        op1.setTitulo("Londres");
        op1.setCorrecta(false);
        
        Opcion op2=new Opcion ();
        op2.setTitulo("Roma");
        op2.setCorrecta(false);
        
        Opcion op3=new Opcion ();
        op3.setTitulo("Paris");
        op3.setCorrecta(true);
        
        Opcion op4=new Opcion ();
        op4.setTitulo("Oslo");
        op4.setCorrecta(false);
        
        //sigue arreglo de opciones
        Opcion [] opciones= {op1, op2,op3, op4};
        // ya podemos generar nuestra preunta
        Pregunta p1=new Pregunta();
        p1.setTitulo ("¿Cual es la capital de Francia?");
        p1.setOpciones (opciones);
        
        
        //para saber si es correcto, vamos a mostrarlo
        
        // vamos adaptar el cuestionario a lo que ya teniamos
        Cuestionario c=new Cuestionario();
        //creamos el list 
        List<Pregunta> preguntas =new ArrayList<>();
        //se agrega a este list la unica pregunta que se tiene
        preguntas.add(p1);
        // a este list le vamos a proporcionar el valor correspondiente 
        //cuestionario
        c.setPreguntas(preguntas);
        for (Pregunta p: preguntas ){
         System.out.println(p.getTitulo());
         
         for (Opcion o: opciones){
        System.out.println(o.getTitulo()+" "+o.isCorrecta());
        }
        }
   
   
    }
    public void generarCuestionario (){
        
         // Con el modelo construido debemos representar nuestra pregunta
        //y mostrarla
        //primero creamos las opciones
        Opcion op1=new Opcion ();
        op1.setTitulo("Londres");
        op1.setCorrecta(false);
        
        Opcion op2=new Opcion ();
        op2.setTitulo("Roma");
        op2.setCorrecta(false);
        
        Opcion op3=new Opcion ();
        op3.setTitulo("Paris");
        op3.setCorrecta(true);
        
        Opcion op4=new Opcion ();
        op4.setTitulo("Oslo");
        op4.setCorrecta(false);
        
        //sigue arreglo de opciones
        Opcion [] opciones= {op1, op2,op3, op4};
        // ya podemos generar nuestra preunta
        Pregunta p1=new Pregunta();
        p1.setTitulo ("¿Cual es la capital de Francia?");
        p1.setOpciones (opciones);
        
        
        //para saber si es correcto, vamos a mostrarlo
        
        // vamos adaptar el cuestionario a lo que ya teniamos
        Cuestionario c=new Cuestionario();
        //creamos el list 
        List<Pregunta> preguntas =new ArrayList<>();
        //se agrega a este list la unica pregunta que se tiene
        preguntas.add(p1);
        // a este list le vamos a proporcionar el valor correspondiente 
        //cuestionario
        c.setPreguntas(preguntas);
        for (Pregunta p: preguntas ){
         System.out.println(p.getTitulo());
         
         for (Opcion o: opciones){
        System.out.println(o.getTitulo()+" "+o.isCorrecta());
        }
         
    }
}
}