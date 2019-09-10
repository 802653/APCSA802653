
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
import java.util.Arrays;
public class main
{
    // instance variables - replace the example below with your own
    public main()
    {

    }
    public static void run() 
    {
        int nums[];
        nums = new int[100];    
        nums = loadArray(nums);
        printArray(nums);
        System.out.println("   ");
        System.out.println(getSum(nums));
        System.out.println(getMean(nums));
        System.out.println(getMedian(nums));
        
    }
    public static int[] loadArray(int[] x)
    {
        for(int i = 0; i < x.length; i++)
        {
            x[i] = (int)(Math.random()*10)+1;
        }
        return x;
    }
    public static void printArray(int[] x)
    {
        for (int i = 0; i < x.length; i++)
        {
            System.out.println(x[i]);
        }
    }
    public static int getSum(int[] x)
    {
        int sum;
        sum = 0 ;
        for (int i = 0; i < x.length; i ++ )
        {
            sum += x[i];
        }
        return sum;
    }
    public static double getMean(int[] x) {
        return (double)(getSum(x)/x.length);
    }
    public static double getMedian(int[] x) {
        Arrays.sort(x);
        if (getSum(x) % 2 == 0)
        {
            return (x[(int)(x.length/2)] + x[(int)(x.length/2)+1])/2;
        }
        else
        {
            return x[x.length/2];
        }
    }
    
}
