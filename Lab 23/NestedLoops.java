
/**
 * Write a description of class NestedLoops here.
 *
 * @author (patrick blankenberg)
 * @version (91819)
 */
public class NestedLoops
{
    // instance variables - replace the example below with your own
    public static void problemA() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    
    public static void problemB() {
        for (int i = 5; i > 1; i--) {
            for (int j = 0; j < 8; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    
    public static void problemC(int n) {
        for (int i = 0; i < n; i++) {
            for (int r = 0; r < n; r++) {
                System.out.print(n);
            }
            System.out.println("");
        }  
    }
    
    public static void problemD(int n) {
      for (int i = n; i < 0; i++) {
            System.out.print("-");
            for (int r = 0; r < n; r++) {
                System.out.print(n);
            }
            System.out.println("");
        }           
    }
}
