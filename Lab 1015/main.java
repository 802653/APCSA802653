
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class main
{
    // instance variables - replace the example below with your own
    public main()
    {

    }
    public static void run() 
    {
        ArrayList nums = new ArrayList<Integer>();   
        
        //printArray(nums);
        System.out.println("   ");
        System.out.println("Sum:" + getSum(nums));
        System.out.println("Mean:" + getMean(nums));
        System.out.println("Median:" + getMedian(nums));
        System.out.println("Mode:" + getMode(nums));
        
    }
    public static ArrayList<Integer> loadArray(ArrayList<Integer> x)
    {
        for(int i = 0; i < x.size(); i++)
        {
            x.set((int)(Math.random()*10)+1,i);
        }
        return x;
    }
    public static void printArray(ArrayList<Integer>x)
    {
        for (int i = 0; i < x.size(); i++)
        {
            System.out.println(x.get(i) + " ");
        }
    }
    public static int getSum(ArrayList<Integer> x)
    {
        int sum;
        sum = 0 ;
        for (int i = 0; i < x.size(); i ++ )
        {
            sum += x.get(i);
        }
        return sum;
    }
    public static double getMean(ArrayList<Integer> x) {
        return (double)(getSum(x)/x.size());
    }
    public static double getMedian(ArrayList<Integer> x) {
        Collections.sort(x);
        if (getSum(x) % 2 == 0)
        {
            return (x[(int)(x.size()/2)] + x[(int)(x.size()/2)+1])/2;
        }
        else
        {
            return x[x.size()/2];
        }
    }
    public static int getMode(ArrayList<Integer> x)
    {
        int counts[];
        counts = new int[11];
        for (int i = 0; i < x.size(); i ++ )
        {
            counts[x[i]] += 1;
        }
        int max = counts[0];        
        for (int i = 1; i < counts.length(); i++) 
        {
            if (max < counts[i]) {
                max = counts[i];
            }
        }
        for (int i = 0; i < counts.length(); i++) 
        {
            if (counts[i] == max) {
                printArray(counts);
                return i+1; 
            }
            
        }
        printArray(counts);
        return 1;
    }
    
}
