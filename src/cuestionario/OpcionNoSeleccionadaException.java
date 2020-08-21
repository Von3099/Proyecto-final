/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

/**
 *
 * @author PERENÉ
 */
public class OpcionNoSeleccionadaException extends Exception{
    public OpcionNoSeleccionadaException (){
        super ("Debes selecionar una opcion");
    }
    
}
