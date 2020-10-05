package GoldManSachs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        map.put(1, 50);
        map.put(2, 40);
        map.put(3, 30);
        map.put(4, 60);
        map.put(5, 60);

        int key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(key);
	}

}
