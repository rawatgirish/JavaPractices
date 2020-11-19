package GoldManSachs;


//given the list of integers, we want to find the max(k) such that at lease k elements in the list are greater than or equal to k.
//[3,3,3] = 3
//[1,1,1,1,1,1,1,1,1,1] = 1


/*
 * Click `Run` to execute the snippet below!
 */
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

//Given a list of integers, we want to find ma(k) such that at least k elements in the list are greater than or equal k
// [1, 2, 3, 1, 3, 4] = 3
// [3, 3, 3] = 3
// [1,1,1,1,1,1,1,1,1,1] = 1
// map<integer, integer> [3,2], [2,4], [3, 3],[4,1]
// 3, count++ = 3
// [3, 3] = 2
// map <3, 2>
// [2,2,3,3]
// 3 =  2 -> 2 =  4
//
// [1,6]
// [3,2]
// map.values().size() = 2
// map.values().maxOfValues().key();

//class Solution {
//  
//  public static int getMaxK(List<Integer> elements) {
//    Map<Integer, List<Integer>> freqMap = new HashMap<>();
//    for(int i : elements) {
//      if(freqMap.contains(i)) {
//        freqMap.put(i,freqMap.get(i) +1);
//      } else {
//        freqMap.put(i,1);
//      }
//    }
//    return freqMap.values().stream().mapToInt(x->x).max().getAsInt;
//   }
//  public static void main(String[] args) {
//    ArrayList<String> strings = new ArrayList<String>();
//    strings.add("Hello, World!");
//    strings.add("Welcome to CoderPad.");
//    strings.add("This pad is running Java " + Runtime.version().feature());
//
//    for (String string : strings) {
//      System.out.println(string);
//    }
//  }
//}

public class FindTheNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
