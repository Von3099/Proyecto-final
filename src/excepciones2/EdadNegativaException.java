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
public class EdadNegativaException extends Exception {
    public EdadNegativaException(){
  super ("No existen edades negativas");
}
}
