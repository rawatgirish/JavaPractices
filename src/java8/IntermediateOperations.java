/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author girish.rawat
 *
 */
public class IntermediateOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(5);
		System.out.println("List before : " +list);
		List<Integer> list2 = list.stream().filter(i -> i >= 4).collect(Collectors.toList());
		System.out.println("List after : " +list);
		System.out.println("Filtered list after : " +list2);
	}

}
