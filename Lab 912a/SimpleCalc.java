
/**
 * Write a description of class SimpleCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private static double num1;
    private static double num2;

    public SimpleCalc(double x, double y)
    {
        num1 = x; 
        num2 = y; 
    }
    
    public static double add()
    {
        return num1+num2;
    }
    
    public static double subtract()
    {
        return num1-num2;
    }
    
    public static double multiply()
    {
        return num1*num2;
    }
    public static double divide()
    {
        if(num1 == 0 || num2 == 0)
        {
            return 0;
        }
        else
        {
            return num1/num2;
        }
    }
    public static double moduloDivide()
    {
        return num1%num2;
    }
    
    

}
