
/**
 * Scanner tester
 *
 * @author (pblankenberg)
 * @version (924)
 */

import java.util.Scanner;
public class ScannerTest{
    
    public static Person[] PersonList = new Person[0];
    
    public static void printNames() {
        System.out.println("Names:");
        for (int i = 0; i < PersonList.length; i++) {
            System.out.println(PersonList[i].fName+" "+PersonList[i].mName+" "+PersonList[i].lName );
        }
        System.out.println("");
    }
    
    public static Person[] extendList(Person[] p, Person e){
    
        Person[] newList = new Person[p.length+1];
        
        
        for (int i = 0; i < p.length; i++) {
            newList[i] = p[i];
        }
        
        newList[newList.length-1] = e;
        
        return newList;
    }
    
    public static void main() {
        Scanner kb = new Scanner(System.in);
        String fullName = "";
        while(!fullName.equals("quit")) {
            System.out.println("Enter a name or type \"quit\" to quit");
            fullName = kb.nextLine();
            if(fullName.equals("printNames")){
                printNames();
            }
            else {
                try {
                    Person person = new Person(fullName);
                    person.intialize();
                    System.out.println("first name: " + person.fName + "\rmiddle name: " + person.mName + "\rlast name: " + person.lName);
                    PersonList = extendList(PersonList, person);                    
                }
                catch(Exception e) {
                    if(fullName.equals("quit")) System.out.println("Closing program...");
                    else System.out.println("Exception thrown: faulty name format; processed potetionally incorrectly");
                }
            }
        }
    }
}
