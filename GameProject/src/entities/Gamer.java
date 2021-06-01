/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.LocalDate;

public class Gamer extends Customer{
    
   private String userName;

    public Gamer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId, String userName) {
        super(id, firstName, lastName, dateOfBirth, nationalityId);
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
   
    
}
