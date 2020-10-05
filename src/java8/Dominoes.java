package java8;

/*Given a string with the initial condition of dominoes, where:

. represents that the domino is standing still
L represents that the domino is falling to the left side
R represents that the domino is falling to the right side

Figure out the final position of the dominoes. If there are dominoes that get pushed on both ends, the force cancels out and that domino remains upright.

Example:
Input:  ..R...L..R.
Output: ..RR.LL..RR
*/

public class Dominoes {

	public static void main(String[] args) {
//		char[] input = {'.','.','R','.','.','.','L','.','.','R','.'};
		
//		for(char c : input) {
//			System.out.println(c);
//		}
//		int length = input.length;
//		int first =0;
//		int last = length-1;
//		for(int i=0;i<length;i++) {
//			if(input[i] == 'R' || input[i] == 'L') {
//				first = i;
//			}
//		}
//		
//		for(int i=length-1;i>=0;i--) {
//			if(input[i] == 'R' || input[i] == 'L') {
//				last = i;
//			}
//		}
//		
//		int Ls = 0;
//		int Rs = 0;
//		int dots = 0;
//		for(int i=0;i<length;i++) {
//			if(input[i] == 'R') {
//				Rs++;
//			}
//			if(input[i] == 'L') {
//				Ls++;
//			}
//			if(input[i] == '.') {
//				dots++;
//			}
//		}
		
		String inputStr = "..R....L..R.";
		String output = pushDominoes(inputStr);
		System.out.println(output);
	}
	
	public static String pushDominoes(String dominoes) {
        int N = dominoes.length();
        int[] indexes = new int[N+2];
        char[] symbols = new char[N+2];
        int len = 1;
        indexes[0] = -1;
        symbols[0] = 'L';

        for (int i = 0; i < N; ++i)
            if (dominoes.charAt(i) != '.') {
                indexes[len] = i;
                symbols[len++] = dominoes.charAt(i);
            }

        indexes[len] = N;
        symbols[len++] = 'R';

        char[] ans = dominoes.toCharArray();
        for (int index = 0; index < len - 1; ++index) {
            int i = indexes[index], j = indexes[index+1];
            char x = symbols[index], y = symbols[index+1];
            if (x == y) {
                for (int k = i+1; k < j; ++k)
                    ans[k] = x;
            } else if (x > y) { // RL
                for (int k = i+1; k < j; ++k)
                    ans[k] = k-i == j-k ? '.' : k-i < j-k ? 'R' : 'L';
            }
        }

        return String.valueOf(ans);
    }

}
