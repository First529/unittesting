package testinglab;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListUtilTest {

	@Test
	public void testEmptyList() {
		List<?> list = new ArrayList<>();
		assertEquals(0, ListUtil.countUnique(list));
	}

	@Test
	public void testListSizeOne() {
		assertEquals(1, ListUtil.countUnique(makeList("one")));

	}

	@Test
	public void testHugeList() {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10_000; i++) {
			list.add(i);
		}
		assertEquals(10_000, ListUtil.countUnique(list));
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testNullValue() {
		assertNull(ListUtil.countUnique(null));
	}

	@Test
	public void testListOfTwoItemsManyOrders() {
		assertEquals(2, ListUtil.countUnique(makeList("a", "b")));
		assertEquals(2, ListUtil.countUnique(makeList("a", "a", "a", "b", "b", "a", "b", "a")));
	}

	private List<?> makeList(Object... elements) {
		return java.util.Arrays.asList(elements);
	}

}
