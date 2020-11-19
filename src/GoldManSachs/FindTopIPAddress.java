package GoldManSachs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author girish.rawat There is a audit log file for which gave the logs in
 *         following format, everytime one person hits the url. 10.0.0.1 -
 *         Mumbai, - Windown XP (2020-09-12 08.12.12.000) ,cksnds. Initial
 *         Access.
 * 
 *         Each line have one IP address associated with it. You need to find
 *         the ip address from which the site is accessed maximum no of times.
 *
 */
public class FindTopIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Names = { "ravi", "manoj", "ravi", "rahul", "rahul", "ravi", "manoj", "rahul", "rahul" };
		Map<String,Integer> hashMap = new HashMap<>();
		Optional<Entry<String, Integer>> findFirst = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(1).findAny();
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get().getKey());
		}
		System.out.println(getTopName(Names));
	}

	public static String getTopName(String[] names) {

		int counter = 0;
		String Maxname = null;

		for (int i = 0; i < names.length - 1; i++) { // second last
			String currentName = names[i];
			int currCounter = 0;

			for (int j = i + 1; j < names.length; j++) {
				if (currentName.equals(names[j])) {
					currCounter++;
				}
			}
			if (currCounter > counter) {
				counter = currCounter;
				Maxname = currentName;
			}
		}

		return Maxname;
	}

}
