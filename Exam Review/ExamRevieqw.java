
/**
 * Write a description of class ExamRevieqw here.
 *
 * @author (Pblankenberg) Copied from notebook; 
 * @version (916)
 */
public class ExamRevieqw
{
    // instance variables - replace the example below with your own
    // test 1
    private int num2 = 7;
    // boolean test = 7;
    // boolean test == true;
    // int x = 7.23;
    //int val = 7/12.0;
    double num1 = num2%3; //Correct

    //test 2
    //Class name = new Constructor(Parameters)
    //Pumpkin p1 = new Pumpkin(5);
    public class Test{
        private int var1;
        private int var2;
        public Test(int x, int y) {
            var1 = x;
            var2 = y;
        }

        public int multiply(int x, int y) {
            return x*y;
        }

    }
    public int findLength(int integer) {
        int i = 1;
        int x = 1;
        while(x < integer){
            x = x * 10;
            i++;
        }
        return i;
    }
    public class Pumpkin{
        private int num;
        public Pumpkin(int n, double y){
            num = n;
        }

    }
    Pumpkin p  = new Pumpkin(3, 3.14);
    public class Numbers{
        int fport;
        int ple;
        public Numbers(int x, int y) {
            fport = x;
            ple = y;
        }

        public int multiply(int x,int y) {
            return fport*ple;
        }
    }
    public int sumOfInteger(int num){
        int length = findLength(num);
        int[] list = new int[length];
        for(int i = 0; i < list.length; i++) {
            list[i] = num%10;
            num = (int)(num/10);
        }
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];
        }
        return sum;
    }
    public static void main() {
        sum(5,3);   
    }
    public static int sum(int x,int y) {
        return x +y;
    }

    public static void f() {
        double num1 = 8.0, num2 = 8.0;
        if(num1 > num2)
            System.out.println("Peace Out");
        else if(num1 <= num2)
            System.out.println("Far Out");
        else if(num1 == num2)
            System.out.println("Space Out");
        else 
            System.out.println("Freak Out");

    }

    public static void r() {
        int cntrl= 0, num = 5;
        while(cntrl < num ){
            cntrl++;
            System.out.print("num = " + num + ", cntrl = " + cntrl);
        }

    }

    public int multiply(int x,int y) {
        return x *y;
    }

    public int divide(int x,int y) {
        return x /y;
    }

    public int subtract(int x,int y) {
        return x -y;
    }

    public void problem9() {
        int[] randomNums = new int[100];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int)(Math.random()*10) + 1;
        }
    } 

    public void problem10() {
        int[] list = new int[50];
        for (int i = 0; i < list.length; i++) {
            if (list[i]%2 == 0) {
                System.out.print(i);
            }
        }
    }

    public void problem11() {
        int sum = 0;
        int[] list = new int[50];
        for(int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println(sum);
    }

    public int[] copyArray(int[] origArr) {
        int[] newArray = new int[origArr.length];
        for(int i = 0; i < newArray.length;i++) {
            newArray[i] = origArr[i];
        }
        return newArray;
    }
}
