/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Model.Model;
import Business.UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author dhirt, deshna, anisha
 */

public abstract class Role {
    
    private static String[] roles = {"student", "faculty", "admin", "thirdParty", "recruiter"};
    
    public static String[] getAllRoles() {
        return roles;
    }
    
    public abstract JFrame createWorkArea(Model model, UserAccount userAccount);
    
}