package activity3;

/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Patrick Blankenberg
 * @version 10319
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        
        int notFoundPsn = sample.indexOf("slow"); 
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn); 
        //  Try other methods here:
        
        String newString = "funny abc 123 abc funny";
        System.out.println("newString.indexOf(\"abc\") = " + newString.indexOf("abc")); 
        System.out.println("newString.indexOf(\"abc\",10) = " + newString.indexOf("abc",10)); 
        
    }

}
