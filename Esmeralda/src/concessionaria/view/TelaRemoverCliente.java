/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package concessionaria.view;

import concessionaria.controller.ClienteController;
import javax.swing.JOptionPane;


public class TelaRemoverCliente extends javax.swing.JFrame {

    /** Creates new form TelaRemoverCliente */
    public TelaRemoverCliente() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelRemoverCliente = new javax.swing.JPanel();
        jLabelCPFRemoverCliente = new javax.swing.JLabel();
        jTextFieldCPFRemoverCliente = new javax.swing.JTextField();
        jButtonRemover = new javax.swing.JButton();
        jButtonRemover1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Esmeralda Veículos");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setText("Remover Cliente");

        jPanelRemoverCliente.setBackground(new java.awt.Color(102, 102, 102));
        jPanelRemoverCliente.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelCPFRemoverCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCPFRemoverCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPFRemoverCliente.setText("CPF:");

        jTextFieldCPFRemoverCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldCPFRemoverCliente.setToolTipText("Digite apenas os números");

        jButtonRemover.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCliente(evt);
            }
        });

        jButtonRemover1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonRemover1.setText("Limpar");
        jButtonRemover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTela(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelRemoverClienteLayout = new org.jdesktop.layout.GroupLayout(jPanelRemoverCliente);
        jPanelRemoverCliente.setLayout(jPanelRemoverClienteLayout);
        jPanelRemoverClienteLayout.setHorizontalGroup(
            jPanelRemoverClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelRemoverClienteLayout.createSequentialGroup()
                .add(jPanelRemoverClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelRemoverClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabelCPFRemoverCliente)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextFieldCPFRemoverCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelRemoverClienteLayout.createSequentialGroup()
                        .add(238, 238, 238)
                        .add(jButtonRemover)
                        .add(70, 70, 70)
                        .add(jButtonRemover1)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanelRemoverClienteLayout.setVerticalGroup(
            jPanelRemoverClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelRemoverClienteLayout.createSequentialGroup()
                .add(45, 45, 45)
                .add(jPanelRemoverClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelCPFRemoverCliente)
                    .add(jTextFieldCPFRemoverCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 235, Short.MAX_VALUE)
                .add(jPanelRemoverClienteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonRemover)
                    .add(jButtonRemover1))
                .add(66, 66, 66))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(Ulremberg.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabelTitulo)
                .add(289, 289, 289))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelRemoverCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jLabelTitulo)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanelRemoverCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limparTela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTela
        jTextFieldCPFRemoverCliente.setText("");
    }//GEN-LAST:event_limparTela

    private void removerCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerCliente
        ClienteController cc = new ClienteController();
        if(jTextFieldCPFRemoverCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Algum campo vazio", "ERRO", JOptionPane.DEFAULT_OPTION);
        } else {

            String cpf = jTextFieldCPFRemoverCliente.getText();

            cc.removerCliente(cpf);
        }
    }//GEN-LAST:event_removerCliente

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
            java.util.logging.Logger.getLogger(TelaRemoverCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRemoverCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonRemover1;
    private javax.swing.JLabel jLabelCPFRemoverCliente;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelRemoverCliente;
    private javax.swing.JTextField jTextFieldCPFRemoverCliente;
    // End of variables declaration//GEN-END:variables

}