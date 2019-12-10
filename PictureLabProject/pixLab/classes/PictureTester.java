package classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  public static void testArms()
  {
    Picture beach = new Picture("snowman.jpg");
    beach.explore();
    beach.mirrorArms();
    beach.explore();
  }
  
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testFlipDiagonally()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorD();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("swan.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture caterpillar = new Picture("seagull.jpg");
    caterpillar.explore();
    caterpillar.mirrorGull();
    caterpillar.explore();
  }
  
  public static void collageTest() //
  {
    Picture canvas = new Picture("canvasmejor.jpg");
    canvas.collageTest();
    canvas.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorVerticalRightToLeft();
    temple.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture temple = new Picture("blueMotorcycle.jpg");
    temple.explore();
    temple.mirrorHorizontal();
    temple.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture temple = new Picture("blueMotorcycle.jpg");
    temple.explore();
    temple.mirrorHorizontalBotToTop();
    temple.explore();
  }
  
  /** Method to test the collage method */
  /*public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    //canvas.createCollage();
    canvas.explore();
}*/
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
    
    Picture bm = new Picture("blueMotorcycle.jpg");
    bm.edgeDetection(20);
    bm.explore();
    
    Picture arch = new Picture("arch.jpg");
    arch.edgeDetection(50);
    arch.explore();
  }
  
  public static void nuke()
  {
      Picture nyke = new Picture("butterfly1.jpg");
      nyke.explore();
      nyke.negate();
      nyke.zeroBlue();
      nyke.mirrorVertical();
      nyke.fishScanner();
      nyke.mirrorD();
      nyke.explore();
      System.out.println("kabym");
      
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.testKeepOnlyBlue();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testFishScanner()
  {
    Picture beach = new Picture("lala.jpg");
    beach.explore();
    beach.fishScanner();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void copyTest() {
    Picture canvas = new Picture("canvasmejor.jpg");
    canvas.copyTest();
    canvas.explore();
      
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}