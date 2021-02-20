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
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("peacock2.jpg");
	beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture caterpillar = new Picture("tricolorart.jpg");
    caterpillar.explore();
	caterpillar.zeroGreen();
	caterpillar.zeroRed();
    caterpillar.explore();
	caterpillar.write("triblue.jpg");
  }
  
   public static void testKeepOnlyGreen()
  {
    Picture caterpillar = new Picture("tricolorart.jpg");
    caterpillar.explore();
	caterpillar.zeroBlue();
	caterpillar.zeroRed();
    caterpillar.explore();
	caterpillar.write("triblue.jpg");
  }
  
   public static void testKeepOnlyRed()
  {
    Picture caterpillar = new Picture("tricolorart.jpg");
    caterpillar.explore();
	caterpillar.zeroGreen();
	caterpillar.zeroBlue();
    caterpillar.explore();
	caterpillar.write("triblue.jpg");
  }
  
  public static void testNegate()
  {
    Picture caterpillar = new Picture("tricolorart.jpg");
    caterpillar.explore();
	caterpillar.negateRed();
	caterpillar.negateGreen();
	caterpillar.negateBlue();
    caterpillar.explore();
	caterpillar.write("triNegative.jpg");

  }
  
  
  public static void test()
  {
    Picture caterpillar = new Picture("tricolorart.jpg");
    caterpillar.explore();
	caterpillar.greyScale();
	    caterpillar.explore();
	caterpillar.write("triGreyScale.jpg");
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testZeroBlue();
    // testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    test();
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