
/**
 * Write a description of class Problem16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem16
{
    public static void numberCheck(int minNum, int maxNum){
        int total = 0;
        int k;
        for (k=1; k <= maxNum; k++) {
            if (k >= minNum) {
                total = total + k;
            }
        }
        System.out.println("the total is:" + total);
    }

}
