package GoldManSachs;

import java.util.Random;

public class RollDice {

	private int roll() {
		return new Random().nextInt(6) + 1 ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	RollDice rd = new RollDice();
	for(int i=0;i<10;i++)
	System.out.println(rd.roll());

	}

}
