
/**
 * Write a description of class StudentListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StudentListRunner
{
    // instance variables - replace the example below with your own

    
    public static StudentList studentList = new StudentList();
    
    public StudentListRunner()
    {
        
    }

    public static void main() {
        Scanner kb = new Scanner(System.in);
        String name = "";
        double gpa = 0;
        int number = 0;
        String output = "";
        while(!output.equals("stop")) {
            System.out.println("\nPlease Select the Following Options\n1) Add Student\n2) Delete Student\n3) Edit Student\n4) Reset List\n5) Print List\n6) Print Student\n7) Sort Students");
            output = kb.nextLine();
            
            if(output.equals("1")) {
                System.out.println("Enter the full name of the student");
                name = kb.nextLine();
                System.out.println("Enter the GPA of the student");
                gpa = Double.valueOf(kb.nextLine());
                System.out.println("Enter the student number of the child");
                number = Integer.valueOf(kb.nextLine());
                studentList.addStudent(name, gpa, number);
                System.out.println("Student added!\n");
            }
            if(output.equals("2")) {
                
            }
            if(output.equals("3")) {
                
            }
            if(output.equals("4")) {
                
            }
            if(output.equals("5")) {
                studentList.printList();
            }
            if(output.equals("6")) {
                System.out.println("Enter the last name or student number of the student you would like to print");
                studentList.printStudent(kb.nextLine());
            }
            if(output.equals("7")) {
                
            }
            
        }
        
    }
}
