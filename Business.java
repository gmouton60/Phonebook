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
