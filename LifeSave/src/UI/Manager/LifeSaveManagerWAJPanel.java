/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Manager;

import LifeSaveMain.EcoSystem;
import LifeSave.Utilities.Validation;
import LifeSave.Enterprises.Enterprise;
import LifeSave.Organizations.FundingsOrg;
import LifeSave.Organizations.OrganSeekerOrg;
import LifeSave.Organizations.Organization;
import LifeSave.Organizations.MobilityOrg;
import LifeSave.Organizations.FreeWillOrg;
import LifeSave.UserAccounts.UserAccount;
import LifeSave.WorkQueues.CharityRequest;
import LifeSave.WorkQueues.OrganRequest;
import LifeSave.WorkQueues.AccountManagerWorkRequest;
import LifeSave.WorkQueues.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author parthkalani
 */
public class LifeSaveManagerWAJPanel extends javax.swing.JPanel {
   private JPanel userProcessContainer;
   private  Enterprise enterprise;
   private EcoSystem ecoSystem;
   private UserAccount userAccount;
   private FreeWillOrg fwo;
    private FundingsOrg fo ;
    private OrganSeekerOrg oso;
    private MobilityOrg mo;
    private List<Entry<String, Integer>> topEnlisteeList;
     private List<Entry<String, Integer>> topSponsorList;
    
    
    public LifeSaveManagerWAJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem ecoSystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        valueLabel.setText(enterprise.getName());
        populatePieChartData();
        populateTextFields();

        
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueLabel = new javax.swing.JLabel();
        manageEnt1 = new javax.swing.JLabel();
        manageEnt2 = new javax.swing.JLabel();
        pieChartPanel = new javax.swing.JPanel();
        totalHelpReq = new javax.swing.JLabel();
        totSenDevReq = new javax.swing.JLabel();
        totTransReq = new javax.swing.JLabel();
        totSenDevReqField = new javax.swing.JTextField();
        totTransReqField = new javax.swing.JTextField();
        totHelpReqField = new javax.swing.JTextField();
        totSenDevReq1 = new javax.swing.JLabel();
        donatedAmntField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 255));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        valueLabel.setText("<value>");

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("Manager Work Area");

        manageEnt2.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt2.setText("Enterprise:");

        javax.swing.GroupLayout pieChartPanelLayout = new javax.swing.GroupLayout(pieChartPanel);
        pieChartPanel.setLayout(pieChartPanelLayout);
        pieChartPanelLayout.setHorizontalGroup(
            pieChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        pieChartPanelLayout.setVerticalGroup(
            pieChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        totalHelpReq.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totalHelpReq.setText("Total No of Help Requests");

        totSenDevReq.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N

        totTransReq.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totTransReq.setText("Total No of Transport Requests");

        totSenDevReqField.setEditable(false);
        totSenDevReqField.setBackground(new java.awt.Color(153, 204, 0));

        totTransReqField.setEditable(false);
        totTransReqField.setBackground(new java.awt.Color(153, 204, 0));

        totHelpReqField.setEditable(false);
        totHelpReqField.setBackground(new java.awt.Color(153, 204, 0));

        totSenDevReq1.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totSenDevReq1.setText("Total funds sponsored");

        donatedAmntField.setEditable(false);
        donatedAmntField.setBackground(new java.awt.Color(153, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(totSenDevReq1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalHelpReq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(manageEnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(totSenDevReq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totTransReq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totSenDevReqField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totTransReqField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totHelpReqField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donatedAmntField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pieChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(pieChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(manageEnt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valueLabel)
                            .addComponent(manageEnt2))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalHelpReq)
                            .addComponent(totHelpReqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totTransReq)
                            .addComponent(totTransReqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totSenDevReq)
                            .addComponent(totSenDevReqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totSenDevReq1)
                            .addComponent(donatedAmntField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
      public void populateTextFields()
      {
          int totalHelpReq = 0;
          int totalTransportReq = 0;
          String totalDonorReq = "";
          int totalAmountDonated =0;
          try
          {
      if(fo!=null){
      totalDonorReq = String.valueOf(fo.getWorkQueue().getWorkRequestList().size());
              
        for(UserAccount donorAccount : fo.getUserAccountDirectory().getUserAccountList())
      {
       if(!donorAccount.getWorkQueue().getWorkRequestList().isEmpty())
       {
         for(WorkRequest wrkrequest : donorAccount.getWorkQueue().getWorkRequestList())
         {  
           if(wrkrequest.getWork().equalsIgnoreCase("Chairty Funding"))
             {
                 CharityRequest donationRequest = (CharityRequest)wrkrequest;
                totalAmountDonated+= Integer.parseInt(donationRequest.getCharity().getAmount());
             }
        
          }
         }
         
       }
         } 
      if(fwo!=null)
      {
          for(WorkRequest request : fwo.getWorkQueue().getWorkRequestList())
          {
             if(request.getWork().equalsIgnoreCase("Requested Help"))
             {
               totalHelpReq++;     
             }
             
             
           }
          for(UserAccount userAccount : fwo.getUserAccountDirectory().getUserAccountList())
          {
           if(!userAccount.getWorkQueue().getWorkRequestList().isEmpty())
           {
            for(WorkRequest req : userAccount.getWorkQueue().getWorkRequestList())
            {
              if(req.getWork().equalsIgnoreCase("Requested Help"))
             {
               totalHelpReq++;     
             }   
            }
           }
          }
      } 
      if(mo!=null)
      {
           for(WorkRequest request : mo.getWorkQueue().getWorkRequestList())
          {
              if(request.getWork().equals("Mobility request"))
              {
              totalTransportReq++;    
              }
          }
      }   
          totHelpReqField.setText(String.valueOf(totalHelpReq));
          totSenDevReqField.setText(totalDonorReq);
          totTransReqField.setText(String.valueOf(totalTransportReq));
          donatedAmntField.setText(String.valueOf(totalAmountDonated));
          }
          catch(Exception e)
          {
         JOptionPane.showMessageDialog(null, " Data is not availble for few organizations!","warning", JOptionPane.WARNING_MESSAGE);
         return;      
          }
      }
    
    public void populatePieChartData()
    {
       DefaultPieDataset dataSet = new DefaultPieDataset();
       int totalOrganSeekers = 0;
       int totalEnlistee = 0;
       int totalSponsors = 0;
       int totalDrivers = 0;
       try
       {
       for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
       {
          if(organization instanceof OrganSeekerOrg) 
          {
          this.oso = (OrganSeekerOrg)organization;   
           totalOrganSeekers = organization.getPersonDirectory().getOrganSeekerLsit().size();
          }
       }
       try
       {
         this.fwo = Validation.getVolunteerOrganization(ecoSystem, userAccount);
       }
        catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " Voluteer Organination does not exist!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }
       if(fwo!=null)
       {
        totalEnlistee = fwo.getPersonDirectory().getEnlisteeList().size();
       }
        
        this.fo = Validation.getDonorOrganization(ecoSystem, userAccount);
        if(fo!=null)
        {
        totalSponsors = fo.getPersonDirectory().getPersonList().size();
        }
        this.mo = Validation.getTransportOrganization(ecoSystem, userAccount);
        if(mo!=null)
        {
        totalDrivers = mo.getPersonDirectory().getPersonList().size();
        }
         
         dataSet.setValue("Total No of Organ Seekers",totalOrganSeekers);
         dataSet.setValue("Total No of Enlistee", totalEnlistee );
         dataSet.setValue("Total No of Sponsor",totalSponsors);
         dataSet.setValue("Total No of Drivers",totalDrivers);
     
         JFreeChart  chart = ChartFactory.createPieChart3D("Pie Chart for "+userAccount.getNetwork().getCity(), dataSet, true, true, Locale.ENGLISH);
            chart.setBackgroundPaint(Color.black);
            chart.getTitle().setPaint(Color.gray);
          ChartPanel chartpanel = new ChartPanel(chart);
        chartpanel.setDomainZoomable(true);

        pieChartPanel.setLayout(new BorderLayout());
        pieChartPanel.add(chartpanel, BorderLayout.EAST); 
        pieChartPanel.setVisible(true);
       }
       
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }
        
    }
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField donatedAmntField;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JPanel pieChartPanel;
    private javax.swing.JTextField totHelpReqField;
    private javax.swing.JLabel totSenDevReq;
    private javax.swing.JLabel totSenDevReq1;
    private javax.swing.JTextField totSenDevReqField;
    private javax.swing.JLabel totTransReq;
    private javax.swing.JTextField totTransReqField;
    private javax.swing.JLabel totalHelpReq;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
