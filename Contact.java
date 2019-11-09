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

//base clase with a contacts name and phone number
public class Contact implements Comparable<Contact> {
    private String name;
    private long phone;
    
    //constructor to initialize a contact object
    public Contact(String name, long phone)
    {
        this.name = name;
        this.phone = phone;
    }
    
    //function to get info for printing
    public String getInfo()
    {
        return String.format("%-20s%-15d",name, phone); 
    } 
    
    //compares contacts by the name of the contact for both Person and Business
    public int compareTo(Contact other)
    {
        return name.compareTo(other.name);
    }
   
}
