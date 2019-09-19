
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
        for (int i = n; i > 0; i--) {
            for (int r = 0; r < i; r++) {
                System.out.print("-");

            }
            System.out.print(n-i+1);
            System.out.println("");
        }           
    }

    public static void problemE() {
        for (int i = 0; i < 6; i++) {
            for (int j = 6-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int e = i+1; e > 0; e--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void problemF() {
        System.out.println("");
        for (int i = 0; i < 13; i++) {
            for (int j = 13-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int r = i+1; r > 0-i; r--) {
                System.out.print("*");
            }     
            System.out.println("");
        }
        for (int i = 13; i >= 0; i--) {
            for (int j = 13-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int r = i+1; r > 0-i; r--) {
                System.out.print("*");
            }     
            System.out.println("");
        }
    }
    public static void createDiamond(boolean inverse) {
        if (inverse == false) {
            for (int i = 0; i <= 4; i++) {
                System.out.print("|        ");
                for (int j = 4-i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int r = i+1; r > 0-i; r--) {
                    if (r == 1) {
                        System.out.print("+");
                    }
                    else if (r > 1) {
                        System.out.print("/");
                    }
                    else {
                        System.out.print("\\");
                    }
                }   
                for (int y = 4-i; y > 0; y--) {
                    System.out.print(" ");
                }
                
                System.out.print("       |");
                if (i != 4) {
                System.out.println("");
            }
            }
        }
        else {
            for (int i = 4; i >= 0 ; i--) {
                System.out.print("|        ");
                for (int j = 4-i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int r = i+1; r > 0-i; r--) {
                    if (r == 1) {
                        System.out.print("+");
                    }
                    else if (r > 1) {
                        System.out.print("\\");
                    }
                    else {
                        System.out.print("/");
                    }
                }   
                for (int y = 4-i; y > 0; y--) {
                    System.out.print(" ");
                }
                
                System.out.print("       |");
                if (i != 0) {
                System.out.println("");
            }
            }
        }
    }
    public static void problemG() { // why :'(
        System.out.println("");
        for (int i = 7; i > 0; i--) {
            System.out.println("");
            if(i == 1 || i == 4 || i == 7) {
                System.out.print("+");
                for (int r = 0; r < 8; r++) {
                    System.out.print(" - ");
                }
                System.out.print("+");
            }
            else if (i == 5 || i == 3) {
                createDiamond(true);
            }
            else if (i == 2 || i == 6) {
                createDiamond(false);
            }
        }
    }
}
