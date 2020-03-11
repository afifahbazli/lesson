/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdaapplication;

/**
 *
 * @author user
 */
public class Borrower {
    private String BorrowerId,name,street,city,zip,state;

    public Borrower() {
    }

    public Borrower(String BorrowerId, String name, String street, String city, String zip, String state) {
        this.BorrowerId = BorrowerId;
        this.name = name;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public String getBorrowerId() {
        return BorrowerId;
    }

    public void setBorrowerId(String BorrowerId) {
        this.BorrowerId = BorrowerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
}
