
/**
 * Write a description of class Problem6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem6
{
    public static String go(int x){
        if (x <= 5)
            return "same";
        else if (x >= 3)
            return "notsame";
        return "done";
    }

    public static void main(){System.out.print(go(3));}
}
