
public class Problem1
{
    public static void main() {
       String str1 = "Jobs, Steven Paul";
       String str2 = "Steven Paul Jobs"; 
       
       System.out.println("Which will return jobs?");
       try{System.out.println("A: " + str1.substring(7));}
       catch(Exception e) {System.out.println("A: Error");}
       try{System.out.println("B: " + str1.substring(str1.indexOf("Paul"),str1.indexOf("Jobs")-2));}
       catch(Exception e) {System.out.println("B: Error");}
       try{System.out.println("C: " + str1.substring(str2.indexOf("Paul"),str2.indexOf("Jobs")-2));}
       catch(Exception e) {System.out.println("C: Error");}
       try{System.out.println("D: " + str1.substring(str1.indexOf("n")+2));}
       catch(Exception e) {System.out.println("D: Error");}
    }
    
}
