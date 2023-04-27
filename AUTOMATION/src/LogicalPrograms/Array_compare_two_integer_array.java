package LogicalPrograms;

import java.util.Arrays;

public class Array_compare_two_integer_array {
	
	public static void main(String[] args) {
		int arr1[] = {10,20,30};
		int arr2[] = {40,50,60};
		int arr3[] = {10,20,30};
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
		
		System.out.println(Arrays.deepEquals(args, args));//used to compare two multidimentional arrays
	}

}
