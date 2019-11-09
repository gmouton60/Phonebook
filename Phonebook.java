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
import java.util.Collections;
import java.util.ArrayList;
public class Phonebook {
   //creates an array list for Person and Business seperately
   private ArrayList<Person>person=new ArrayList<>();
   private ArrayList<Business>business=new ArrayList<>();
    
   //adds a contact of person type
   public void addPerson(String name, long number, String relationship)
   {
        Person p = new Person(name,number,relationship);
        person.add(p);
   }
    
   //adds a contact of business typer
   public void addBusiness(String name, long number, int zip)
   {
        Business b = new Business(name,number,zip);
        business.add(b);
   }
    
   //sorts the person array list 
   public void sortPerson()
   {
        Collections.sort(person);
   }
   
   //sorts the business contacts array list
   public void sortBusiness()
   {
        Collections.sort(business);
   }
   
   //prints all the contacts in alphabetically order according to name
   public void printContacts()
   {
       System.out.println(String.format("%-20s%-15s%-15s","Person name","Phone","Relationship"));
       System.out.println("----------------------------------------------------");
       sortPerson();
       sortBusiness();
       for(Person p : person){
           System.out.println(p.getInfo());
       }
       System.out.println("----------------------------------------------------");
       System.out.println(String.format("%-20s%-15s%-15s","Business name","Phone","Zip"));
       System.out.println("----------------------------------------------------");
       for(Business b : business){
           System.out.println(b.getInfo());
       }
   }
    
}
