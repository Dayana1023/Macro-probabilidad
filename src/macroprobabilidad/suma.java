/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macroprobabilidad;



/**
 *
 * @author dayan
 */
public class suma extends javax.swing.JPanel {

    /**
     * Creates new form SUMA
     */
    public suma() {
        initComponents();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        posiblesuma = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        procedimiento = new java.awt.TextArea();
        resultado = new java.awt.Label();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUMA DE DOS DADOS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Cual es la probabilidad de que la suma de los dados sea:");

        posiblesuma.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        posiblesuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posiblesumaActionPerformed(evt);
            }
        });
        posiblesuma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                posiblesumaKeyTyped(evt);
            }
        });

        button1.setBackground(new java.awt.Color(0, 0, 0));
        button1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Start");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        procedimiento.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(posiblesuma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(posiblesuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void posiblesumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posiblesumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posiblesumaActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
 String sumat,resul;
 int resultad;
 double operacion,operacion2=0;
 sumat = posiblesuma.getText();
  
   sumatoria obj = new sumatoria();
   obj.validarnumero(sumat);
   resultad = obj.resultado();
 if (resultad ==0){
   resultado.setText( "No es posibles obtener ese valor");   
   procedimiento.setEditable(false);
   procedimiento.setText("Sin procedimiento");
   }
 else{
   operacion =(double) resultad/36;
   operacion2 = (double) operacion*100;
   resultado.setText( "Probabilidad:  "+String.format("Valor: %.3f", operacion2)+"%");
     
   procedimiento.setEditable(false);
   procedimiento.setText("Procedimiento:");
   procedimiento.append("\nUtilizaremos la regla de LAPLACE ");
   procedimiento.append("\nP(A)= N° casos favorables / N° casos posibles ");
   procedimiento.append("\n");
   procedimiento.append("\nDonde los casos posibles es igual a : ");
   procedimiento.append("\n6 X 6 = 36  ");
   procedimiento.append("\nYa que como son dos dados cada uno tiene");
   procedimiento.append("\nun total de 6 posibilidades");
   procedimiento.append("\n");
   procedimiento.append("\nLos casos favorables se hallaron mediante ");
   procedimiento.append("\nun espacio muestral y analizando los 36 ");
   procedimiento.append("\nposibles resultados, con ayuda de una matriz ");
   procedimiento.append("\n");
   procedimiento.append("\nObteniendo los casos favorables podemos");
  procedimiento.append("\nllegar al resultado:");
  procedimiento.append("\n");
  procedimiento.append("\n  "+resultad+" / "+"36 "+" =  "+String.format("Valor: %.3f", operacion2)+" % ");
   }
    }//GEN-LAST:event_button1ActionPerformed

    private void posiblesumaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_posiblesumaKeyTyped
        char c = evt.getKeyChar();       
        if (c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_posiblesumaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField posiblesuma;
    private java.awt.TextArea procedimiento;
    private java.awt.Label resultado;
    // End of variables declaration//GEN-END:variables
}
