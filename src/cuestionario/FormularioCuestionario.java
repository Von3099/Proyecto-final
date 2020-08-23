/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JRadioButton;

/**
 *
 * @author PERENÉ
 */
public class FormularioCuestionario extends javax.swing.JFrame {

    //Vamos a generar un List de radioButtons
    List<JRadioButton> radios = new ArrayList<>();
    List<Pregunta> preguntas = new ArrayList<>();
    int preguntaActual=0;

    public FormularioCuestionario() {
        initComponents();

        //Aqui dentro del constructor de nuestro formulario
        //invocamos nuesto metodo generarCuestionario()
        //LLenamos lo radios
        radios.add(radioTituloOpcion0);
        radios.add(radioTituloOpcion1);
        radios.add(radioTituloOpcion2);
        radios.add(radioTituloOpcion3);

        generarCuestionario();
        
       
    }
    //Aqui vamos a pegar el metodo

    public void generarCuestionario() {
      
         try{
    ValidarOpcionSeleccionada.validar (radios);
    }catch (OpcionNoSeleccionadaException e) {
    etiquetaRespuesta.setText("Debes selecionar una opcion");
}
    

        //Con el modelo construido debemos representar nuestra pregunta
        //y mostrarala
        //Primero creamos las opciones
        Opcion op1 = new Opcion();
        op1.setTitulo("Inglaterra");
        op1.setCorrecta(false);

        Opcion op2 = new Opcion();
        op2.setTitulo("México");
        op2.setCorrecta(false);

        Opcion op3 = new Opcion();
        op3.setTitulo("Italia");
        op3.setCorrecta(false);

        Opcion op4 = new Opcion();
        op4.setTitulo("Francia");
        op4.setCorrecta(true);

        //Sigue el arreglo de opcion
        Opcion[] opciones = {op1, op2, op3, op4};
        Pregunta p1 = new Pregunta();
        p1.setTitulo("¿Que país tiene más Premios Nobel de Literatura?");
        p1.setOpciones(opciones);

        
        //opciones de la pregunta 2
        Opcion op21 = new Opcion();
        op21.setTitulo("Ares");
        op21.setCorrecta(false);

        Opcion op22 = new Opcion();
        op22.setTitulo("Prometeo");
        op22.setCorrecta(false);

        Opcion op23 = new Opcion();
        op23.setTitulo("Poseidón");
        op23.setCorrecta(true);

        Opcion op24 = new Opcion();
        op24.setTitulo("Hefesto");
        op24.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones2 = {op21, op22, op23, op24};
        Pregunta p2 = new Pregunta();
        p2.setTitulo("¿Quién es el padre del cíclope Polifemo según la mitología griega?");
        p2.setOpciones(opciones2);
        
        //opciones de la pregunta 3
        Opcion op31 = new Opcion();
        op31.setTitulo("J.K Rowling");
        op31.setCorrecta(false);

        Opcion op32 = new Opcion();
        op32.setTitulo("Emily Bronte");
        op32.setCorrecta(false);

        Opcion op33 = new Opcion();
        op33.setTitulo("Stephen King");
        op33.setCorrecta(false);

        Opcion op34 = new Opcion();
        op34.setTitulo("Jane Austen");
        op34.setCorrecta(true);

        //Sigue el arreglo de opcion
        Opcion[] opciones3 = {op31, op32, op33, op34};
        Pregunta p3 = new Pregunta();
        p3.setTitulo("¿Quien escribio el libro Orgullo y Prejuicio?");
        p3.setOpciones(opciones3);
        
        //Opciones pregunta 4
        Opcion op41 = new Opcion();
        op41.setTitulo("El Cáliz de Fuego");
        op41.setCorrecta(true);

        Opcion op42 = new Opcion();
        op42.setTitulo("Festin de Cuervos");
        op42.setCorrecta(false);

        Opcion op43 = new Opcion();
        op43.setTitulo("El prisionero de Azkaban");
        op43.setCorrecta(false);

        Opcion op44 = new Opcion();
        op44.setTitulo("Principe Mecánico");
        op44.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones4 = {op41, op42, op43, op44};
        Pregunta p4 = new Pregunta();
        p4.setTitulo("¿Como se llama el cuarto libro de Harry Potter?");
        p4.setOpciones(opciones4);
        
        //Opciones pregunta 5
        Opcion op51 = new Opcion();
        op51.setTitulo("Dunkirk");
        op51.setCorrecta(false);

        Opcion op52 = new Opcion();
        op52.setTitulo("Los Miserables");
        op52.setCorrecta(true);

        Opcion op53 = new Opcion();
        op53.setTitulo("Interestelar");
        op53.setCorrecta(false);

        Opcion op54 = new Opcion();
        op54.setTitulo("Batman: El caballero de la noche");
        op54.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones5= {op51, op52, op53, op54};
        Pregunta p5 = new Pregunta();
        p5.setTitulo("¿Que película NO dirigio Chistopher Nolan?");
        p5.setOpciones(opciones5);
        
        //Opciones pregunta 6
        Opcion op61 = new Opcion();
        op61.setTitulo("Joe Greene");
        op61.setCorrecta(false);

        Opcion op62 = new Opcion();
        op62.setTitulo("Tom Brady");
        op62.setCorrecta(false);

        Opcion op63 = new Opcion();
        op63.setTitulo("Joe Montana");
        op63.setCorrecta(false);

        Opcion op64 = new Opcion();
        op64.setTitulo("Peyton Manning");
        op64.setCorrecta(true);

        //Sigue el arreglo de opcion
        Opcion[] opciones6 = {op61, op62, op63, op64};
        Pregunta p6 = new Pregunta();
        p6.setTitulo("¿Que jugador ha ganado más MVP en la NFL?");
        p6.setOpciones(opciones6);
        
        //Opciones pregunta 7
        Opcion op71 = new Opcion();
        op71.setTitulo("Bayern Munich");
        op71.setCorrecta(false);

        Opcion op72 = new Opcion();
        op72.setTitulo("Real Madrid");
        op72.setCorrecta(true);

        Opcion op73 = new Opcion();
        op73.setTitulo("Barcelona");
        op73.setCorrecta(false);

        Opcion op74 = new Opcion();
        op74.setTitulo("Manchester United");
        op74.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones7 = {op71, op72, op73, op74};
        Pregunta p7 = new Pregunta();
        p7.setTitulo("¿Que equipo ha ganado más Champions League en la hsitoria?");
        p7.setOpciones(opciones7);
        
        
        //Opciones pregunta 8
        
        Opcion op81 = new Opcion();
        op81.setTitulo("Tratado de Versalles");
        op81.setCorrecta(true);

        Opcion op82 = new Opcion();
        op82.setTitulo("Tratado de Granada");
        op82.setCorrecta(false);

        Opcion op83 = new Opcion();
        op83.setTitulo("Tratado de Lyon");
        op83.setCorrecta(false);

        Opcion op84 = new Opcion();
        op84.setTitulo("Tratado de Londres");
        op84.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones8 = {op81, op82, op83, op84};
        Pregunta p8 = new Pregunta();
  p8.setTitulo("¿Como se llamo el tratado con el que se le dio fin a la PGM?");
        p8.setOpciones(opciones8);
        
        //opciones pregunta 9 
        
        Opcion op91 = new Opcion();
        op91.setTitulo("Hermanos Lumiere");
        op91.setCorrecta(false);

        Opcion op92 = new Opcion();
        op92.setTitulo("Steven Spielberg");
        op92.setCorrecta(false);

        Opcion op93 = new Opcion();
        op93.setTitulo("Thomas Harper");
        op93.setCorrecta(false);

        Opcion op94 = new Opcion();
        op94.setTitulo("George Mellies");
        op94.setCorrecta(true);

        //Sigue el arreglo de opcion
        Opcion[] opciones9 = {op91, op92, op93, op94};
        Pregunta p9 = new Pregunta();
        p9.setTitulo("¿A quien se le considera como el mago del cine?");
        p9.setOpciones(opciones9);
        
        //Opciones pregunta 10
        Opcion op101 = new Opcion();
        op101.setTitulo("Miguel Ángel");
        op101.setCorrecta(false);

        Opcion op102 = new Opcion();
        op102.setTitulo("Rafael Sanzio");
        op102.setCorrecta(false);

        Opcion op103 = new Opcion();
        op103.setTitulo("Leonardo Da Vinci");
        op103.setCorrecta(true);

        Opcion op104 = new Opcion();
        op104.setTitulo("Bernini");
        op104.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones10 = {op101, op102, op103, op104};
        Pregunta p10 = new Pregunta();
        p10.setTitulo("¿Que artífice NO participo en la construcción de la Basílica de San Pedro?");
        p10.setOpciones(opciones10);
        
          
           
           //Pregunta p11 =new Pregunta();
        System.out.println("Fin de Cuestionario ");
        
        
        
        //Vamos a adaptar el cuestioanario a lo que ya teniamos
        Cuestionario c = new Cuestionario();
        //Creamos el list de preguntas
        
        
     
        //Se agrega a este list las preguntas que tenemos
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);
       // preguntas.add(p11);
        //A este list le vamos a proporcionar el valor del correspondiente
        //cuestioanrio
        
