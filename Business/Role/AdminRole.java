/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Model.Model;
import Business.UserAccount.UserAccount;
import javax.swing.JFrame;
import UserInterface.Admin.AdminJFrame;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class AdminRole extends Role {
    
    @Override
    public JFrame createWorkArea(Model model, UserAccount userAccount) {
        return new AdminJFrame(model, userAccount);
    }
}
