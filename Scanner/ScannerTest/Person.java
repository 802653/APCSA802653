
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    public String fName;
    public String mName;
    public String lName;
    public String fullName;
    /**
     * Constructor for objects of class Person
     */
    public Person(String fuName)
    {
        fullName = fuName;
    }

    public void intialize()
    {
        if(fullName.indexOf(",") > 0) { 
            int divider; 
            int divider2;
            int divider3;
            
            divider = fullName.indexOf(" ");
            
            divider2 = fullName.indexOf(" ",1);
            
            
            fName = fullName.substring(0,divider); 
            
            mName = fullName.substring(divider,divider2);
            
            lName = fullName.substring(divider2);
            
        }
        else {
            int divider; 
            int divider2;
            
            divider = fullName.indexOf(",");
            
            fName = fullName.substring(0,divider);
            
            mName = "none";
            
            lName = fullName.substring(divider);
            
            
            
            
        }
    }
}
