import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests {
	@Test 
	public void testReverseInPlace() {
		ArrayList<String> first = new ArrayList<String>();
		ArrayList<String> second = new ArrayList<String>();
		first.add("A");
		second.add("B");
		first.add("C");
		second.add("D");
		
		ArrayList<String> test = new ArrayList<String>();
		test.add("A");
		test.add("B");
		test.add("C");
		test.add("D");
		assertEquals(test, ListExamples.merge(first, second));
	}
}