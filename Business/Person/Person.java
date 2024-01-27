/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import Business.UserAccount.UserAccount;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class Person {
    public String id;
    public String name;
    public UserAccount userAccount;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public UserAccount getUseraccount() {
        return userAccount;
    }

    public void setUseraccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public Person() {
        
    }
    
    public Person(String personID, String name, String age) {
        this.id = personID;
        this.name = name;
    }

    public String getPersonID() {
        return id;
    }

    public void setPersonID(String personID) {
        this.id = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.id;
    }
}   
