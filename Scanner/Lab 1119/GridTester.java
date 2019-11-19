
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.*;
public class GridTester
{
    
    static int[][] grid = new int[10][10];
    
    public GridTester() {
        
        
    }
    
    public static void main() {
        loadArray(grid);
        printGrid(grid);
        System.out.println("sum: " + sumAll(grid));
        System.out.println("greatest: " + findGreatest(grid));
        System.out.println("num of g: " + numberOfGreatest(grid));
        System.out.println("avg: " + findAvg(grid));
        System.out.println("mean: ");
        
        printArrayList(findMean(grid));
        System.out.println("\nmode: ");
        printArrayList(findMode(grid));
        System.out.println("\nmedian: ");
        printArrayList(findMedian(grid));
    } 
    public static void printArrayList(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        } 
        
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
    
    public static ArrayList<Integer> swap(ArrayList<Integer> list, int i, int j) {
        Integer temp;
        temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
        return list;
    }
    
    public static int[] swap(int[] list, int i, int j) {
        Integer temp;
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        return list;
    }
    
    public static int numberOfGreatest(int[][] list) {
        int greatest = findGreatest(list);
        return numberOf(list, greatest);
    }
    
    public static int numberOf(int[][] list, int l) {
        int number = 0;
        for(int i = 0; i < list.length; i++) {
            for(int r = 0; r < list[i].length;r++) {
                if(list[i][r] == l) number++;
            } 
        } 
        return number;
    }
    
    public static int numberOf(int[] list, int l) {
        int number = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i] == l) number++;
        } 
        return number;
    }
    
    public static ArrayList<Integer> sortIntegers(ArrayList<Integer> list) {
        for(int i = 1; i < list.size(); i++) {
            for(int j = i; j > 0; j--) {
                if(list.get(j) > list.get(j-1)) {
                    list = swap(list,j,j-1);
                }  
            }
        }    
        return list;
    }
    public static int[] sortIntegers(int[] list) {
        for(int i = 1; i < list.length; i++) {
            for(int j = i; j > 0; j--) {
                if(list[j] > list[j-1]) {
                    list = swap(list,j,j-1);
                }  
            }
        }    
        return list;
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
    
    public static ArrayList<Integer> findMean(int[][] list) {
        int sum = 0;
        int count = 0;
        ArrayList<Integer> averages = new ArrayList<Integer>();
        for(int i = 0; i < list.length; i++) {
            sum = 0;
            count = 0;
            for(int r = 0; r < list[i].length;r++) {
                sum+= list[i][r];
                count++;
                
            } 
            averages.add(sum/count);
        } 
        return averages;
    }
    public static void printList(int[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.print(i);
        }
        System.out.println("");
    }
    public static ArrayList<Integer> findMedian(int[][] list) {
        ArrayList<Integer> medians = new ArrayList<Integer>();
        for(int i = 0; i < list.length; i++) {
            list[i] = sortIntegers(list[i]);
            printList(list[i]);
            medians.add(list[i][(int)((list[i].length-1)/2)]);
        } 
        return medians;
    }

    public static ArrayList<Integer> findMode(int[][] list) {
        int num = 0;
        ArrayList<Integer> covered = new ArrayList<Integer>();
        int count = 0;
        ArrayList<Integer> modes = new ArrayList<Integer>();
        for(int i = 0; i < list.length; i++) {
            list[i] = sortIntegers(list[i]);
            num = 0;
            count = 0;
            for(int r = 0; r < list[i].length; r++) {
                if(numberOf(list[i],list[i][r]) > count) {
                    num = list[i][r];
                    count = numberOf(list[i],list[i][r]);
                }
            }
            modes.add(num);
            
        } 
        return modes;
    }
    
}
