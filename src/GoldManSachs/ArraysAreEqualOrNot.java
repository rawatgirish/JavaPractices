package GoldManSachs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author girish.rawat
 * 
 *         Given two given arrays of equal length, the task is to find if given
 *         arrays are equal or not. Two arrays are said to be equal if both of
 *         them contain same set of elements, arrangements (or permutation) of
 *         elements may be different though.
 *         
 *         Input  : arr1[] = {1, 2, 5, 4, 0};
         arr2[] = {2, 4, 5, 0, 1}; 
		Output : Yes

		Input  : arr1[] = {1, 2, 5, 4, 0, 2, 1};
		         arr2[] = {2, 4, 5, 0, 1, 1, 2}; 
		Output : Yes

		Input : arr1[] = {1, 7, 1};
		        arr2[] = {7, 7, 1};
		Output : No
 *
 */
public class ArraysAreEqualOrNot {

	public static void main(String[] args) {
		int arr1[] = { 3, 5, 2, 5, 2 }; 
		int arr2[] = { 2, 3, 5, 5, 2 }; 
		
//		int arr1[] = {1, 7, 1};
//        int arr2[] = {7, 7, 1};

		if (areEqual(arr1, arr2)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
		
		if (areEqualWithMap(arr1, arr2)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	}

	private static boolean areEqualWithMap(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		if(m != n) {
			return false;
		}
		Map<Integer,Integer> countMap = new HashMap<Integer, Integer>();
		for(int i=0;i<m;i++) {
			if(countMap.containsKey(arr1[i])) {
				countMap.put(arr1[i], countMap.get(arr1[i]) + 1);
			} else {
				countMap.put(arr1[i], 1);
			}
		}
		
		for(int i = 0;i<n;i++) {
			if(!countMap.containsKey(arr2[i])) {
				return false;
			}
			if(countMap.get(arr2[i]) == 0) {
				return false;
			}
			
			countMap.put(arr2[i], countMap.get(arr2[i]) - 1);
		}
		return true;
	}

	private static boolean areEqual(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		if(m != n) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i =0; i < m ;i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	} 

}

