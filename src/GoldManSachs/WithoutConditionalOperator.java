package GoldManSachs;

public class WithoutConditionalOperator {

	private char revers(char input) {
		char sum = 'x' + 'y';
		return (char) (sum - input);
	}
	public static void main(String[] args) {
		System.out.println(new WithoutConditionalOperator().revers('x'));
	}
}
