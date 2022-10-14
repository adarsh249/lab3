import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input2);

    int[] input3 = {80, 45, 67, 12, 14, 16};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{16, 14, 12, 67, 45, 80}, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {5, 4, 3, 2, 1};
    assertArrayEquals(new int[]{ 1, 2, 3, 4, 5},  ArrayExamples.reversed(input2));
  }

  @Test
  public void averageWithoutLowest(){
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);

    double[] input2 = {1, 2, 4};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input2), 0.0001);

  }
}
