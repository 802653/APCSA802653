
/**
 * Write a description of class DigitArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitArray
{
    private int num;
    private int[] digits; 
    public DigitArray()
    {
        
    }

    public void loadArray(int num)
    {
        int length = lengthOfInteger(num);
        int r = 10;
        digits =  new int[length];
        for (int i = 0; i<digits.length; i++) {
            digits[digits.length-i-1] = num % (r);
            num = (int)(num/10);
        }
        
    }
    public int lengthOfInteger(int num) 
    {
        int length = 0;
        int x = 1;
        while ( x < num ) 
        {
            length++;
            x=x*10;
        }        
        return length;
    }
    public int[] getDigits()
    {
        return digits;
    }
}
