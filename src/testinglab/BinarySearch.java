package testinglab;

/**
 * Binary search is one of the fastest method out there.
 * @author Dechabhol Kotheeranurak
 *
 */

public class BinarySearch {
	
	/**
	 * Search for an element in the array, by
	 * reduce the length of the array by half. 
	 * Where the array has already sorted.
	 * 
	 * 
	 * @param array
	 * @param element
	 * @return index of the element in an array or -1
	 */
	public static <T extends Comparable<? super T>> int binarySearch(T[] array, T element) {
		// base case
		if (element == null) throw new IllegalArgumentException("Search element must not be null");
		if (array.length == 0) return -1;
		
		int low = 0, mid = 1, high = array.length - 1;
		boolean check = true;
		while (check) {
			mid = (high + low) / 2;
			int compareElements = element.compareTo(array[mid]);
			if (compareElements == 0) {
				check = false;
				return mid;
			}
			else if (compareElements < 0) high = mid;
			else low = mid;
			
			if (mid == (high + low) / 2) check = false;
			
		}
		return -1;
		
	}

}
