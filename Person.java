/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Student Name: Gerald Mouton
//LSU ID: 894569516
//Lab Section: Lab 2
//Assignment: Lab 5
//Submission Time:1:45
package phonebookproject;

/**
 *
 * @author gmouto6
 */
public class Person extends Contact {
    
    private String relationship;
    
    //constructor to create an object of Person class
    public Person(String name, long phone, String relationship){
        super(name,phone);
        this.relationship=relationship;
    }
    
    //adds the Person specific information to Contact
    @Override
    public String getInfo()
    {
         return super.getInfo()+String.format("%-15s",relationship);
        
    }
}
