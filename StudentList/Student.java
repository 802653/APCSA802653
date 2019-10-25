
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String fullName;
    private String fName;
    private String mName;
    private String lName;
    int stuNumber;
    double gpa; 
    
    public Student(String fullname)
    {
        fullName = fullname;
    }

    public int parseMethod()
    {
        int commaLocation = fullName.indexOf(",");
        int firstSpaceLocation = fullName.indexOf(" ");
        int secondSpaceLocation = fullName.lastIndexOf(" ");
        
        if(commaLocation == -1) {
            if(secondSpaceLocation == -1) {
                

                
            }
            else {
                
                
            }
        }
        else {
            if(secondSpaceLocation == -1) {
                
            }
            else {
                
                
            }
        }
    }
    
}
