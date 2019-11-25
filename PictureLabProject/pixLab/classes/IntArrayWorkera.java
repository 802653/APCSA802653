package classes;

public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
<<<<<<< HEAD
  public int getCount(int val) {
      int count = 0;
      for(int i = 0; i < matrix.length; i++) {
          for(int j = 0; j < matrix[i].length; j++) {
              if(matrix[i][j] == val) count++;
          }
      }
      return count;
  }
=======
  public void getCount() {
      
      
     //I need to github the instruction file, because i cant find activity 4
      
      
    }
>>>>>>> 519838784485d115bc1e626021234a9bf7506ff8
  
  public int getLargest() {
      int greatest = 0;
      for(int i = 0; i < matrix.length; i++) {
          for(int j = 0; j < matrix[i].length; j++) {
              if(matrix[i][j] > greatest) greatest = matrix[i][j];
          }
      }
      return greatest;
  }
  public int getColTotal(int column) {
     int total = 0;
     try {
         
          
         for (int item : matrix[column])
         {
           total = total + item;
         }
          
         
     }
     catch(Exception e) {
         System.out.println("Invalid column:" + e);
     }
     return total;
  }
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
 
}