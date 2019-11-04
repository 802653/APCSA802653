
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;


public class BubbleSort
{

    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort()
    {
        // initialise instance variables

    }

    public static void main() {
        
        int[] list = new int[2000];
        
        list = generateList(list.length);
       
        list = bubbleSort(list);
        
        printList(list);
    }
    public static void printList(int[] list) {
        
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
    
    public static int[] bubbleSort(int[] list) {
        
        for(int i = 0; i < list.length; i++) {
            
            for(int j = 0; j < list.length - i -1; j++) {
                
                if(list[j] > list[j+1]) {

                    list = swap(list, j, j+1);
                    
                }
                
            }
            
        }
        
        return list;
        
    }
}
