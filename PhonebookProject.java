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
public class PhonebookProject {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Phonebook myPhoneBook = new Phonebook();
        
        //calls instances of Business Class
        myPhoneBook.addBusiness("WalMart", 22566647, 70809);
        myPhoneBook.addBusiness("Chick-fil-a", 22533448, 70808);
        myPhoneBook.addBusiness("Alpha Mechanic", 22566789, 70813);
        
        //calls instances of Person class
        myPhoneBook.addPerson("Luke Skywalker", 22500111, "Brother");
        myPhoneBook.addPerson("Darth Vader", 22500122, "Father");
        myPhoneBook.addPerson("Princess Lia", 22500133, "Sister");
        
        //prints all the contacts
        myPhoneBook.printContacts();
    }
    
}
