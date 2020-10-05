/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author girish.rawat
 *
 */
public class StreamLargestPossibleNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("10", "68", "97", "9", "21", "12");
		Collections.sort(numbers,(a,b) -> (b+a).compareTo(a+b));
		numbers.stream().forEach(System.out::print);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(10);
		System.out.println("size : " + list2.size());
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(1, 2);
		System.out.println(list);
	}

}
