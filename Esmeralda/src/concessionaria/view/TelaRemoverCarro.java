/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria.view;

import concessionaria.controller.CarroController;
import javax.swing.JOptionPane;


public class TelaRemoverCarro extends javax.swing.JFrame {

    /**
     * Creates new form TelaRemoverCarro
     */
    public TelaRemoverCarro() {
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

        jLabelTitulo = new javax.swing.JLabel();
        jPanelRemoverCarro = new javax.swing.JPanel();
        jLabelChassiRemover = new javax.swing.JLabel();
        jTextFieldChassiRemover = new javax.swing.JTextField();
        jButtonRemoverCarro = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Esmeralda Veículos");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setText("Remover Carro");

        jPanelRemoverCarro.setBackground(new java.awt.Color(102, 102, 102));
        jPanelRemoverCarro.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelChassiRemover.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelChassiRemover.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChassiRemover.setText("Chassi:");

        jTextFieldChassiRemover.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldChassiRemover.setToolTipText("Digite apenas os números");
        jTextFieldChassiRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChassiRemoverActionPerformed(evt);
            }
        });

        jButtonRemoverCarro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonRemoverCarro.setText("Remover");
        jButtonRemoverCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCarro(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTela(evt);
            }
        });

        javax.swing.GroupLayout jPanelRemoverCarroLayout = new javax.swing.GroupLayout(jPanelRemoverCarro);
        jPanelRemoverCarro.setLayout(jPanelRemoverCarroLayout);
        jPanelRemoverCarroLayout.setHorizontalGroup(
            jPanelRemoverCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRemoverCarroLayout.createSequentialGroup()
                .addGroup(jPanelRemoverCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRemoverCarroLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jButtonRemoverCarro)
                        .addGap(73, 73, 73)
                        .addComponent(jButtonLimpar))
                    .addGroup(jPanelRemoverCarroLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelChassiRemover)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldChassiRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanelRemoverCarroLayout.setVerticalGroup(
            jPanelRemoverCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRemoverCarroLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanelRemoverCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelChassiRemover)
                    .addComponent(jTextFieldChassiRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(jPanelRemoverCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemoverCarro)
                    .addComponent(jButtonLimpar))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRemoverCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(321, 321, 321))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelRemoverCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldChassiRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChassiRemoverActionPerformed

    private void removerCarro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerCarro
        CarroController cc = new CarroController();
        if(jTextFieldChassiRemover.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Algum campo vazio", "ERRO", JOptionPane.DEFAULT_OPTION);             
        } else {            
            int chassi = Integer.parseInt(jTextFieldChassiRemover.getText());
            cc.removerCarro(chassi);
        }
            
    }//GEN-LAST:event_removerCarro

    private void limparTela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTela
        jTextFieldChassiRemover.setText("");
    }//GEN-LAST:event_limparTela

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
            java.util.logging.Logger.getLogger(TelaRemoverCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRemoverCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonRemoverCarro;
    private javax.swing.JLabel jLabelChassiRemover;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelRemoverCarro;
    private javax.swing.JTextField jTextFieldChassiRemover;
    // End of variables declaration//GEN-END:variables
}