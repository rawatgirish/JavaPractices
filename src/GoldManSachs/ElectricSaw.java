package GoldManSachs;
//// import java.io.*;
//// import java.util.*;
//// 
//// /*
////  * To execute Java, please define "static void main" on a class
////  * named Solution.
////  *
////  * If you need more classes, simply define them inline.
////  */
//// 
//// // [ 15 , 17, 19 , 10] - Height of a tree
//// // x amount wood to be be cut from tree
//// // Electric saw set 15 ( 2, 4 ) = 6 
//// // Given x amount of wood, 
//// 
//// // Saw = min[heightTree] = 10 > woodReqd
//// // 9 > 
//// // saw <= woodReq
//// // height = 1 + 1 + 1 +1 = 4
//// // tree[14, 16, 18, 9]
//// // S
//// 
//// /*
//// 
//// | 
//// | |
//// | | |
//// | | |
//// 
//// 
//// // [ 15 , 17, 19 , 10] 
//// // saw = 0
//// // 
//// 
//// 
//// // [
//// 
//// class Solution {
////   
////   public int getMinHeightSetting(List<Integer> treeHeights, int woodRequired ) {
////     int height= 0;
////     int saw = 0;
////     for(int i=0;i<treeHeights.size();i++) {
////       saw++;
////       if(treeHeights.get(i) > saw) {
////          height = height + saw; 
////       }
////       if(height < woodRequired) {
////         height = saw + getMinHeightSetting(treeHeights, woodRequired);
////       } else {
////         break;
////       }
////       
////     }
////     return saw;
////   }
////   
////   public static void main(String[] args) {
////     ArrayList<String> strings = new ArrayList<String>();
////     strings.add("Hello, World!");
////     strings.add("Welcome to CoderPad.");
////     strings.add("This pad is running Java " + Runtime.version().feature());
//// 
////     for (String string : strings) {
////       System.out.println(string);
////     }
////   }
//// }
//// */
//


public class ElectricSaw {

}
