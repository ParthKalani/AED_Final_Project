/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Organizations;
import LifeSave.Roles.SponsorRole;
import LifeSave.Roles.Role;
import java.util.ArrayList;
/**
 *
 * @author parthkalani
 */
public class FundingsOrg {
    public FundingsOrg()
    {
        super(Organization.Type.Sponsor.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SponsorRole());
        return roles;
    }
}
