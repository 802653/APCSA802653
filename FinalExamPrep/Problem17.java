
/**
 * Write a description of class Problem17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem17
{
    public static void main() {
        String s = "Strings are friends, not food";
        int x = s.indexOf("friends");
        int y = s.indexOf("food");
        String str = s.substring(0, x) + "g" + s.substring(y + 1);
        System.out.println(str);
        
    }
}
