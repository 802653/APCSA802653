
/**
 * Write a description of class CalculatorRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorRunner
{
    // instance variables - replace the example below with your own
    private static double num1 = 5;
    private static double num2 = 2;
    public CalculatorRunner()
    {

    }
    
    public static void main() {
        SimpleCalc number = new SimpleCalc(num1,num2);
        System.out.println(number.add());
        System.out.println(number.subtract());
        System.out.println(number.divide());
        System.out.println(number.multiply());
        System.out.println(number.moduloDivide());
    }

}
