/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LifeSave.Enlistee;

import LifeSave.Organizations.Organization;
import LifeSave.Organizations.OrganizationDirectory;
import LifeSave.Organizations.MobilityOrg;
import LifeSave.UserAccounts.UserAccount;
import LifeSave.WorkQueues.OrganRequest;
import LifeSave.WorkQueues.MobilityRequest;
import LifeSave.WorkQueues.AccountManagerWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jkoti
 */
public class ProcessHelpReqPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private OrganRequest request;
    private UserAccount userAccount;
    private OrganizationDirectory od;
    /**
     * Creates new form ProcessHelpReqPanel
     */
    
    public ProcessHelpReqPanel(JPanel userProcessContainer, OrganRequest request, UserAccount userAccount, OrganizationDirectory od) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.od = od;
        
        requestResultCombo.removeAllItems();
        requestResultCombo.addItem(AccountManagerWorkRequest.REQUEST_ACCEPT);
        requestResultCombo.addItem(AccountManagerWorkRequest.REQUEST_REJECT);
        
        needTransportCombo.removeAllItems();
        needTransportCombo.addItem("YES");
        needTransportCombo.addItem("NO");
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitRequest = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTxtAreaField = new javax.swing.JTextArea();
        needTransport = new javax.swing.JLabel();
        needTransportCombo = new javax.swing.JComboBox();
        requestStatus = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        requestResultCombo = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        submitRequest.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        submitRequest.setText("Process Help Request :");

        jLabel2.setText("Add comments: ");

        commentsTxtAreaField.setColumns(20);
        commentsTxtAreaField.setRows(5);
        jScrollPane1.setViewportView(commentsTxtAreaField);

        needTransport.setText("Need Transport:");

        needTransportCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        requestStatus.setText("Help Request ");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requestResultCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(backJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(needTransport)))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(needTransportCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(submitRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(requestStatus))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestResultCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(submitRequest)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestResultCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requestStatus))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(needTransport)
                            .addComponent(needTransportCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addComponent(backJButton)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitJButton)
                        .addGap(45, 45, 45))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewOrganRequestJPanel viewAnonymousRequestPanel = (ViewOrganRequestJPanel) component;
        viewAnonymousRequestPanel.populateAnonymousHelpRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        if(requestResultCombo.getSelectedIndex()<0 || commentsTxtAreaField.getText().trim().isEmpty()
            || needTransportCombo.getSelectedIndex()<0     )
        {
            JOptionPane.showMessageDialog(null, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         if(commentsTxtAreaField.getText().length()>50 )
        {
        JOptionPane.showMessageDialog(null, "Please enter few words in text area", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        
        }
         
        request.setRequestResult((String)requestResultCombo.getSelectedItem());
        request.setComments(commentsTxtAreaField.getText());
        request.setStatus(AccountManagerWorkRequest.REQUEST_COMPLETED);
        request.setSolveDate(new Date());
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        String needTransport = (String)needTransportCombo.getSelectedItem();

        JOptionPane.showMessageDialog(null, "Help Request has been processed successfully", "success", JOptionPane.PLAIN_MESSAGE);

        if(needTransport.equals("YES"))
        {
            MobilityRequest needTransportWorkRequest = new MobilityRequest();
            needTransportWorkRequest.setWork("Need Transport");
            needTransportWorkRequest.setSender(userAccount);
            needTransportWorkRequest.setStatus("Sent");
            needTransportWorkRequest.setNeedMob((String)needTransportCombo.getSelectedItem());
            needTransportWorkRequest.setReqDate(new Date());
            Organization organization = null;
            for(Organization org : od.getOrganizationList())
            {
                if(org instanceof MobilityOrg)
                {
                    organization = org;
                }
            }
            if(organization == null)
            {
                JOptionPane.showMessageDialog(null, "Unable to create transport request! Please create transport organization !!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            organization.getWorkQueue().getWorkRequestList().add(needTransportWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(needTransportWorkRequest);

            JOptionPane.showMessageDialog(null, "Transport Request has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
            commentsTxtAreaField.setText("");
        }

    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea commentsTxtAreaField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel needTransport;
    private javax.swing.JComboBox needTransportCombo;
    private javax.swing.JComboBox requestResultCombo;
    private javax.swing.JLabel requestStatus;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel submitRequest;
    // End of variables declaration//GEN-END:variables
}
