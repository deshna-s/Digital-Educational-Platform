/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.userAccountList.add(user);
        return user;
    }
    
    // all other required methods to be implemented below
    
//    public boolean verifyRole(){
//    }
   
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.userAccountList) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
//                System.out.print(ua.getRole());
                return ua;
            }
        }
        return null;
    }
    
//    public UserAccount authenticateUser(String name, String password, String role) {
//    for (UserAccount ua : this.userAccountList) {
//        if (ua.getUsername().equals(name) && ua.getPassword().equals(password) && ua.getRole().toString().equals(role)) {
//            return ua;
//            }
//        }
//        return null;
//    }
    
}
