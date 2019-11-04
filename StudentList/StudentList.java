
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class StudentList
{
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
        public void editStudentList(String lastName, int GPA, int newStudentNumber) {
            for(int i = 0; i < studList.size(); i++) {
                if(studList.get(i).getLastName().equals(lastName)) {
                    studList.get(i).setGPA(GPA);
                    studList.get(i).setStudentNumber(newStudentNumber);
                }
            }
        }
        
        public void editStudentList(int stuNumber, int GPA, int newStudentNumber) {
            for(int i = 0; i < studList.size(); i++) {
                if(studList.get(i).getLastName().equals(stuNumber)) {
                    studList.get(i).setGPA(GPA);
                    studList.get(i).setStudentNumber(newStudentNumber);
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
                System.out.println(studList.get(i).getFirstName()+" "+studList.get(i).getLastName() +", "+ studList.get(i).getGPA());
            }
        }
    }
    
    public void printStudent(String lastName) {
        for(int i = 0; i < studList.size(); i++) {
            if(studList.get(i) != null) {
                if(studList.get(i).getLastName().equals(lastName)) {
                    System.out.println("Student: " + studList.get(i).getFirstName() + " " + studList.get(i).getMiddleName() + " " + studList.get(i).getLastName());
                    System.out.println("GPA: " + studList.get(i).getGPA() + " Student Number:" + studList.get(i).getStudentNumber());
                }
            }
        }
    }
    
    public void printStudent(int stuNumber) {
        for(int i = 0; i < studList.size(); i++) {
            if(studList.get(i) != null) {
                if(studList.get(i).getStudentNumber() == stuNumber) {
                    System.out.println("Student: " + studList.get(i).getFirstName() + " " + studList.get(i).getMiddleName() + " " + studList.get(i).getLastName());
                    System.out.println("GPA: " + studList.get(i).getGPA() + " Student Number:" + studList.get(i).getStudentNumber());
                }
            }
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
