
/**
 * Write a description of class DigitArrayRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitArrayRunner
{

    public DigitArrayRunner()
    {

    }

    public static void main() 
    {
        DigitArray digits = new DigitArray();
        digits.loadArray(12345);
        printArray(digits.getDigits());
        System.out.println(" ");
        digits.loadArray(66225);
        printArray(digits.getDigits());
        System.out.println(" ");
        digits.loadArray(665);
        printArray(digits.getDigits());
        System.out.println(" ");
        digits.loadArray(45);
        printArray(digits.getDigits());
    }
    
    public static void printArray(int[] list)
    {
        for (int i = 0; i<list.length; i++)
        {
            System.out.print(list[i]+",");
        }
    }
}
