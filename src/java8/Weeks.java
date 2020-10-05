package java8;

import java.util.ArrayList;
import java.util.List;

public class Weeks {
	public static void main(String[] args) {
		int broadcastWeek =13;
		List<Integer> weeks = new ArrayList<Integer>();
		for(int i =0;i<13;i++) {
			weeks.add(i);
		}
//		int size = weeks.size();
//		int counter = 0;
//		System.out.println(Double.valueOf(null));
//		while(counter < size) {
//			if(counter + broadcastWeek > size) {
//				System.out.println("week start : " + weeks.get(counter));
//				System.out.println("week end : " + weeks.get(size -1));
//			} else if(counter >= broadcastWeek) {
//				System.out.println("week start : " + weeks.get(counter));
//				System.out.println("week end : " + weeks.get(counter + broadcastWeek -1));
//			} else {
//				System.out.println("week start : " + weeks.get(0));
//				System.out.println("week end : " + weeks.get(broadcastWeek -1));
//			}
//			counter = counter + broadcastWeek;
//		}
//		if(size >= broadcastWeek) {
//			while(size/broadcastWeek > 0) {
//				System.out.println("week end : " + weeks.get(size-1));
//				System.out.println("week start : " + weeks.get(size - broadcastWeek));
//				size = size - broadcastWeek;
//				if(size <= broadcastWeek) {
//					
//					System.out.println("week end : " + weeks.get(size-1));
//					System.out.println("week start : " + weeks.get(0));
//				}
//			}
//		} else {
//			System.out.println("week end : " + weeks.get(size-1));
//			System.out.println("week start : " + weeks.get(0));
//		}
//		
		//System.out.println(size / broadcastWeek);
		//while(size % broadcastWeek < 13)
	
		Long startDateKey = 20200127l;
		Long endLocalDateKey = 20200202l;
		
		if(20200202l >= startDateKey && 20200202l <= endLocalDateKey) {
			System.out.println("Helloasdasd");
		}
		
		Double d = new Double(-1.0);
		System.out.println(d);
		if(-1.0 == d) {
			System.out.println("equal");
		}
		
		List<Integer> listInt = new ArrayList<>();
		listInt.add(2);
		//int max=0;
		//listInt.forEach(i ->int max = i);
		listInt.stream().filter(x-> x>1);
	}
	
	
	

}
