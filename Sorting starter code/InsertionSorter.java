 


/**
 * Write a description of class SelectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  

public class InsertionSorter extends Sorter
{

    public InsertionSorter() {
        super();
    }

    public void sort(int[] a) {
        for(int i = 1; i < a.length; i++) {

            for(int j = i; j > 0; j--) {
                if(less(a[j],a[j-1])) {
                    swap(a,j,j-1);
                }
            }

        }
    }

}