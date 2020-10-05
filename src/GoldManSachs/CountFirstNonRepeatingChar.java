package GoldManSachs;

import java.util.HashMap;
import java.util.Map;

/**
 * @author girish.rawat
 * 
 *         Given a string, find the first non-repeating character in it. For
 *         example, if the input string is “GeeksforGeeks”, then the output
 *         should be ‘f’ and if the input string is “GeeksQuiz”, then the output
 *         should be ‘G’.
 *
 */
public class CountFirstNonRepeatingChar {
	//static int max_char = 256;
	//static char count[] = new char[max_char];
	static Map<Character,Integer> countMap = new HashMap<Character, Integer>();
	public static void main(String[] args) {
		String input = "teserintstring";
		int index = getIndex(input);
		if(index == -1) {
			System.out.println("Not any element which is non repeating.");
		} else {
			System.out.println("First non repeating : " + input.charAt(index));
		}

	}
	
	private static int getIndex(String str) {
		int index = -1;
		getCharacterCount(str);
		for(int i =0 ; i<str.length();i++) {
			if(countMap.get(str.charAt(i)) ==1) {
				index = i;
				break;
			}
		}
		return index;
	}

	private static void getCharacterCount(String str) {
		for(int i =0; i<str.length(); i++) {
			if(countMap.containsKey(str.charAt(i))) {
				countMap.put(str.charAt(i), countMap.get(str.charAt(i)) + 1);
			} else {
				countMap.put(str.charAt(i),1);
			}
		}
	}

}
