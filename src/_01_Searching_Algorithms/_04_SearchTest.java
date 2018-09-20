package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] words = { "hello", "my", "name", "is", "Tygan" };
		String value = "yes";
		String value2 = "hello";
		String value3 = "tYgAn";
		assertEquals(-1, _00_LinearSearch.linearSearch(words, value));
		assertEquals(0, _00_LinearSearch.linearSearch(words, value2));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, value3));

	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] ints = { 1, 2, 3, 4, 5 };
		int value = 3;
		int value2 = 6;
		int value3 = 5;
		assertEquals(2, _01_BinarySearch.binarySearch(ints, 0, ints.length - 1, value));
		assertEquals(-1, _01_BinarySearch.binarySearch(ints, 0, ints.length - 1, value2));
		assertEquals(4, _01_BinarySearch.binarySearch(ints, 0, ints.length - 1, value3));
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] ints = { 1, 2, 3, 4, 5 };
		int value = 3;
		int value2 = 6;
		int value3 = 5;
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(ints, value));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(ints, value2));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(ints, value3));
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] ints = { 1, 2, 3, 4, 5 };
		int value = 3;
		int value2 = 2;
		int value3 = 5;
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(ints, value));
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(ints, value2));
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(ints, value3));
	}
}
