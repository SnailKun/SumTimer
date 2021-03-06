/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.snailz.sumtimer;

import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class SpellSelector extends javax.swing.JFrame {
    
    private Spell D;
    private Spell F;
    
    private boolean teleport;
    /**
     * Creates new form SumTimer
     */
    public SpellSelector() {
        initComponents();
        this.setTitle("Summoner Spell Timer");
        ImageIcon img = new ImageIcon("resources/FLASH.png");
        this.setIconImage(img.getImage());
        //Register Veriables
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Flash = new javax.swing.JLabel();
        Teleport = new javax.swing.JLabel();
        Barrier = new javax.swing.JLabel();
        Confirm = new javax.swing.JButton();
        TeleportPicked = new javax.swing.JComboBox<>();
        BarrierPicked = new javax.swing.JComboBox<>();
        FlashPicked = new javax.swing.JComboBox<>();
        Ignite = new javax.swing.JLabel();
        IgnitePicked = new javax.swing.JComboBox<>();
        Exhaust = new javax.swing.JLabel();
        ExhaustPicked = new javax.swing.JComboBox<>();
        Heal = new javax.swing.JLabel();
        HealPicked = new javax.swing.JComboBox<>();
        Cleanse = new javax.swing.JLabel();
        Ghost = new javax.swing.JLabel();
        GhostPicked = new javax.swing.JComboBox<>();
        CleansePicked = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setText("SumTimer");

        Flash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/snailz/sumtimer/resources/FLASH.png"))); // NOI18N

        Teleport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/snailz/sumtimer/resources/TELEPORT.png"))); // NOI18N

        Barrier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/snailz/sumtimer/resources/BARRIER.png"))); // NOI18N

        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        TeleportPicked.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "D", "F" }));
        TeleportPicked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeleportPickedActionPerformed(evt);
            }
        });

        BarrierPicked.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "D", "F" }));
        BarrierPicked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarrierPickedActionPerformed(evt);
            }
        });

        FlashPicked.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "D", "F" }));
        FlashPicked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlashPickedActionPerformed(evt);
            }
        });

        Ignite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/snailz/sumtimer/resources/IGNITE.png"))); // NOI18N

        IgnitePicked.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "D", "F" }));
        IgnitePicked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgnitePickedActionPerformed(evt);
            }
        });

        Exhaust.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/snailz/sumtimer/resources/EXHAUST.png"))); // NOI18N

        ExhaustPicked.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "D", "F" }));
        ExhaustPicked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExhaustPickedActionPerformed(evt);
            }
        });

        Heal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/snailz/sumtimer/resources/HEAL.png"))); // NOI18N

        HealPicked.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "D", "F" }));
        HealPicked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealPickedActionPerformed(evt);
            }
        });

        Cleanse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/snailz/sumtimer/resources/CLEANSE.png"))); // NOI18N

        Ghost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/snailz/sumtimer/resources/GHOST.png"))); // NOI18N

        GhostPicked.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "D", "F" }));
        GhostPicked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GhostPickedActionPerformed(evt);
            }
        });

        CleansePicked.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "D", "F" }));
        CleansePicked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleansePickedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Flash)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FlashPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TeleportPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ignite)
                                .addGap(18, 18, 18)
                                .addComponent(IgnitePicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Heal)
                                .addGap(18, 18, 18)
                                .addComponent(HealPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ghost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Barrier)
                                .addGap(18, 18, 18)
                                .addComponent(BarrierPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Exhaust)
                                .addGap(18, 18, 18)
                                .addComponent(ExhaustPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cleanse)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Teleport)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CleansePicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GhostPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(Confirm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(Title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(FlashPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(ExhaustPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(CleansePicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Title)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Flash)
                                    .addComponent(Barrier)
                                    .addComponent(Exhaust)
                                    .addComponent(Cleanse)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(BarrierPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ignite)
                                    .addComponent(Teleport)
                                    .addComponent(Heal)
                                    .addComponent(Ghost)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(TeleportPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(IgnitePicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(HealPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(Confirm)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GhostPicked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        if (D != null && F != null){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new SumTimer(D, F).setVisible(true);
                }
            });
        }
    }//GEN-LAST:event_ConfirmActionPerformed

    private void TeleportPickedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeleportPickedActionPerformed
        if (TeleportPicked.getSelectedItem().toString().equals("None")) {
            if (F == Spell.TELEPORT) {
                F = null;
            } else if (D == Spell.TELEPORT) {
                D = null;
            }
        }
        if (TeleportPicked.getSelectedItem().toString().equals("D")){
            if (F == Spell.TELEPORT){
                F = null;
                D = Spell.TELEPORT;
                return;
            }
            D = Spell.TELEPORT;
        }
        if (TeleportPicked.getSelectedItem().toString().equals("F")){
            if (D == Spell.TELEPORT) {
                D = null;
                F = Spell.TELEPORT;
                return;
            }
            F = Spell.TELEPORT;
        }
    }//GEN-LAST:event_TeleportPickedActionPerformed

    private void BarrierPickedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarrierPickedActionPerformed
        if (BarrierPicked.getSelectedItem().toString().equals("None")) {
            if (F == Spell.BARRIER) {
                F = null;
            } else if (D == Spell.BARRIER) {
                D = null;
            }
        }
        if (BarrierPicked.getSelectedItem().toString().equals("D")) {
            if (F == Spell.BARRIER) {
                F = null;
                D = Spell.BARRIER;
                return;
            }
            D = Spell.BARRIER;
        }
        if (BarrierPicked.getSelectedItem().toString().equals("F")) {
            if (D == Spell.BARRIER) {
                D = null;
                F = Spell.TELEPORT;
                return;
            }
            F = Spell.BARRIER;
        }
    }//GEN-LAST:event_BarrierPickedActionPerformed

    private void FlashPickedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlashPickedActionPerformed
        if (FlashPicked.getSelectedItem().toString().equals("None")) {
            if (F == Spell.FLASH) {
                F = null;
            } else if (D == Spell.FLASH) {
                D = null;
            }
        }
        if (FlashPicked.getSelectedItem().toString().equals("D")) {
            if (F == Spell.FLASH) {
                F = null;
                D = Spell.FLASH;
                return;
            }
            D = Spell.FLASH;
        }
        if (FlashPicked.getSelectedItem().toString().equals("F")) {
            if (D == Spell.FLASH) {
                D = null;
                F = Spell.FLASH;
                return;
            }
            F = Spell.FLASH;
        }
    }//GEN-LAST:event_FlashPickedActionPerformed

    private void IgnitePickedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgnitePickedActionPerformed
        if (IgnitePicked.getSelectedItem().toString().equals("None")) {
            if (F == Spell.IGNITE) {
                F = null;
            } else if (D == Spell.IGNITE) {
                D = null;
            }
        }
        if (IgnitePicked.getSelectedItem().toString().equals("D")) {
            if (F == Spell.IGNITE) {
                F = null;
                D = Spell.IGNITE;
                return;
            }
            D = Spell.IGNITE;
        }
        if (IgnitePicked.getSelectedItem().toString().equals("F")) {
            if (D == Spell.IGNITE) {
                D = null;
                F = Spell.IGNITE;
                return;
            }
            F = Spell.IGNITE;
        }
    }//GEN-LAST:event_IgnitePickedActionPerformed

    private void ExhaustPickedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExhaustPickedActionPerformed
        if (ExhaustPicked.getSelectedItem().toString().equals("None")) {
            if (F == Spell.EXHAUST) {
                F = null;
            } else if (D == Spell.EXHAUST) {
                D = null;
            }
        }
        if (ExhaustPicked.getSelectedItem().toString().equals("D")) {
            if (F == Spell.EXHAUST) {
                F = null;
                D = Spell.EXHAUST;
                return;
            }
            D = Spell.EXHAUST;
        }
        if (ExhaustPicked.getSelectedItem().toString().equals("F")) {
            if (D == Spell.EXHAUST) {
                D = null;
                F = Spell.EXHAUST;
                return;
            }
            F = Spell.EXHAUST;
        }
    }//GEN-LAST:event_ExhaustPickedActionPerformed

    private void HealPickedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealPickedActionPerformed
        if (HealPicked.getSelectedItem().toString().equals("None")) {
            if (F == Spell.HEAL) {
                F = null;
            } else if (D == Spell.HEAL) {
                D = null;
            }
        }
        if (HealPicked.getSelectedItem().toString().equals("D")) {
            if (F == Spell.HEAL) {
                F = null;
                D = Spell.HEAL;
                return;
            }
            D = Spell.HEAL;
        }
        if (HealPicked.getSelectedItem().toString().equals("F")) {
            if (D == Spell.HEAL) {
                D = null;
                F = Spell.HEAL;
                return;
            }
            F = Spell.HEAL;
        }
    }//GEN-LAST:event_HealPickedActionPerformed

    private void GhostPickedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GhostPickedActionPerformed
        if (GhostPicked.getSelectedItem().toString().equals("None")){
            if (F == Spell.GHOST){
                F = null;
            } else if (D == Spell.GHOST){
                D = null;
            }
        }
        if (GhostPicked.getSelectedItem().toString().equals("D")) {
            if (F == Spell.GHOST) {
                F = null;
                D = Spell.GHOST;
                return;
            }
            D = Spell.GHOST;
        }
        if (GhostPicked.getSelectedItem().toString().equals("F")) {
            if (D == Spell.GHOST) {
                D = null;
                F = Spell.GHOST;
                return;
            }
            F = Spell.GHOST;
        }
    }//GEN-LAST:event_GhostPickedActionPerformed

    private void CleansePickedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleansePickedActionPerformed
        if (CleansePicked.getSelectedItem().toString().equals("None")) {
            if (F == Spell.CLEANSE) {
                F = null;
            } else if (D == Spell.CLEANSE) {
                D = null;
            }
        }
        if (CleansePicked.getSelectedItem().toString().equals("D")) {
            if (F == Spell.CLEANSE) {
                F = null;
                return;
            }
            D = Spell.CLEANSE;
        }
        if (CleansePicked.getSelectedItem().toString().equals("F")) {
            if (D == Spell.CLEANSE) {
                D = null;
                return;
            }
            F = Spell.CLEANSE;
        }
    }//GEN-LAST:event_CleansePickedActionPerformed

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
            java.util.logging.Logger.getLogger(SpellSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpellSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpellSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpellSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpellSelector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Barrier;
    private javax.swing.JComboBox<String> BarrierPicked;
    private javax.swing.JLabel Cleanse;
    private javax.swing.JComboBox<String> CleansePicked;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel Exhaust;
    private javax.swing.JComboBox<String> ExhaustPicked;
    private javax.swing.JLabel Flash;
    private javax.swing.JComboBox<String> FlashPicked;
    private javax.swing.JLabel Ghost;
    private javax.swing.JComboBox<String> GhostPicked;
    private javax.swing.JLabel Heal;
    private javax.swing.JComboBox<String> HealPicked;
    private javax.swing.JLabel Ignite;
    private javax.swing.JComboBox<String> IgnitePicked;
    private javax.swing.JLabel Teleport;
    private javax.swing.JComboBox<String> TeleportPicked;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
