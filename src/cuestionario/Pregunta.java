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
//cuando una clase (pregunta) se compone de otras clases (opcion)
// a esta orientacion a objetos se le conoce como patrones de diseño
//creacionales, a este creacional se le llama : composicion-agregacion
public class Pregunta {
    private String titulo;
    private Opcion opciones [];

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Opcion[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Opcion[] opciones) {
        this.opciones = opciones;
    }
    
    
}
