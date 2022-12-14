/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.SystemAdmin;

import LifeSaveMain.EcoSystem;
import LifeSave.Enterprises.Enterprise;
import LifeSave.Network.Network;
import LifeSave.Organizations.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author kiara
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
     
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ManageNetworkJButton = new javax.swing.JButton();
        ManageAdminJButton = new javax.swing.JButton();
        manageEnterpriseJButton = new javax.swing.JButton();
        SysAdWorkAreaJLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(798, 526));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        ManageNetworkJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ManageNetworkJButton.setText("Manage Network");
        ManageNetworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageNetworkJButtonActionPerformed(evt);
            }
        });

        ManageAdminJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ManageAdminJButton.setText("Manage Enterprise Admin");
        ManageAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAdminJButtonActionPerformed(evt);
            }
        });

        manageEnterpriseJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        manageEnterpriseJButton.setText("Manage Enterprise");
        manageEnterpriseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseJButtonActionPerformed(evt);
            }
        });

        SysAdWorkAreaJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        SysAdWorkAreaJLabel.setText("System Admin Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(SysAdWorkAreaJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEnterpriseJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageNetworkJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageAdminJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SysAdWorkAreaJLabel)
                .addGap(125, 125, 125)
                .addComponent(ManageNetworkJButton)
                .addGap(40, 40, 40)
                .addComponent(manageEnterpriseJButton)
                .addGap(36, 36, 36)
                .addComponent(ManageAdminJButton)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void manageEnterpriseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseJButtonActionPerformed

        ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, system);
        userProcessContainer.add("manageEnterpriseJPanel", manageEnterpriseJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseJButtonActionPerformed

    private void ManageAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageAdminJButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, system);
        userProcessContainer.add("manageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageAdminJButtonActionPerformed

    private void ManageNetworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageNetworkJButtonActionPerformed
        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(userProcessContainer, system);
        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageNetworkJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageAdminJButton;
    private javax.swing.JButton ManageNetworkJButton;
    private javax.swing.JLabel SysAdWorkAreaJLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageEnterpriseJButton;
    // End of variables declaration//GEN-END:variables
}
