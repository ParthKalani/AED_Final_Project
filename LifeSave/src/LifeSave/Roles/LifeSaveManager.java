/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Roles;

import LifeSaveMain.EcoSystem;
import LifeSave.Enterprises.Enterprise;
import LifeSave.Organizations.Organization;
import LifeSave.UserAccounts.UserAccount;
import javax.swing.JPanel;
import UI.Manager.LifeSaveManagerWAJPanel;

/**
 *
 * @author kiara
 */
public class LifeSaveManager extends Role{
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LifeSaveManagerWAJPanel(userProcessContainer, enterprise,business, account);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    } 
}