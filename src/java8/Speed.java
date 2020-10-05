package java8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Speed {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> link = new LinkedList<Integer>();
		long start = System.currentTimeMillis();
		for(int i =0; i<1000000;i++) {
			myList.add(i);
		}
		System.out.println(System.currentTimeMillis() - start);
		start = System.currentTimeMillis();
		for(int i =0; i<1000000;i++) {
			link.add(i);
		}
		System.out.println(System.currentTimeMillis() - start);
		
		
		Random r = new Random();
		int nextInt = r.nextInt();
		while(nextInt > 1000000 || nextInt < 0) {
			nextInt = r.nextInt();
		}
		
		System.out.println("nextInt " + nextInt);
		System.out.println("Get : ");
		start = System.currentTimeMillis();
		Integer integer = myList.get(nextInt);
		System.out.println(System.currentTimeMillis() - start);
		
		start = System.currentTimeMillis();
		Integer integer2 = link.get(nextInt);
		System.out.println(System.currentTimeMillis() - start);
		
		System.out.println("Remove : ");
		start = System.currentTimeMillis();
		myList.remove(nextInt);
		System.out.println(System.currentTimeMillis() - start);
		
		start = System.currentTimeMillis();
		link.remove(nextInt);
		System.out.println(System.currentTimeMillis() - start);
		
		
	}

}
