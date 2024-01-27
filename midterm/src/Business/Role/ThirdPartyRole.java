/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Model.Model;
import UserInterface.Admin.AdminJFrame;
import UserInterface.ThirdPartyAuthority.ThirdPartyJFrame;
import Business.UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class ThirdPartyRole extends Role {
    @Override
    public JFrame createWorkArea(Model model, UserAccount userAccount) {
        return new ThirdPartyJFrame(model, userAccount);
    }
}
