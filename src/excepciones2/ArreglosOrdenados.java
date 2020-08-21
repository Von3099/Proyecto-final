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
public class ArreglosOrdenados {
    public static void main  (String [] args){
        //Los arreglos mutable se dividen en dos grandes grupos
        //Mutables y ordenados: List y la class ArrayList
        //Mutables y desordenados: Set y HashSet
        //Primero veremos los aggreglos ordenados
        //estos arreglos ademas de tener cierto orden aceptan repeticion
        List<Integer> elementos= new ArrayList<> ();
        //Lo llenamos
        elementos.add(5);
        elementos.add (-6);
        elementos.add (24);
        elementos.add(5);
        //Para recorrer el arreglo usamos el ciclo for mejorado
        for (Integer x:elementos ){
            System.out.println(x);
        }
        //Ahora vamos a ver los de la familia de los Set y HashSet
        // Estan desordenados y  no aceptan repeticion
        System.out.println ("---------------------------------");
        Set<Integer> otros=new HashSet<>();
        otros.add(5);
        otros.add(-6);
        otros.add (24);
        otros.add (5);
        for (Integer x: otros){
            System.out.println (x);
        }
        //para ver el tamaño de estos arreglos existe el metodo size();
        System.out.println ("El tamaño del primer arreglo es "+elementos.size ());
        //para buscar un elemento en los List y ArrayList usamos el metodo
        //elementAt(indice)
        //Vamos a obtener el elemento -6 del primer arreglo
        System.out.println("Obtenemos el -6"+elementos.get(1));
        //El siguiente metodo es para remover un elemento 
        System.out.println("Quitamos el -6 "+elementos.remove(1));
        //Para darnos cuenta que lo removio volvemos a aiterar el arreglo
        for (Integer x: elementos){
            System.out.println (x);
        }
       
       //Si quieres sustituir en un indice en particular un elemento usas el metodo set
       //como ejemplo; en este arreglo vamos a sustituir el 24 por el numero 0
       //este metodo en sistemas reales es para actualizar{
       System.out.println("-------------------------------");
       elementos.set(1,0);
       //Lo mostramos 
       for (Integer x: elementos){
           System.out.println (x);
           
       }
              
        
        
    }
    
}
