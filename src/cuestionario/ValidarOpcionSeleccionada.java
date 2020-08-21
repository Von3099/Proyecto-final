/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.List;
import javax.swing.JRadioButton;

/**
 *
 * @author PERENÉ
 */
public class ValidarOpcionSeleccionada {
    public static void validar (List<JRadioButton> radios) throws OpcionNoSeleccionadaException{
        boolean estaSeleccionada=false;
        
        for (int i = 0; i < radios.size(); i++) {
            if (radios.get(i).isSelected()) {
                estaSeleccionada= true;
                break;
            }
        }
        if (!estaSeleccionada) throw new OpcionNoSeleccionadaException();
    }
    
}
