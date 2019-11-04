
/**
 * Write a description of class StringCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StringCheck
{
    
    
    
    public static void main() { 
        
        Scanner kb = new Scanner(System.in);
        String output = "";
        
        String[] test = new String[1];
        ArrayList<String> test2 = new ArrayList<>();

        while(!output.equals("stop")) {
            System.out.println("\nPlease enter a string, type stop to continue");
            output = kb.nextLine();
            
            test2.add(output);
            test = addArray(test,output);
            
        }
        System.out.println("\nPlease enter your search key");
        output = kb.nextLine();
        System.out.println("-------------------------------------USING ARRAY-------------------------------------");
        
        printList(wordChecker(test, output));

        System.out.println("-------------------------------------USING ARRAY LIST-------------------------------------");
        
        printList(wordChecker(test2, output));
            
        
        
    }
    
    public static String[] addArray(String[] list, String a) {
        
        String[] newList = new String[list.length+1];
        
        for(int i = 0; i < list.length; i++) {
         
            newList[i] = list[i];
            
        }
        
        return newList;
        
    }
    public static void printList(String[] list) {
        
        for(int i = 0; i < list.length; i++) {
            if(list[i] != null) {
                System.out.println(list[i]);
            }
        }
    }
    public static void printList(ArrayList<String> list) {
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) != null) {
                System.out.println(list.get(i));
            }
        }
    }
    
    public static ArrayList<String> wordChecker(String[] str, String key) {
        
        ArrayList<String> output = new ArrayList<String>();
        
        for(int i = 0; i < str.length; i++) {
            if(str[i] != null) {
                if(str[i].indexOf(key) != -1) {
                    output.add(str[i]);
                    
                }
            }   
        }
            
        return output;    
    }
    
    public static void print(String str) {
        System.out.println(str);
    }
    public static void print(int integer) {
        System.out.println(integer);
    }
   
    public static String[] wordChecker(ArrayList<String> str, String key) {
        
        String[] output = new String[str.size()];
        
        for(int i = 0; i < str.size(); i++) {
            if(str.get(i) != null) {
                if(str.get(i).indexOf(key) != -1) {
                    
                    output[i] = str.get(i);
                    
                }
                
            }
        }
        
        return output;
    }
}
