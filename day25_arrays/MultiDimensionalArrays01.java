package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {

		int arr[][] = { { 1, 3, 5 }, { 3, 5 }, { 5, 9, 11, 3 } };
		
		System.out.println(Arrays.toString(arr));
		
		int arr2[][] = new int [3][2];
		
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(Arrays.deepToString(arr2));

	}

}
