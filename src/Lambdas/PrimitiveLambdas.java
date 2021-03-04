package Lambdas;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {

	public static void main(String[] args) {
		IntSupplier supplier = () -> 10;
		int i = supplier.getAsInt();
		System.out.println("i : " +i);
		
		DoubleToIntFunction function = d -> (int) Math.floor(d);
		System.out.println("Pi : "+function.applyAsInt(Math.PI));

	}

}
