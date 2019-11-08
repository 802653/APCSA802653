
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
        String tempVar = "";
        String tempVar2 = "";
        String output = "";
        while(!output.equals("8")) {
            System.out.println("\nPlease Select the Following Options\n1) Add Student\n2) Delete Student\n3) Edit Student\n4) Reset List\n5) Print List\n6) Print Student\n7) Sort Students\n8) Quit");
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
            if(output.equals("2")) { // delete student
                System.out.println("Enter the last name or student number of the student you would like to delete");
                tempVar = kb.nextLine();
                try {
                    studentList.deleteStudent(Integer.valueOf(tempVar));
                }
                catch(Exception e) {
                    studentList.deleteStudent(tempVar);
                }
            }
            if(output.equals("3")) { //edit student
                System.out.println("Enter the last name or student number of the student you would like to edit");
                tempVar = kb.nextLine();
                System.out.println("Enter the new last name or new gpa of the student");
                tempVar2 = kb.nextLine();
                try{
                    studentList.editStudentList(Integer.valueOf(tempVar),Integer.valueOf(tempVar2));
                }
                catch(Exception e) {
                    studentList.editStudentList(Integer.valueOf(tempVar),Double.valueOf(tempVar2));
                }

            }
            if(output.equals("4")) { //reset list
                for(int i = 0; i < studentList.studList.size(); i++) {
                    studentList.studList.set(i,null);
                }
            }
            if(output.equals("5")) { //print list
                studentList.printList();
            }
            if(output.equals("6")) { // print student
                System.out.println("Enter the last name or student number of the student you would like to print");
                tempVar = kb.nextLine();
                try {
                    studentList.printStudent(Integer.valueOf(tempVar));
                }
                catch(Exception e) {
                    studentList.printStudent(tempVar);
                }
            }
            if(output.equals("7")) { // sort students
                
            }
            
        }
        
    }
    public static void clr() {
        System.out.print("\u000c");
    }
}