        c.setPreguntas(preguntas);
        //Ajustamos el titulo de la primera pregunta
          mostrarPregunta (preguntaActual);  
//Primero ajustamos el titulo de la primer pregunta en la etiqueta de la pregunta
try{
    int opcion= Integer.parseInt (etiquetaRespuesta.getText());
    ValidarNumeroPreguntas.validar (opcion);
    }catch (NumberFormatException e) {
   
}
     
    }
         
   
    
        public void mostrarPregunta(int indicePregunta){
    etiquetaTituloPregunta.setText(preguntas.get(indicePregunta).getTitulo());

        //Llenamos con el modelo los radio buttons
        for (int i = 0; i < radios.size(); i++) {
            radios.get(i).setText(preguntas.get(indicePregunta).getOpciones()[i].getTitulo());
        }
        

}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        etiquetaTituloPregunta = new javax.swing.JLabel();
        radioTituloOpcion0 = new javax.swing.JRadioButton();
        radioTituloOpcion1 = new javax.swing.JRadioButton();
        radioTituloOpcion2 = new javax.swing.JRadioButton();
        radioTituloOpcion3 = new javax.swing.JRadioButton();
        botonRespuesta = new javax.swing.JButton();
        etiquetaRespuesta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTituloPregunta.setText("jLabel1");

        grupo.add(radioTituloOpcion0);
        radioTituloOpcion0.setText("jRadioButton1");

        grupo.add(radioTituloOpcion1);
        radioTituloOpcion1.setText("jRadioButton2");
        radioTituloOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTituloOpcion1ActionPerformed(evt);
            }
        });

        grupo.add(radioTituloOpcion2);
        radioTituloOpcion2.setText("jRadioButton3");
        radioTituloOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTituloOpcion2ActionPerformed(evt);
            }
        });

        grupo.add(radioTituloOpcion3);
        radioTituloOpcion3.setText("jRadioButton4");

        botonRespuesta.setText("Checar respuesta");
        botonRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRespuestaActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuestionario/pro.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTituloPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(radioTituloOpcion0, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(radioTituloOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioTituloOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioTituloOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(botonRespuesta))
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiquetaTituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioTituloOpcion0)
                        .addGap(18, 18, 18)
                        .addComponent(radioTituloOpcion1)
                        .addGap(18, 18, 18)
                        .addComponent(radioTituloOpcion2)
                        .addGap(18, 18, 18)
                        .addComponent(radioTituloOpcion3)
                        .addGap(18, 18, 18)
                        .addComponent(botonRespuesta))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioTituloOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTituloOpcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTituloOpcion1ActionPerformed

    private void botonRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRespuestaActionPerformed
        // Aqui vamos a invocar el algoritmo 
        //Vamos a ver si funciona isSelected()
        //Para ello vamos con el primero radioTituloOpcion0
        //boolean r0= radioTituloOpcion0.isSelected();
        //Ahora este booleano lo imprimimos en la etiqueta Respuesta
        //etiquetaRespuesta.setText (" Tu respuesta "+r0);
        //vamos primero a iterar el arreglo de radios
        //Primero obtenemos la primer pregunta de nuestro listado de preguntas
        if(preguntaActual<preguntas.size()){
            
        

        Opcion[] opciones = preguntas.get(preguntaActual).getOpciones();
        boolean acierto = false; 
        for (int i = 0; i < radios.size(); i++) {
            if (radios.get(i).isSelected() && opciones[i].isCorrecta()) {
               acierto=true;
                break;
            }
        }//aqui termina el for
          etiquetaRespuesta.setText("Tu respuesta es " +acierto);
          preguntaActual++;
                  mostrarPregunta (preguntaActual);
        }
    }//GEN-LAST:event_botonRespuestaActionPerformed

    private void radioTituloOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTituloOpcion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTituloOpcion2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCuestionario().setVisible(true);
            }
        });
    }
    //https://pl.kotl.in/1jVo_6ZVn

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRespuesta;
    private javax.swing.JLabel etiquetaRespuesta;
    private javax.swing.JLabel etiquetaTituloPregunta;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton radioTituloOpcion0;
    private javax.swing.JRadioButton radioTituloOpcion1;
    private javax.swing.JRadioButton radioTituloOpcion2;
    private javax.swing.JRadioButton radioTituloOpcion3;
    // End of variables declaration//GEN-END:variables
 public boolean checarRespuesta(Opcion[] opciones) {
        boolean correcta = false;
        for (int i = 0; i < radios.size(); i++) {
            if (radios.get(i).isSelected() && opciones[i].isCorrecta()) {
                System.out.println("Respuesta correcta");
                correcta = true;
                break;
            }
        }
        return correcta;
    }
}
