/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Role.Role;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class UserAccount {
    private static int count = 0;
    private String accountId;
    private String username;
    private String password;
    public Role role;
    private String personId;
    
    public UserAccount() {
        this.accountId = "USER-" + count++;
        this.username = username;
        this.password = password;
        this.role = role;    
    }

    public UserAccount(String username, String password, Role role, String personId) {
        this.accountId = "USER-" + count++;
        this.username = username;
        this.password = password;
        this.role = role;
        this.personId = personId;
    }
    
    public UserAccount(String username, String password, Role role) {
        //this.accountId = role + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }
 
    public void setRole(Role role) {
        this.role = role;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
    
}
