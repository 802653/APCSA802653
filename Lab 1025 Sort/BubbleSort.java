
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.util.concurrent.TimeUnit;

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

        int[] list = new int[15000];

        list = generateList(list.length);

        printList(insertionSort(list));

        list = generateList(list.length);

        System.out.println("\n\n\n\n ");

        printList(bubbleSort(list));

        list = generateList(list.length);

        System.out.println("\n\n\n\n ");

        printList(selectionSort(list));

        System.out.println("\n\n\n\n ");

        int[] bubbleSortTimes = new int[35];

        int[] selectionSortTimes = new int[35];

        int[] insertSortTimes = new int[35];

        for(int i = 10; i < 35000; i += 1000) {

            int[] oldList = new int[i];

            oldList = generateList(oldList.length);

            list = oldList;

            bubbleSort(list);

            list = oldList;

            selectionSort(list);

            list = oldList;

            insertionSort(list);
            
            list = oldList;
            
            mergeSort(list, list.length);

            printList(list);
        }
    }

    public static void printList(int[] list) {

        /*for(int i = 0; i < list.length; i++) {

        System.out.print(list[i]+" ,");
        if(i%50 == 0) {
        System.out.println(" ");
        }

        }*/

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
        System.out.println("Bubble Sort: comparisons:" + comparisons + " swaps:" + swaps + " elapsed: " + TimeUnit.NANOSECONDS.toMillis(durationInNano));
        return list;

    }

    public static int[] insertionSort(int[] list) {
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
        System.out.println("Insertion Sort: comparisons:" + comparisons + " swaps:" + swaps + " elapsed: " + TimeUnit.NANOSECONDS.toMillis(durationInNano));
        return list;

    }

    public static int[] selectionSort(int[] list) {
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
        System.out.println("Selection Sort: comparisons:" + comparisons + " swaps:" + swaps + " elapsed: " + TimeUnit.NANOSECONDS.toMillis(durationInNano));
        return list;
    }

    /*
     * 
     */
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {return;} //  Base Case
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        //+++++++++ Helper Function ++++++++++++
        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[]l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while(i < left && j < right) {
            if(l[i] <= r[j]) {
                a[k++] = l[i++];

            }
            else {
                a[k++] = r[j++];

            }
            while(i < left) { a[k++] = l[i++];}
            while (j <  right) { a[k++] = r[j++];}
        }
    }
}
