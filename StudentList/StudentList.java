
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList
{
    String tempVar = "";
    public StudentList()
    {

    }

    ArrayList<Student> studList = new ArrayList<Student>();
    
    public void addStudent(String fullName, double gpa, int studentNumber) {
        studList.add(new Student(fullName,gpa,studentNumber));
    }
    //PUBLIC VOID DELETESTUDENT
        public void deleteStudent(int stuNumber) {
            for(int i = 0; i < studList.size(); i++) {
                if(studList.get(i).getStudentNumber() == stuNumber) {
                    studList.remove(i);
                }
            }
        }
        
        public void deleteStudent(String lastName) {
            for(int i = 0; i < studList.size(); i++) {
                if(studList.get(i).getLastName().equals(lastName)) {
                    studList.remove(i);
                }
            }
        }
        
    //PUBLIC VOID EDITSTUDENTLIST
        public void editStudentList(int studentNumber) {
            for(int i = 0; i < studList.size(); i++) {
                if(studList.get(i).getStudentNumber() == studentNumber) {
                    Scanner kb = new Scanner(System.in);
                    System.out.print("What would you like the GPA to be? (Current gpa is "+studList.get(i).getGPA());
                    tempVar = kb.nextLine();
                    studList.get(i).setGPA(Double.valueOf(tempVar));
                    System.out.print("What would you like the First Name to be? (Current gpa is "+studList.get(i).getFirstName());
                    tempVar = kb.nextLine();
                    studList.get(i).setFirstName(tempVar);
                }
            }
        }
        
        public void editStudentList(String lastName) {
            for(int i = 0; i < studList.size(); i++) {
                if(studList.get(i).getLastName().equals(lastName)) {
                    Scanner kb = new Scanner(System.in);
                    System.out.print("What would you like the GPA to be? (Current gpa is "+studList.get(i).getGPA());
                    tempVar = kb.nextLine();
                    studList.get(i).setGPA(Double.valueOf(tempVar));
                    System.out.print("What would you like the First Name to be? (Current gpa is "+studList.get(i).getFirstName());
                    tempVar = kb.nextLine();
                    studList.get(i).setFirstName(tempVar);
                }
            }
        }
    
    public void clearList() {
        ArrayList<Student> newStudList = new ArrayList<Student>();
        studList = newStudList;
    }
    
    public void printList() {
        for (int i = 0; i < studList.size(); i++) {
            if(!studList.get(i).equals(null)) {
                System.out.println(studList.get(i).getFirstName()+" "+studList.get(i).getLastName() +", "+ studList.get(i).getGPA()+"," + studList.get(i).getStudentNumber());
            }
        }
    }
    
    public void printStudent(String lastName) {
        for(int i = 0; i < studList.size(); i++) {
            if(studList.get(i) != null) {
                if(studList.get(i).getLastName().equals(lastName)) {
                    if(!studList.get(i).getMiddleName().equals("")) System.out.println("Student: " + studList.get(i).getFirstName() + " " + studList.get(i).getMiddleName() + " " + studList.get(i).getLastName());
                    else System.out.println("Student: " + studList.get(i).getFirstName() + " " + studList.get(i).getLastName());
                    System.out.println("GPA: " + studList.get(i).getGPA() + " Student Number:" + studList.get(i).getStudentNumber());
                }
            }
        }
    }
    
    public void printStudent(int stuNumber) {
        for(int i = 0; i < studList.size(); i++) {
            if(studList.get(i) != null) {
                if(studList.get(i).getStudentNumber() == stuNumber) {
                    if(!studList.get(i).getMiddleName().equals("")) System.out.println("Student: " + studList.get(i).getFirstName() + " " + studList.get(i).getMiddleName() + " " + studList.get(i).getLastName());
                    else System.out.println("Student: " + studList.get(i).getFirstName() + " " + studList.get(i).getLastName());
                    System.out.println("GPA: " + studList.get(i).getGPA() + " Student Number:" + studList.get(i).getStudentNumber());
                }
            }
        }
    }
    
    public ArrayList<Student> swap(ArrayList<Student> list, int i, int j) {
        Student temp;
        temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
        return list;
    }
    
    public ArrayList<Student> sortStudents(ArrayList<Student> list, boolean method) {
        if(method){
            for(int i = 1; i < list.size(); i++) {
                for(int j = i; j > 0; j--) {
                    if(list.get(j).getStudentNumber() > list.get(j-1).getStudentNumber()) {
                        list = swap(list,j,j-1);
                    }  
                }
            
            }
            return list;
        }
        else {
            for(int i = 1; i < list.size(); i++) {
                for(int j = i; j > 0; j--) {
                    if(list.get(j).getStudentNumber() > list.get(j-1).getStudentNumber()) {
                        list = swap(list,j,j-1);
                    }  
                }
            
            }
            return list;
            
        }
    }


    /*public void SortStudents(String lastName) {
        
    }
    
    public static ArrayList<Student> swap(ArrayList<Student> list, int i, int j) {
        Student temp = null;
        temp = list.get(i);
        list.get(i) = list.get(j);
        list.get(j) = temp;
        return list;
    }
    
    public void SortStudents(int stuNumber) {
        int min = 0;
        for(int i = 0; i < studList.size(); i++) {
            min = i;
            for(int j = i+1; j < studList.size(); i++) {
                if(studList.get(min).getStudentNumber() > studList.get(j).getStudentNumber()) min = j;
            }
            studList = swap(studList, min, i);
        }
    }
    
    public ArrayList<Student> filterSearchStudentList(String key) {
        return studList;
    }*/
}
