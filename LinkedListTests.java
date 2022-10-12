import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
	@Test
	public void testAppend() {
		LinkedList linkedlist1 = new LinkedList();
		linkedlist1.append(4);
		linkedlist1.append(5);
		linkedlist1.append(6);
		linkedlist1.append(7);
		String testString = "4 5 6 7";
		assertEquals(testString,linkedlist1.toString());
		
	}
}