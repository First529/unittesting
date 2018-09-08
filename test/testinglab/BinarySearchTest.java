package testinglab;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {
	
	@Test
	public void testEmptyArray() {
		Integer[] a = new Integer[] {};
		assertEquals( -1, BinarySearch.binarySearch(a, 10));
	}
	
	
	@Test
	public void testArrayWithOneElement() {
		Double[] d = new Double[] { 1.0 };
		assertEquals( 0, BinarySearch.binarySearch(d, 1.0));
	}
	
	@Test
	public void testArrayWithDuplicate() {
		String[] s = new String[] {"Apple", "Banana", "Banana", "Melon", "Pineapple", "Pineapple", "Pineapple"};
		assertEquals( 4, BinarySearch.binarySearch(s, "Pineapple"));
		
	}
	
	@Test
	public void testHugeArray() {
		Integer[] a = new Integer[10_000];
		for (int i = 0; i < 10_000; i++) {
			a[i] = i;
		}
		
		assertEquals( 8888, BinarySearch.binarySearch(a, 8888));
	}
	
	@Test
	public void testElementNotInArray() {
		Double[] d = new Double[] {1.0001, 5.2, 9.6662, 8.452};
		assertEquals( -1, BinarySearch.binarySearch(d, 1.001));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNullElement() {
		String[] s = new String[] {null, null};
		BinarySearch.binarySearch(s, null);
	}
	

}
