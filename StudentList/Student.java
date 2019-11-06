
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
    
    public Student(String fullname, double gpaN, int studentNumber)
    {
        fullName = fullname;
        stuNumber = studentNumber;
        gpa = gpaN;
        parseMethod();
    }

    public void parseMethod()
    {
        int commaLocation = fullName.indexOf(",");
        int firstSpaceLocation = fullName.indexOf(" ");
        int secondSpaceLocation = fullName.lastIndexOf(" ");
        
        if(commaLocation == -1) {
            if(secondSpaceLocation != -1) {
                
                fName = fullName.substring(0,firstSpaceLocation);
                mName = "";
                lName = fullName.substring(firstSpaceLocation+1);
                
            }
            else {

                fName = fullName.substring(0,firstSpaceLocation);
                mName = fullName.substring(firstSpaceLocation+1,secondSpaceLocation);
                lName = fullName.substring(secondSpaceLocation+1); 
                
            }
        }
        else {
            if(secondSpaceLocation != -1) {
                
                fName = fullName.substring(0,commaLocation);
                mName = fullName.substring(commaLocation+2,secondSpaceLocation);
                lName = fullName.substring(secondSpaceLocation);
                
            }
            else {
                
                fName = fullName.substring(0,commaLocation);
                mName = fullName.substring(commaLocation+2);
                lName = "";
                
            }
        }
    }
    
    public String getFirstName() {
        return fName;
    }
    public String getMiddleName() {
        return mName;
    }
    public String getLastName() {
        return lName;
    }
    public double getGPA() {
        return gpa;
    }
    public int getStudentNumber() {
        return stuNumber;
    }
    public void setGPA(int newGPA) {
        gpa = newGPA;
    }
    public void setStudentNumber(int newStudentNumber) {
        stuNumber = newStudentNumber;
    }
    
}
