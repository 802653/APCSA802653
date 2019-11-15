
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class GridTester
{
    
    static int[][] grid = new int[9][9];
    
    public GridTester() {
        
        
    }
    
    public static void main() {
        loadArray(grid);
        printGrid(grid);
        System.out.println("sum: " + sumAll(grid));
        System.out.println("greatest: " + findGreatest(grid));
        System.out.println("num of g: " + numberOfGreatest(grid));
        System.out.println("avg: " + findAvg(grid));
    } 
    public static void printGrid(int[][] list) {
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            for(int r = 0; r < list[i].length;r++) {
                System.out.print(list[i][r] + " ");
            } 
            System.out.println();
        } 
    }
    public static int sumAll(int[][] list) {
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            for(int r = 0; r < list[i].length;r++) {
                sum+= list[i][r];
            } 
        } 
        return sum;
    }
    public static int[][] loadArray(int[][] list) {
        for(int i = 0; i < list.length; i++) {
            for(int r = 0; r < list[i].length;r++) {
                list[i][r] = (int)(Math.random() * 10);
            } 
        } 
        return list;
    }
    
    public static int findGreatest(int[][] list) {
        int greatest = 0;
        for(int i = 0; i < list.length; i++) {
            for(int r = 0; r < list[i].length;r++) {
                if(list[i][r] > greatest) greatest = list[i][r];
            } 
        } 
        return greatest;
    }
    
    public static int numberOfGreatest(int[][] list) {
        int greatest = findGreatest(list);
        int number = 0;
        for(int i = 0; i < list.length; i++) {
            for(int r = 0; r < list[i].length;r++) {
                if(list[i][r] == greatest) number++;
            } 
        } 
        return number;
    }
    
    public static int findAvg(int[][] list) {
        int sum = 0;
        int count = 0;
        for(int i = 0; i < list.length; i++) {
            for(int r = 0; r < list[i].length;r++) {
                sum+= list[i][r];
                count++;
            } 
        } 
        return sum/count;
    }
    
}
