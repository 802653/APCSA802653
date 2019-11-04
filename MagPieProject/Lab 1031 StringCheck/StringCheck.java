
/**
 * Takes in predefined array/list and returns the elements with the key
 *
 * @author (Patrick Blankenberg)
 * @version (11319)
 */
import java.util.*;
public class StringCheck
{
    // instance variables - replace the example below with your own
    public static void main() {
        String[] array = {"abe", "cabe", "mabe", "tape", "lore","bore"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("abe", "cabe", "mabe", "tape", "lore","bore"));
        printList(wordChecker(array,"abe"));
        printList(wordChecker(list,"ore"));
    }
    public static ArrayList<String> wordChecker(String[] str, String key) {
        ArrayList<String> output = new ArrayList<String>();
        for(int i = 0; i < str.length; i++) {
            if(str[i].indexOf(key) != -1){
                output.add(str[i]);
            }
        }
        return output;
    }
    public static String[] wordChecker(ArrayList<String> str, String key) {
        String[] output = new String[str.size()];
        for(int i = 0; i < str.size(); i++) {
            if(str.get(i).indexOf(key) != -1){
                output[i] = str.get(i);
            }
        }
        return output;
    }
    public static void printList(String[] str) {
        for(int i = 0; i < str.length; i++) {
            if(str[i] != null) {
                System.out.println(str[i]);
            }
        }
    }
    public static void printList(ArrayList<String> str) {
        for(int i = 0; i < str.size(); i++) {
            if(str.get(i) != null) {
                System.out.println(str.get(i));
            }
        }
    }
}
