import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverse() {
    int[] a = {3, 1, 5};
    assertArrayEquals(new int[]{5, 1, 3}, ArrayExamples.reversed(a));
  }

  @Test
  public void testReverseInPlace2() {
    int[] a = {3, 1, 5};
    ArrayExamples.reverseInPlace(a);
    assertArrayEquals(new int[]{5, 1, 3}, a);
  }
}
