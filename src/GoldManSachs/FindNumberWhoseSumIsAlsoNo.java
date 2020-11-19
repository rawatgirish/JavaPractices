package GoldManSachs;

public class FindNumberWhoseSumIsAlsoNo {

	public static void main(String[] args) {
		System.out.println(maxNo(10));
	}
	
	public static int maxNo (int input) {
		int x=-1;
			
		for(int i=input;i<Integer.MAX_VALUE;i+=input) {
			if(i % input == 0) {
				int sum=0;
				int n=i;
				while (n!= 0) {
					sum = sum + n%10;
					n = n/10;
				}
				
				if(sum == input && i != input) {
					return i;
				}
			}
		}
		return x;
	}

}


/* abcd * 4 = dcba 
 * 2499 * 4 
 * 1 or 2
 * a == 2
 * 
 * 2 bc 8 * 4 = 8cb2
 *  
 *  
 *  
 *  //abcd * 4  = dcba
//>2500 * 4
// 2 b c d(4,6,8 ==> 8)
//2 b c 8
//2 1 7 8
//8 7 1 2
// 4   
//<99 
//1234 * 4 = 4321
 * */
 