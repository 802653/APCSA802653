
/**
 * Crunches data of an Arraylist of Integers. Modified version of lab 910, but with a working mode and made with ArrayList
 *
 * @author (pBlankenberg)
 * @version (10/15/19)
 */
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;
public class main
{
    // instance variables - replace the example below with your own
    public main()
    {

    }
    public static void run() 
    {
        
        /* ArrayList nums = new ArrayList<Integer>();   
        
	Scanner in = new Scanner (System.in);
	System.out.println("Welcome, input a set of integers. When you want to crunch the numbers, type return");
	String statement = in.nextLine();
	
	
	while (!statement.equals("return"))
	{
	        nums.add(statement);
		statement = in.nextLine();
	*/
        ArrayList nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(33);
        nums.add(70);
        nums.add(55);
        nums.add(45);
        nums.add(25);
        nums.add(25);
        
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
        sum = 0;
        for (int i = 0; i < x.size(); i ++ )
        {
            sum += x.get(i).intValue();
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
            return (x.get((int)(x.size()/2)) + x.get((int)((x.size()-1)/2)))/2;
        }
        else
        {
            return x.get(x.size()/2);
        }
    }
    public static int getMode(ArrayList<Integer> x)
    {
        int max = 0;
        int index = 0;
        for (int i = 0; i < x.size(); i++ )
        {
            int count = 0;
            
            for (int r = 0; r < x.size(); r++) {
                if (x.get(r) == x.get(i)) count++;
            }
            System.out.println(count + "   " + max + "  " + index);
            if (count > max) index = i;
            if (count > max) max = count;
            
        }
        return x.get(index);
    }
    
}
