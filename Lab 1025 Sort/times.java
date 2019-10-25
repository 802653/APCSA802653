
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.util.concurrent.TimeUnit;

public class times
{

    /**
     * Constructor for objects of class BubbleSort
     */
    public times()
    {
        // initialise instance variables

    }

    public static void main() {
        
        /*int[] list = new int[15000];
        
        list = generateList(list.length);
        
        printList(insertionSort(list));
        
        list = generateList(list.length);
        
        System.out.println("\n\n\n\n ");
        
        printList(bubbleSort(list));
        
        list = generateList(list.length);
        
        System.out.println("\n\n\n\n ");
        
        printList(selectionSort(list));
        
        */System.out.println("\n\n\n\n ");
        
        long[] bubbleSortTimes = new long[35];
        
        long[] selectionSortTimes = new long[35];
        
        long[] insertionSortTimes = new long[35];
        
        for(int i = 1000; i < 10; i +=30) {
            
            int[] oldList = new int[i*10];
            
            int[] list = new int[i*10];
            
            oldList = generateList(oldList.length);
            
            list = oldList;
            
            bubbleSortTimes[i] = bubbleSort(list);
            
            list = oldList;
            
            selectionSortTimes[i] = selectionSort(list);
            
            list = oldList;
            
            insertionSortTimes[i] = insertionSort(list);
           
            System.out.println("calculating" + i*10);
        }
        
        System.out.println("bubble times:");
        printList(bubbleSortTimes);
            
        System.out.println("selection times:");
        printList(selectionSortTimes);
            
        System.out.println("insertion times:");
        printList(insertionSortTimes);
        
        
    }
    public static void printList(long[] list) {
        for(int i = 0; i < list.length; i++) {
            
            System.out.print(list[i]+" ,");
            if(i%50 == 0) {
                System.out.println(" ");
            }
            
        }
        
    }
    public static int[] generateList(int n) {
     
        int[] list = new int[n];
        
        for(int i = 0; i < list.length; i++) {
         
            list[i] = (int)(Math.random() * 1000);
            
        }
        
        return list;
    }
    
    public static int[] swap(int[] list, int i, int j) {
        int temp = 0;
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        return list;
    }
       
    public static long bubbleSort(int[] list) {
        long startTime = System.nanoTime(); 
        
       
        int comparisons = 0;
        int swaps = 0;
        
        for(int i = 0; i < list.length; i++) {
            
            for(int j = 0; j < list.length - i -1; j++) {
                comparisons = comparisons + 1;
                if(list[j] > list[j+1]) {

                    swaps = swaps + 1;
                    list = swap(list, j, j+1);
                    
                }
                
            }
            
        }
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        return(TimeUnit.NANOSECONDS.toMillis(durationInNano));
        
    }
    
    public static long insertionSort(int[] list) {
        long startTime = System.nanoTime(); 
        int comparisons = 0;
        int swaps = 0;
        
        for(int i = 1; i < list.length; i++) {
            
            for(int j = i; j > 0; j--) {
                comparisons = comparisons + 1;
                if(list[j] > list[j-1]) {
                    swaps = swaps + 1;
                    list = swap(list,j,j-1);
                }
            }
            
        }
        
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        return(TimeUnit.NANOSECONDS.toMillis(durationInNano));
        
    }
    
    public static long selectionSort(int[] list) {
        long startTime = System.nanoTime(); 
        int comparisons = 0;
        int swaps = 0;
        int min = 0;
        for(int i = 0; i < list.length; i++ ) {
            min = i;
            for(int j = i+1; j < list.length; j++) {
               if(list[min] > list[j]) min = j;
               comparisons++;
            }
            swaps++;
            list = swap(list, min, i); 
        }
        
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        return(TimeUnit.NANOSECONDS.toMillis(durationInNano));
    }
}
