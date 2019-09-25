
/**
 * Write a description of class Person here.
 *
 * @author (pBlankenberg)
 * @version (92419)
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

    public void intialize() //will break if you add an extra space at end, so dont do that :)
    {
        String tempFullName = fullName;
        if(fullName.indexOf(",") < 0) { 
            int divider; 
            
            divider = tempFullName.indexOf(" ");
            
            fName = tempFullName.substring(0,divider); 
            
            tempFullName = tempFullName.substring(divider+1);
            
            divider = tempFullName.indexOf(" ");
            
            if(tempFullName.indexOf(" ") < 0) {
            
                lName = tempFullName;
                mName = "";
            } 
            else {
                mName = tempFullName.substring(0,divider);

                lName = tempFullName.substring(divider);
            }

        }
        else {
            int divider; 
            int divider2; 
            
            divider = fullName.indexOf(", ");
            divider2 = fullName.indexOf(" ");
            
            
            lName = fullName.substring(0,divider);
            
            tempFullName = fullName.substring(divider+2);
            
            if(tempFullName.indexOf(" ") < 0) {
            
                fName = tempFullName;
                mName = "";
            } 
            else {
                fName = tempFullName.substring(0,divider2);
                mName = tempFullName.substring(divider2);
            }
        }
    }
}
