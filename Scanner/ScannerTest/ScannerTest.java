
/**
 * Scanner tester
 *
 * @author (eettlin)
 * @version (924)
 */

import java.util.Scanner;
public class ScannerTest{
    
    
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String fullName = "";
        //  if(str1 == str2)
        while(!fullName.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            fullName = kb.nextLine();
            if(!fullName.equals("quit")){
                Person person = new Person(fullName);
                person.intialize();
                System.out.println("first name: " + person.fName + "\rmiddle name: " + person.mName + "\rlast name: " + person.lName);
            }
        }
    }
}
