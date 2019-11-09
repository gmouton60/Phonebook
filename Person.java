/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
