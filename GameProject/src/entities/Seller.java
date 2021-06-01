/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.LocalDate;

/**
 *
 * @author İlknur Helvacı
 */
public class Seller extends Customer {
    private String taxNumber;
    
    public Seller(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId, String taxNumber) {
        super(id, firstName, lastName, dateOfBirth, nationalityId);
        this.taxNumber = taxNumber;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
    
    
}
