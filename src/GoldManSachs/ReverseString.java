package GoldManSachs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter T : ");
		int wordCount = sc.nextInt();
		if(wordCount < 1 || wordCount > 100) {
			System.out.println("Invalid word count. Exiting...");
			System.exit(0);
		}
		List<String> inputList = new ArrayList<String>();
		String inputStr;
		for(int i=1;i<=wordCount;i++) {
			System.out.print("Enter string no " +i+" to reverse : ");
			inputStr = sc.next();
			if(inputStr.length() < 1 || inputStr.length() > 2000) {
				System.out.println("Inavlid length input. Continuing...");
			} else {
				inputList.add(inputStr);
			}
		}
		
		if(inputList.size() == 0 ) {
			System.out.println("No valid input recievied. Exiting...");
			System.exit(0);
		}
		System.out.println("Input list : " + inputList);
		List<String> outputList = getReverseList(inputList);
		System.out.println("Reversed Output list : " + outputList);
		
	}

	private static List<String> getReverseList(List<String> inputList) {
		List<String> outputList = new ArrayList<>(inputList.size());
		for(String s : inputList) {
			String[] splitStr = s.split("\\.");
			int length = splitStr.length;
			StringBuilder builder = new StringBuilder();;
			for(int i = length-1;i>=0;i--) {
				builder.append(splitStr[i]);
				if(i!=0) {
					builder.append(".");
				}
			}
			outputList.add(builder.toString());
		}
		return outputList;
	}

}
