package ihm;

import bdd.TestMethode;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Simulation extends javax.swing.JFrame {

    public Simulation() {
        initComponents();
         // Fermer lors du clic sur la croix
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Titre
        setTitle("Simulation");
        // Centrer sur l'écran
        setLocationRelativeTo(null);
        // La rendre visible
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMontant = new javax.swing.JLabel();
        labelDuree = new javax.swing.JLabel();
        labelTaux = new javax.swing.JLabel();
        labelAssurance = new javax.swing.JLabel();
        boutonValider = new javax.swing.JButton();
        comboBoxDuree = new javax.swing.JComboBox<>();
        formattedTextFieldMontant = new javax.swing.JFormattedTextField();
        comboBoxTaux = new javax.swing.JComboBox<>();
        boutonTestInsert = new javax.swing.JButton();
        boutonTestSelect = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textResSelect = new javax.swing.JTextArea();
        boutonReset = new javax.swing.JButton();
        textID = new javax.swing.JTextField();
        textAddID = new javax.swing.JTextField();
        textAddLib = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMontant.setText("Montant du prêt:");

        labelDuree.setText("Durée du prêt:");

        labelTaux.setText("Taux d'intérêt:");

        labelAssurance.setText("Taux d'assurance:");

        boutonValider.setText("Simuler!");
        boutonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonValiderActionPerformed(evt);
            }
        });

        comboBoxDuree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comboBoxDuree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDureeActionPerformed(evt);
            }
        });

        formattedTextFieldMontant.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        formattedTextFieldMontant.setToolTipText("Indiquez le montant du prêt");
        formattedTextFieldMontant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldMontantActionPerformed(evt);
            }
        });
        formattedTextFieldMontant.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formattedTextFieldMontantPropertyChange(evt);
            }
        });

        comboBoxTaux.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boutonTestInsert.setText("Insert");
        boutonTestInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonTestInsertActionPerformed(evt);
            }
        });

        boutonTestSelect.setText("Select");
        boutonTestSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonTestSelectActionPerformed(evt);
            }
        });

        textResSelect.setColumns(20);
        textResSelect.setRows(5);
        jScrollPane2.setViewportView(textResSelect);

        boutonReset.setText("Reset");

        textID.setText("ID à afficher");
        textID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDActionPerformed(evt);
            }
        });

        textAddID.setText("ID à ajouter");

        textAddLib.setText("Libelle à ajouter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addComponent(boutonValider)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDuree)
                            .addComponent(labelAssurance)
                            .addComponent(labelTaux)
                            .addComponent(labelMontant))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxDuree, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(formattedTextFieldMontant)
                            .addComponent(comboBoxTaux, 0, 0, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boutonTestSelect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boutonReset))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutonTestInsert)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAddLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAddID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonTestInsert)
                    .addComponent(textAddID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(formattedTextFieldMontant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxDuree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxTaux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labelMontant)
                        .addGap(18, 18, 18)
                        .addComponent(labelDuree)
                        .addGap(24, 24, 24)
                        .addComponent(labelTaux)
                        .addGap(18, 18, 18)
                        .addComponent(labelAssurance))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAddLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonTestSelect)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutonValider)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(boutonReset)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxDureeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDureeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDureeActionPerformed

    private void boutonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonValiderActionPerformed
        
    }//GEN-LAST:event_boutonValiderActionPerformed

    private void formattedTextFieldMontantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldMontantActionPerformed
        
    }//GEN-LAST:event_formattedTextFieldMontantActionPerformed

    private void formattedTextFieldMontantPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formattedTextFieldMontantPropertyChange

    }//GEN-LAST:event_formattedTextFieldMontantPropertyChange

    private void boutonTestInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonTestInsertActionPerformed
        TestMethode testInsert = new TestMethode();
        try {
            testInsert.ajouterFonction(Integer.parseInt(textAddID.getText()), textAddLib.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boutonTestInsertActionPerformed

    private void boutonTestSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonTestSelectActionPerformed
        TestMethode testSelect = new TestMethode();
        try {
            textResSelect.setText(testSelect.selectFonction(Integer.parseInt(textID.getText())).toString());
        } catch (SQLException ex) {
            Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boutonTestSelectActionPerformed

    private void textIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonReset;
    private javax.swing.JButton boutonTestInsert;
    private javax.swing.JButton boutonTestSelect;
    private javax.swing.JButton boutonValider;
    private javax.swing.JComboBox<String> comboBoxDuree;
    private javax.swing.JComboBox<String> comboBoxTaux;
    private javax.swing.JFormattedTextField formattedTextFieldMontant;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAssurance;
    private javax.swing.JLabel labelDuree;
    private javax.swing.JLabel labelMontant;
    private javax.swing.JLabel labelTaux;
    private javax.swing.JTextField textAddID;
    private javax.swing.JTextField textAddLib;
    private javax.swing.JTextField textID;
    private javax.swing.JTextArea textResSelect;
    // End of variables declaration//GEN-END:variables
}
