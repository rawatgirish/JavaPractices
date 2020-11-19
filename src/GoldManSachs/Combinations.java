package GoldManSachs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
//		List<int[]> combinations = generate(N, R);
//		for (int[] combination : combinations) {
//		    System.out.println(Arrays.toString(combination));
//		}
//		System.out.printf("generated %d combinations of %d items from %d ", combinations.size(), R, N);
		String arr[] = {"Rohit", "DeCock", "Warner", "Bairstow", "Pandey", "Williamson", "Yadav", "Kishan", "Pandya", "Pollard"};
		System.out.println("Input player's count : " +arr.length);
        int r = 2; 
        int n = arr.length; 
        printCombination(arr, n, r);
	}
	
	public List<int[]> generate(int n, int r) {
	    List<int[]> combinations = new ArrayList<>();
	    helper(combinations, new int[r], 0, n-1, 0);
	    return combinations;
	}
	
	private static void helper(List<int[]> combinations, int data[], int start, int end, int index) {
	    if (index == data.length) {
	        int[] combination = data.clone();
	        combinations.add(combination);
	    } else if (start <= end) {
	        data[index] = start;
	        helper(combinations, data, start + 1, end, index + 1);
	        helper(combinations, data, start + 1, end, index);
	    }
	}
	
	/* arr[]  ---> Input Array 
    data[] ---> Temporary array to store current combination 
    start & end ---> Staring and Ending indexes in arr[] 
    index  ---> Current index in data[] 
    r ---> Size of a combination to be printed */
    static void combinationUtil(String[] arr, String data[], int start, 
                                int end, int index, int r) 
    { 
        // Current combination is ready to be printed, print it 
        if (index == r) 
        { 
            for (int j=0; j<r; j++) 
                System.out.print(data[j]+" "); 
            System.out.println(""); 
            return; 
        } 
  
        // replace index with all possible elements. The condition 
        // "end-i+1 >= r-index" makes sure that including one element 
        // at index will make a combination with remaining elements 
        // at remaining positions 
        for (int i=start; i<=end && end-i+1 >= r-index; i++) 
        { 
            data[index] = arr[i]; 
            combinationUtil(arr, data, i+1, end, index+1, r); 
        } 
    } 
  
    // The main function that prints all combinations of size r 
    // in arr[] of size n. This function mainly uses combinationUtil() 
    static void printCombination(String[] arr, int n, int r) 
    { 
        // A temporary array to store all combination one by one 
    	String data[]=new String[r]; 
  
        // Print all combination using temprary array 'data[]' 
        combinationUtil(arr, data, 0, n-1, 0, r); 
    } 
	
	

}
