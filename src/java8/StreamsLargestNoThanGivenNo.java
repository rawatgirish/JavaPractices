/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * @author girish.rawat
 *
 */
public class StreamsLargestNoThanGivenNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int next = sc.nextInt();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(7);
		myList.add(8);
		myList.add(6);
		Collections.sort(myList);
		System.out.println(myList);
		
		Optional<Integer> max2 = myList.stream().max(Integer::compare);
		System.out.println(max2);
		Optional<Integer> findFirst = myList.stream().findFirst();
		Integer max = myList.stream().sorted().filter(x -> x < next).mapToInt(x -> x).max().getAsInt();
		Integer integer = myList.stream().filter(i -> i<8).max(Integer::compare).get();
		//Integer max = myList.stream().max(Comparator.comparing(Integer::valueOf<4)).get();
		System.out.println("Max no in list below "+next + " is : " + max);
		System.out.println(integer);
	}

}
