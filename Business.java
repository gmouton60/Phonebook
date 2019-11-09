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
//extension of Contact
public class Business extends Contact{
    
    private int Zip;
    
    //constructor to create an object of Business class
    public Business(String name, long phone, int Zip ){
        super(name,phone);
        this.Zip=Zip;
    }
    
    //adds the Business specific information to Contact
    @Override
    public String getInfo()
    {
        return super.getInfo()+String.format("%-15d",Zip);
    }
}
