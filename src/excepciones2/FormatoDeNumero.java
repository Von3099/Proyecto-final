/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

/**
 *
 * @author PERENÉ
 */
public class FormatoDeNumero {
    
      public static void main(String[] args) {
    //Esta excepcion cuando alimentamos
    //datos en un campo de texto por meido de Java
    String falsoNumero="4";
    //Lo transformamos a un numero entero usando la clase wrapper
    // wrapper (envoltorio) Intenger
    int numero=Integer.parseInt(falsoNumero);
    int producto=2*numero;
    
    System.out.println("El doble del numero es: "+producto);
    
  }
    
}
